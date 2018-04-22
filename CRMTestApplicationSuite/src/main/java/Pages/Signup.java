package Pages;

import TestBase.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestBase.Base;
public class Signup extends Base {
	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	  
	  
		@FindBy(name="first_name")
		WebElement first_name;
		
		
		@FindBy(name="surname")
		WebElement surname;
		
		@FindBy(name="email")
		
		WebElement webmail;
		
		
		@FindBy(name="email_confirm")
		
		WebElement confirmemail;
		
		
		@FindBy(name="username")
		WebElement username;
		
		
		@FindBy(name="password")
		WebElement password;
		
		
		@FindBy(name="passwordconfirm")
		WebElement confirmpassword;
		
		
		@FindBy(name="agreeTerms")
		
		WebElement agreeButton;
		
		
		@FindBy(xpath="//button[@type='submit']")
		
		WebElement submitbutton;
		
		@FindBy(xpath="//button[text()='Sign Up']")
		
		WebElement singupbutton;
		
		
		public Signup()
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void newRegistration()
		{
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].click();", singupbutton);
			
		}
		
		
		public void  TitleCheck()

		{
			String expected = driver.getTitle();
			System.out.println(expected);
			String actual ="CRMPRO - CRM Pro for customer relationship management, sales, and suppor";
			Assert.assertEquals(expected, actual);
			
			
		}
		

		public void FormFill(String  fname,String lname,String mail,String confirmmail,String uname,String pass,String confirmpass)
		{
			first_name.sendKeys(fname);
			surname.sendKeys(lname);
			
			webmail.sendKeys(mail);
			
			
			confirmemail.sendKeys(confirmmail);
			
			username.sendKeys(uname);
			password.sendKeys(pass);
	 
			confirmpassword.sendKeys(confirmpass);
			
			js.executeScript("arguments[0].click();", agreeButton);
			js.executeScript("arguments[0].click();", submitbutton);
			
		}
		
		
}
