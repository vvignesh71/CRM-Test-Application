package TestCase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Form;
import Pages.Home;
import Pages.Login;
import Pages.Report;
import TestBase.Base;
import Util.Utility;



public class FormPageTest  extends Base{
	Login login;
	Home home;
	Utility util;
	Form form;
	
	public String sheetName="Sheet1";
	

	@BeforeMethod
	
	public void startup()
	{   
		FileRead();
		initialize();
		login =  new Login();
		
		login.logincheck(prop.getProperty("username"),prop.getProperty("password"));
		home= new Home();
		util = new Utility();
		form = new Form();
	}
	
@DataProvider

public Object[][] getCRMTestData()
{
	
	Object data[][]= util.getTestData(sheetName);
	
	return data;
	
}
	
	
	@Test(priority=1 , dataProvider="getCRMTestData")
	
	
	public void ValidateNewFormClick(String Title,String Report,String Description,String Welcome,String Confirm) throws InterruptedException
	{
		
		util.switchToFrame();
		home.NewFormClick();
		
		Thread.sleep(5000);
		
		form.FormClick(Title, Report, Description, Welcome, Confirm);

				
	}
	
}
