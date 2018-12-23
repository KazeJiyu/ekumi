package fr.kazejiyu.ekumi.debug;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.Execution;

/**
 * <p>Executes a given {@link Activity}</p>
 * 
 * <p>In order to be executed, an Activity must belong to a {@link Resource}
 * and the resource's URI must be specified in the {@link ILaunchConfiguration configuration}
 * with an attribute called {@value EKumiRunConfiguration#EKUMI_MODEL_URI}
 */
public final class RunWorkflow extends LaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		String uri = configuration.getAttribute(EKumiRunConfiguration.EKUMI_MODEL_URI, "");
		
		if (uri.isEmpty())
			// TODO log error
			return;
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(uri));
		
		try {
			resource.load(Collections.emptyMap());
			
			Activity activity = (Activity) resource.getContents().get(0);
			
			Execution execution = EkumiFactory.eINSTANCE.createExecution();
			execution.setActivity(activity);
			execution.start();
			
		} catch (IOException e) {
			// TODO Process exception properly
			e.printStackTrace();
		}
	}

}
