package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import TestBase.Base;


public class Form extends Base {
	@FindBy(name="title")
	WebElement title;
	
	@FindBy(name="report_email")
	WebElement report_email;
	
	@FindBy(name="description")
	WebElement description;
	
	@FindBy(name="welcome_message")
	WebElement welcome_message;
	
	@FindBy(name="confirmation_message")
	WebElement confirmation_message;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement SaveButton;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;


public Form()
{
	
	PageFactory.initElements(driver, this);
	
}



public void FormClick(String tit,String mail,String desc,String welcome,String confirm)

{
	title.sendKeys(tit);
	report_email.sendKeys(mail);
	description.sendKeys(desc);
	welcome_message.sendKeys(welcome);
	confirmation_message.sendKeys(welcome);
	Select s1 = new Select(driver.findElement(By.id("owner_user_id")));
	s1.selectByIndex(0);
	js.executeScript("arguments[0].click();", SaveButton);
	
	}



public void ListFormClick()
{
	
//	html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[ 4 ]/td[1]/a
	
	
	String beforexpath="html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[";
	String afterxpath="]/td[1]/a";
	
	for(int i=1;i<=5;i++)
	
	{
		String str = driver.findElement(By.xpath(beforexpath +i + afterxpath)).getText();
		
		System.out.println(str);
		
		if(str.equals("Mr"))
		
			driver.findElement(By.xpath("//i[@title='Edit']")).click();
		
	}
	
}

}
