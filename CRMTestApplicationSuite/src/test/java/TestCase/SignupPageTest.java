package TestCase;
import java.io.IOException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import com.relevantcodes.extentreports.ExtentReports;

import Pages.Login;
import Pages.Signup;
import TestBase.Base;


public class SignupPageTest extends Base {
	Login login;
	Signup sign;
	
	
	
	@BeforeMethod
	public void ReadFile()
	{
		FileRead();
		initialize();
		login = new Login();	
		sign = new Signup();
	}
	
	
	
	
	@Test(priority=2)
	
	public void ValidateTitle()
	{
		
		sign.newRegistration();
	     sign.TitleCheck();
     }
	
	
	@Test(priority=1)
	
	public void ValidateFormFill()
	
	{  sign.newRegistration();
		sign.FormFill("Vignesh", "V", "vignesh.vicks573@gmail.com", "vignesh.vicks573@gmail.com", "vicky_49",
				"sample", "sample");
		
	}
		
	@AfterMethod

	public void tearDown() {
		
		driver.quit();
		
	}
	
}
