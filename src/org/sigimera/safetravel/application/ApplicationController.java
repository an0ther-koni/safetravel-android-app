package org.sigimera.safetravel.application;

import org.sigimera.safetravel.presentation.model.Constants;

public class ApplicationController {
	
	private static ApplicationController instance = null;
	
	/**
	 * Singleton pattern
	 */
	public static ApplicationController getInstance() {
		if (instance == null) instance = new ApplicationController();
		return instance;
	}
	private ApplicationController() {
	}
	
	public String getVersion() {
		return Constants.VERSION;
	}
}
