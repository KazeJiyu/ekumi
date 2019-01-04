package fr.kazejiyu.ekumi.model.execution.listeners;

import fr.kazejiyu.ekumi.model.workflow.Activity;

/**
 * An object that listens for the status of an {@link Activity} to change. 
 */
public interface ActivityListener extends OnActivityStarted,
										  OnActivitySucceeded,
										  OnActivityFailed {

	@Override
	default void onActivityFailed(Activity failed) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onActivitySucceeded(Activity succeeded) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onActivityStarted(Activity started) {
		// in case the implementing class is not interested in this event
	}

}