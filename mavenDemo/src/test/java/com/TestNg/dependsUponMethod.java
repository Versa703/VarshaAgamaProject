package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsUponMethod {
	
	@Test()
	public void logIn() {
		System.out.println("LogIn");
		
	}
	@Test(dependsOnMethods="logIn")
	public void search() {
		System.out.println("Search");
		Assert.assertEquals("DEF", "ABC");
	}
	
	@Test(dependsOnMethods="search",alwaysRun=true)
	public void logout() {
		System.out.println("Logout");
		

	}
}
