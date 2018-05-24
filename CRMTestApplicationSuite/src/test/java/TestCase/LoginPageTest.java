package TestCase;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Login;
import TestBase.Base;

public class LoginPageTest extends Base {
    Login login;
	
    Logger log =  Logger.getLogger(LoginPageTest.class);
	
@BeforeMethod
	
	public void start()
	{
	    log.info("*************Begining to File Read Process****************");
		FileRead();
		log.info("*************File Intialize Process has began****************");
		initialize();
		login = new Login();
		
		
	}
@Test(priority=1)
	public void ValidateTitle()
	
	{
	 log.info("*************Validating Login Page Title ****************");
		login.getLoginPageTitle();	
		
	}

@Test(priority=2)

public void ValidateLogo()
{
	 log.info("*************Checking the Logo ****************");
	login.getLogoCheck();

}


@Test(priority=3)

public void ValidateLogin()

{    log.info("*************Navigating To Home Screen ****************");
	login.logincheck(prop.getProperty("username"), prop.getProperty("password"));
	
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
