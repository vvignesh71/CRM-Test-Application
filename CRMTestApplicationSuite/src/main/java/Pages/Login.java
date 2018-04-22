package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestBase.Base;

public class Login extends Base {

@FindBy(name="username")
	
	WebElement username;
	
	
	@FindBy(name="password")
	
	WebElement password;
	
	
	@FindBy(xpath="//input[@value='Login']")
	
	WebElement LoginButton;
	
	
	@FindBy(xpath="//button[text()='Sign Up']")
	
	WebElement SingUpButton;
		
	
	@FindBy(className="img-responsive")
	
	WebElement Logo;
	
	
	public Login()
	{
		PageFactory.initElements(driver,this);
		
		
	}

public  void getLoginPageTitle()
{

	String expected=driver.getTitle();
	System.out.println(expected);
	   String actual="Free CRM software in the cloud powers sales and customer service";
				
				Assert.assertEquals(expected, actual);	
	

}

public void getLogoCheck()
{
	
	System.out.println(Logo.isDisplayed());
	
	
}


public void logincheck(String use,String pass)
{
	username.sendKeys(use);
	password.sendKeys(pass);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", LoginButton);
}

	
}
