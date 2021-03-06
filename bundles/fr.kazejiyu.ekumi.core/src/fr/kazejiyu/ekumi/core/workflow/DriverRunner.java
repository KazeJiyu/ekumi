/**
 */
package fr.kazejiyu.ekumi.core.workflow;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getDriverRunner()
 * @model abstract="true"
 * @generated
 */
public interface DriverRunner extends RunnableScript {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Driven</b></em>' reference.
	 * @return the value of the '<em>Driven</em>' reference.
	 * @see #setDriven(Activity)
	 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getDriverRunner_Driven()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Activity getDriven();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.workflow.DriverRunner#getDriven <em>Driven</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driven</em>' reference.
	 * @see #getDriven()
	 * @generated
	 */
	void setDriven(Activity value);

} // DriverRunner
