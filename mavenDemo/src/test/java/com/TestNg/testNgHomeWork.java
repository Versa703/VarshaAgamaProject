package com.TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonWrapperPackage.commonWrapperMethod;

public class testNgHomeWork {
	
	commonWrapperMethod cwm = new commonWrapperMethod();
	
	 @BeforeTest
	 public void insertApp() {
		 
		 cwm.insertApp("https://opensource-demo.orangehrmlive.com/");
	 }
	 
	 @Test
	 public void login() {
		 cwm.byid_sendkey("txtUsername", "Admin");
		 cwm.byid_sendkey("txtPassword", "admin123");
		 cwm.byname_click("Submit");
	 }
	 @Test   
	 public void login1() {
	 cwm.byxpath_click("//*[@id=\"menu_leave_viewLeaveModule\"]/b");
	     cwm.byname_sendkey("leaveList[calFromDate]", "2020-06-03");
	     cwm.byxpath_click("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[3]/a");
	     cwm.byxpath_click("//*[@id=\"leaveList_chkSearchFilter_checkboxgroup_allcheck\"]");
	     cwm.byname_sendkey("leaveList[cmbSubunit]", "Administration");
	     cwm.byid_click("btnSearch");
	     
	 }
	     
	     @AfterTest
	     public void quit() {
	    	 cwm.close();
	    	 
	     };
	     
	     
	 
	
	
	
	
	
	
	
	

}
