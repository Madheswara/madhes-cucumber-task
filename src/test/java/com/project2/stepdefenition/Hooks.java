package com.project2.stepdefenition;

import com.project2.resources.Commanactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commanactions {

	Commanactions cm = new Commanactions();
	
	@Before 
	public void login() {
		System.out.println("initiated");
	}
	@After
	public void exit() {
		driver.quit();
	}
}
