package TestCase;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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
	
	@AfterMethod
	public void screenShot(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			
				 
				 try {
					TakesScreenshot screenshot=(TakesScreenshot)driver;
					 File src=screenshot.getScreenshotAs(OutputType.FILE);
					 File dest=  new File("D:\\Screen\\" +result.getName()+ ".png");
						FileUtils.copyFile(src, dest);
				} catch (WebDriverException e) {
					
					System.out.println("Not able to generate screenshot");
					
					e.printStackTrace();
				} catch (IOException e) {
					
					System.out.println("Not able to save the screenshot in the mentioned screenshot");
					
				}
			 }
		
		driver.quit();
			 
	}
	
}
