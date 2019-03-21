/**
 */
package fr.kazejiyu.ekumi.core.workflow.gen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Driver;
import fr.kazejiyu.ekumi.core.workflow.DriverRunner;
import fr.kazejiyu.ekumi.core.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverImpl#getDriven <em>Driven</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriverImpl extends ActivityImpl implements Driver {
	/**
	 * The cached value of the '{@link #getDriven() <em>Driven</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriven()
	 * @generated
	 * @ordered
	 */
	protected Activity driven;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected DriverRunner script;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getDriven() {
		return driven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriven(Activity newDriven, NotificationChain msgs) {
		Activity oldDriven = driven;
		driven = newDriven;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.DRIVER__DRIVEN, oldDriven, newDriven);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriven(Activity newDriven) {
		if (newDriven != driven) {
			NotificationChain msgs = null;
			if (driven != null)
				msgs = ((InternalEObject) driven).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.DRIVER__DRIVEN, null, msgs);
			if (newDriven != null)
				msgs = ((InternalEObject) newDriven).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.DRIVER__DRIVEN, null, msgs);
			msgs = basicSetDriven(newDriven, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DRIVER__DRIVEN, newDriven,
					newDriven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverRunner getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(DriverRunner newScript, NotificationChain msgs) {
		DriverRunner oldScript = script;
		script = newScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.DRIVER__SCRIPT, oldScript, newScript);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(DriverRunner newScript) {
		if (newScript != script) {
			NotificationChain msgs = null;
			if (script != null)
				msgs = ((InternalEObject) script).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.DRIVER__SCRIPT, null, msgs);
			if (newScript != null)
				msgs = ((InternalEObject) newScript).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.DRIVER__SCRIPT, null, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DRIVER__SCRIPT, newScript,
					newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.DRIVER__DRIVEN:
			return basicSetDriven(null, msgs);
		case WorkflowPackage.DRIVER__SCRIPT:
			return basicSetScript(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.DRIVER__DRIVEN:
			return getDriven();
		case WorkflowPackage.DRIVER__SCRIPT:
			return getScript();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkflowPackage.DRIVER__DRIVEN:
			setDriven((Activity) newValue);
			return;
		case WorkflowPackage.DRIVER__SCRIPT:
			setScript((DriverRunner) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WorkflowPackage.DRIVER__DRIVEN:
			setDriven((Activity) null);
			return;
		case WorkflowPackage.DRIVER__SCRIPT:
			setScript((DriverRunner) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WorkflowPackage.DRIVER__DRIVEN:
			return driven != null;
		case WorkflowPackage.DRIVER__SCRIPT:
			return script != null;
		}
		return super.eIsSet(featureID);
	}

} //DriverImpl