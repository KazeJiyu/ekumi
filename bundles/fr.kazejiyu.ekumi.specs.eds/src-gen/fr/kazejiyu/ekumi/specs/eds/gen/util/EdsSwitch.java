/**
 */
package fr.kazejiyu.ekumi.specs.eds.gen.util;

import fr.kazejiyu.ekumi.specs.eds.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.specs.eds.EdsPackage
 * @generated
 */
public class EdsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdsSwitch() {
		if (modelPackage == null) {
			modelPackage = EdsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EdsPackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = caseStartingNode(task);
			if (result == null)
				result = caseNode(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = caseTask(activity);
			if (result == null)
				result = caseStartingNode(activity);
			if (result == null)
				result = caseNode(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.START: {
			Start start = (Start) theEObject;
			T result = caseStart(start);
			if (result == null)
				result = caseNode(start);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.PARALLEL_SPLIT: {
			ParallelSplit parallelSplit = (ParallelSplit) theEObject;
			T result = caseParallelSplit(parallelSplit);
			if (result == null)
				result = caseDivergence(parallelSplit);
			if (result == null)
				result = caseStartingNode(parallelSplit);
			if (result == null)
				result = caseNode(parallelSplit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.EXTERNAL_TASK: {
			ExternalTask externalTask = (ExternalTask) theEObject;
			T result = caseExternalTask(externalTask);
			if (result == null)
				result = caseTask(externalTask);
			if (result == null)
				result = caseStartingNode(externalTask);
			if (result == null)
				result = caseNode(externalTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.LIBRARY_TASK: {
			LibraryTask libraryTask = (LibraryTask) theEObject;
			T result = caseLibraryTask(libraryTask);
			if (result == null)
				result = caseTask(libraryTask);
			if (result == null)
				result = caseStartingNode(libraryTask);
			if (result == null)
				result = caseNode(libraryTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.DIVERGENCE: {
			Divergence divergence = (Divergence) theEObject;
			T result = caseDivergence(divergence);
			if (result == null)
				result = caseStartingNode(divergence);
			if (result == null)
				result = caseNode(divergence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.CONVERGENCE: {
			Convergence convergence = (Convergence) theEObject;
			T result = caseConvergence(convergence);
			if (result == null)
				result = caseNode(convergence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.SYNCHRONIZATION: {
			Synchronization synchronization = (Synchronization) theEObject;
			T result = caseSynchronization(synchronization);
			if (result == null)
				result = caseConvergence(synchronization);
			if (result == null)
				result = caseNode(synchronization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.MULTI_CHOICE: {
			MultiChoice multiChoice = (MultiChoice) theEObject;
			T result = caseMultiChoice(multiChoice);
			if (result == null)
				result = caseConditionalDivergence(multiChoice);
			if (result == null)
				result = caseStartingNode(multiChoice);
			if (result == null)
				result = caseNode(multiChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.SIMPLE_MERGE: {
			SimpleMerge simpleMerge = (SimpleMerge) theEObject;
			T result = caseSimpleMerge(simpleMerge);
			if (result == null)
				result = caseConvergence(simpleMerge);
			if (result == null)
				result = caseNode(simpleMerge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.DATA_FLOWS: {
			DataFlows dataFlows = (DataFlows) theEObject;
			T result = caseDataFlows(dataFlows);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.DATA_FLOW: {
			DataFlow dataFlow = (DataFlow) theEObject;
			T result = caseDataFlow(dataFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.CONDITIONAL_DIVERGENCE: {
			ConditionalDivergence conditionalDivergence = (ConditionalDivergence) theEObject;
			T result = caseConditionalDivergence(conditionalDivergence);
			if (result == null)
				result = caseStartingNode(conditionalDivergence);
			if (result == null)
				result = caseNode(conditionalDivergence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.CONDITIONAL_ROOT: {
			ConditionalRoot conditionalRoot = (ConditionalRoot) theEObject;
			T result = caseConditionalRoot(conditionalRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = caseTask(condition);
			if (result == null)
				result = caseStartingNode(condition);
			if (result == null)
				result = caseNode(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdsPackage.STARTING_NODE: {
			StartingNode startingNode = (StartingNode) theEObject;
			T result = caseStartingNode(startingNode);
			if (result == null)
				result = caseNode(startingNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelSplit(ParallelSplit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalTask(ExternalTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryTask(LibraryTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergence(Divergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvergence(Convergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronization(Synchronization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiChoice(MultiChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleMerge(SimpleMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flows</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flows</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlows(DataFlows object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Divergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalDivergence(ConditionalDivergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalRoot(ConditionalRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Starting Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Starting Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartingNode(StartingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EdsSwitch
