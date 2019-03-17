package fr.kazejiyu.ekumi.workflow.editor.design;

import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.model.EKumiExtensions;
import fr.kazejiyu.ekumi.model.datatypes.DataType;
import fr.kazejiyu.ekumi.model.spec.SpecFactory;
import fr.kazejiyu.ekumi.model.spec.Variable;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A DatatypeServices")
public class DatatypeServicesTest implements WithAssertions {

	// Object to test
	DatatypeServices services;
	Variable variable;
	
	@BeforeEach
	void setup() {
		services = new DatatypeServices();
		variable = SpecFactory.eINSTANCE.createVariable();
	}
	
	@Test @DisplayName("knows the name of a type")
	void knows_the_name_of_a_type(@Mock DataType<String> type) {
		when (type.getName()) .thenReturn("String");
		assertThat(services.name(type)).isEqualTo("String");
	}
	
	@ParameterizedTest 
	@MethodSource("emptyTypeId")
	@DisplayName("does not know the type of a variable without a typeId")
	void does_not_know_the_type_of_a_variable_without_a_typeId(String typeId) {
		variable.setTypeId(typeId);
		
		assertThat(services.getDatatype(variable)).isNull();
	}
	
	@Test @DisplayName("can set the type of a variable")
	void can_set_the_type_of_a_variable(@Mock DataType<String> type) {
		when (type.getId()) .thenReturn ("type.of.String");
		
		services.setDatatype(variable, type);
		
		assertThat(variable.getTypeId()).isEqualTo("type.of.String");
	}
	
	@SuppressWarnings("unused") // called by @MethodSource
	private static Stream<String> emptyTypeId() {
		return Stream.of("", null);
	}
	
	@Nested @DisplayName("when asked for the type of a variable")
	class WhenAskedForTheTypeOfAVariable {
		
		private DataType<String> stringType;

		@SuppressWarnings("unchecked")
		@BeforeEach
		void setup(@Mock IExtensionRegistry extensions) throws CoreException {
			// Create datatypes
			
			stringType = Mockito.mock(DataType.class);
			when (stringType.getId()) .thenReturn ("type.string");
			
			// Create configuration elements
			
			IConfigurationElement stringConfiguration = Mockito.mock(IConfigurationElement.class);
			when (stringConfiguration.createExecutableExtension("class")) .thenReturn(stringType);
			
			// should be ignored by the adapter
			IConfigurationElement nullConfiguration = Mockito.mock(IConfigurationElement.class);
			when (nullConfiguration.createExecutableExtension("class")) .thenReturn(null);
			
			// should be ignored as well
			IConfigurationElement throwingConfiguration = Mockito.mock(IConfigurationElement.class);
			when (nullConfiguration.createExecutableExtension("class")) .thenThrow(CoreException.class);
			
			IConfigurationElement configurationElements[] = new IConfigurationElement[] {
				stringConfiguration, nullConfiguration, throwingConfiguration
			};
			
			when (extensions.getConfigurationElementsFor(EKumiExtensions.DATATYPES_EXTENSION_ID))
				.thenReturn(configurationElements);
			services.setExtensionRegistry(extensions);
		}
		
		@Test @DisplayName("finds the type if it exists")
		void finds_the_type_if_it_exists() {
			variable.setTypeId(stringType.getId());
			assertThat (services.getDatatype(variable)) .isEqualTo(stringType);
		}
		
		@Test @DisplayName("returns null if the type does not exist")
		void returns_null_if_the_type_does_not_exist() {
			variable.setTypeId("shgdshkfs");
			assertThat (services.getDatatype(variable)).isNull();
		}
		
	}
	
}
