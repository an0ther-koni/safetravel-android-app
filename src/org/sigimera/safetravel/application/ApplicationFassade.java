package org.sigimera.safetravel.application;

import org.sigimera.safetravel.presentation.model.IApplication;

public class ApplicationFassade implements IApplication{
	
	private ApplicationController controller = null;
	
	private static ApplicationFassade instance = null;
	
	/**
	 * Singleton pattern
	 */
	public static ApplicationFassade getInstance() {
		if (instance == null) instance = new ApplicationFassade();
		return instance;
	}
	
	private ApplicationFassade() {
		this.controller = ApplicationController.getInstance();
	}

	@Override
	public String getVersion() {
//		controller
		return null;
	}

}
