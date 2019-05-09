/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow;

import java.util.Optional;

/**
 * 
 */
public interface Activity extends Identifiable, Task, HasState {

	/**
	 * Returns the variables required by the activity.
	 * @return the inputs of the activity
	 */
	Inputs inputs();
	
	/**
	 * Returns a specific input.
	 * 
	 * @param name 
	 * 			The name of the input to look for.
	 * 
	 * @return the input called name
	 * 
	 * @throws DataNotFoundException if no input with the given name can be found
	 */
	default Input input(String name) {
		return inputs().get(name);
	}
	
	/**
	 * Binds an input of this to a given output.
	 * <p>
	 * The consequence is that, when the activity is started,
	 * the specified input is {@link Input#resolve() resolved}
	 * 
	 * @param inputName
	 * @param output
	 */
	default void bind(String inputName, Output output) {
		inputs().get(inputName).bind(output);
	}
	
	/**
	 * Returns the variables produced by the activity.
	 * @return the outputs of the activity
	 */
	Outputs outputs();
	
	default Output output(String name) {
		return outputs().get(name);
	}

	/**
	 * Returns the activity that should be executed before this one.
	 * @return the activity that precedes this one, if any
	 */
	Optional<Activity> predecessor();
	
	/**
	 * Returns {@code true} if this is the predecessor of the given activity,
	 * {@code false} otherwise.
	 * 
	 * @param activity
	 * 			The activity to check.
	 * 
	 * @return whether this is the predecessor of the given activity
	 */
	default boolean precedes(Activity activity) {
		return successor().map(predecessor -> predecessor.equals(activity))
  						  .orElse(false);
	}

	void precede(Activity predecessor);

	/**
	 * Returns the activity that should be executed after this one.
	 * @return the activity that succeeds to this one, if any
	 */
	Optional<Activity> successor();

	/**
	 * Returns {@code true} if this is the successor of the given activity,
	 * {@code false} otherwise.
	 * 
	 * @param activity
	 * 			The activity to check.
	 * 
	 * @return whether this is the successor of the given activity
	 */
	default boolean succeeds(Activity activity) {
		return predecessor().map(successor -> successor.equals(activity))
 						    .orElse(false);
	}
	
	void succeed(Activity successor);

}
