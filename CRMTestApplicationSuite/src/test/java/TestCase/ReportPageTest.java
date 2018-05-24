package TestCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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
