
package com.login;

import java.io.IOException;

import com.test.common.commonMethod;

public class wrapperClass {

	public static void main(String[] args) throws IOException {
		
		commonMethod cm = new commonMethod();
		
		cm.insertApp("https://opensource-demo.orangehrmlive.com/");
		cm.byid_sendkey("txtUsername", "Admin");
		cm.byid_sendkey("txtPassword", "admin123");
		cm.byxpath_click("//*[@id=\"btnLogin\"]");
		cm.byxpath_click("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/span");
		cm.byxpath_click("//*[@id=\"menu_pim_viewPimModule\"]/b");
		//cm.byxpath_click("//*[@id=\"menu_pim_addEmployee\"]");
		//cm.byxpath_click("//*[@id=\"menu_pim_addEmployee\"]");
		cm.byid_click("menu_pim_addEmployee");
		
		cm.byname_sendkey("firstName", "AAA");
		
		cm.byname_sendkey("middleName", "BBB");

	}

}
