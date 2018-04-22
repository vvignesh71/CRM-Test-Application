package TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Home;
import Pages.Login;
import Pages.Report;
import TestBase.Base;
import Util.Utility;

public class ReportPageTest extends Base{
	Login login;
	Home home;
	Report reports;
	Utility util;
	
	@BeforeMethod
	
	public void StartUp()
	
	{
		FileRead();
		initialize();	
		login =  new Login();
		login.logincheck(prop.getProperty("username"),prop.getProperty("password"));
		home= new Home();
		util = new Utility();
		reports = new Report();
		
		
	}
	
	
	
	@Test
	
	
	public void ReportClickable() throws InterruptedException
	{
		
		util.switchToFrame();
		home.ReportsClick();
		Thread.sleep(5000);
		reports.ReportList();
		
	}
	
}
