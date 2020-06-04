package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnGroup {

	@Test(groups= {})
	public void logIn() {
		System.out.println("LogIn");
		
	}
	@Test(groups= {})
	public void search() {
		System.out.println("Search");
		Assert.assertEquals("DEF", "ABC");
	}
	
	@Test(groups= {})
	public void logout() {
		System.out.println("Logout");
}}
