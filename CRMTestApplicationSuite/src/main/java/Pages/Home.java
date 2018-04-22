package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class Home extends Base {
	Actions action  = new Actions(driver);
	 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	@FindBy(xpath="//a[text()='Forms']")
	WebElement Forms;
	
	
	@FindBy(xpath="//a[text()='New Form']")
	
	WebElement NewForm;
	
	
	@FindBy(xpath="//a[text()='Reports']")
	
	WebElement Reports;
	
	@FindBy(xpath="//a[text()='Docs']")
	
	WebElement Docs;
	
	@FindBy(xpath="//a[text()='New Word Merge Template']")
	
	WebElement New_Merge;
	
	@FindBy(xpath="//li//a[text()='New Document']")
	WebElement new_doc;
	
	
	@FindBy(xpath="//a[text()='Companies']")
	WebElement Companies;
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement Contacts;
	
	
	
public 	Home()
	
	{
		PageFactory.initElements(driver, this);
		
	}
	

public void  FormClick()
{

	 js.executeScript("arguments[0].click();",Forms );
 
}


	
public void  NewFormClick()
{

	
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Forms']"))).build().perform();
		
	 js.executeScript("arguments[0].click();",NewForm );
 
}

public void ReportsClick()
{
	 
	 js.executeScript("arguments[0].click();",Reports );
	 
	
}


public void DocsClick()

{

	action.moveToElement(driver.findElement(By.xpath("//a[text()='Docs']"))).build().perform();
	 js.executeScript("arguments[0].click();",New_Merge );
	
}


public void NewDocs()
{
	
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Docs']"))).build().perform();
	//New Document
	js.executeScript("arguments[0].click();",new_doc );
}


public void CompanyClick()
{
		js.executeScript("arguments[0].click();",Contacts );
	
}


}
