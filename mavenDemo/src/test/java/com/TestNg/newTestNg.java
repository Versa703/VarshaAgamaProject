package com.TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class newTestNg {
  @Test
  public void testCase1() {
	  System.out.println("testCase1");
  }
  @Test
  public void testCase2() {
	  System.out.println("testCase2");
  }
  @Test
  public void testCase3() {
	  System.out.println("testCase3");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterMethod");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfetrSuit");
  }

}
