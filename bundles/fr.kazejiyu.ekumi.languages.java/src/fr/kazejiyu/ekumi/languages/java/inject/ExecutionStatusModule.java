/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.languages.java.inject;

import static java.util.Objects.requireNonNull;

import com.google.inject.AbstractModule;

import fr.kazejiyu.ekumi.core.execution.ExecutionState;

/**
 * Allows injection of a specific {@link ExecutionState} instance.
 * 
 * @author Emmanuel CHEBBI
 */
public class ExecutionStatusModule extends AbstractModule {
	
	private final ExecutionState statusToInject;
	
	/**
	 * Creates a new module.
	 * 
	 * @param statusToInject
	 * 			The event bus to inject.
	 */
	public ExecutionStatusModule(ExecutionState statusToInject) {
		super();
		this.statusToInject = requireNonNull(statusToInject, "Cannot make a null execution status available for injection");
	}
	
	@Override
	protected void configure() {
		bind(ExecutionState.class).toInstance(statusToInject);
	}

}
