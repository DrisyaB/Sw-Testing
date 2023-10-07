package org.ict.scripts;

import org.ict.constants.AutomationConstants;
import org.ict.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBase{
HomePage home;
@Test
public void Comp() throws InterruptedException {
	home=new HomePage(driver);
	Thread.sleep(200);
	home.SoftwareBlog();
	String Actual1="https://www.eviltester.com/blog/";
	Assert.assertEquals(Actual1,AutomationConstants.Expected1);
}
@Test
public void competit() {
	home.HomeButton();
	String Actual4="https://www.eviltester.com/";
	Assert.assertEquals(Actual4,AutomationConstants.Expected4);
}
	@Test
	public void compet() {
	home.Resources();
	String Actual2="https://www.eviltester.com/page/services/";
	Assert.assertEquals(Actual2,AutomationConstants.Expected2);
	}
	@Test
	public void competi() {
	home.AgileTesting();
	String Actual3="https://www.eviltester.com/page/agile/";
	Assert.assertEquals(Actual3,AutomationConstants.Expected3);
	}
	
}
