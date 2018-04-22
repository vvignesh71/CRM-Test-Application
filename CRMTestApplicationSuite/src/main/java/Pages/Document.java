package Pages;

import TestBase.Base;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Util.Utility;


public class Document extends Base {
	
	@FindBy(name="title")
	WebElement title;
	
	
	@FindBy(name="description")
    WebElement description;
	
	@FindBy(name="version")
	WebElement version;
	
	@FindBy(name="file")
	WebElement browse;
	
	@FindBy(name="overwrite")
	WebElement overwrite;

	
	@FindBy(name="contact_lookup")
	WebElement contact;
	
	@FindBy(xpath="//*[@id='docForm']/table/tbody/tr[7]/td[2]/input[4]")
	WebElement Lookup1;

	
	@FindBy(name="search")
	WebElement search;

	
	@FindBy(name="client_lookup")
	WebElement client;

	
	@FindBy(xpath="//*[@id='docForm']/table/tbody/tr[8]/td[2]/input[4]")
	WebElement Lookup2;
	


	@FindBy(name="tags")
	WebElement tags;
	

	
	@FindBy(xpath="//input[@value=\"Save\"]")
	WebElement Save;
	
	
	public Document()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	

	public void NewDirectory(String tit,String desc,String ver,String tag) throws IOException, InterruptedException
	{
		 
		title.sendKeys(tit);
		description.sendKeys(desc);
		version.sendKeys(ver);
		 Thread.sleep(4000);
		// browse.click();
		
       Thread.sleep(2000);
       overwrite.click();
       
       tags.sendKeys(tag);
     
       Thread.sleep(2000);
       
     
       Save.click();
		
		
	}
	
	
	public void NewDocs(String tit,String desc,String ver,String searching,String cl) throws InterruptedException 
	
	{
		
		title.sendKeys(tit);
		description.sendKeys(desc);
		version.sendKeys(ver);
		
		overwrite.click();
		
		
		Lookup1.click();
	
		Select select = new Select(driver.findElement(By.name("directory_id")));
		
		select.selectByVisibleText("Word Templates");
		
		contact.sendKeys("contacts");
		
		
		Thread.sleep(5000);
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> itr = s1.iterator();
		
		
		String parent=itr.next();
		String child=itr.next();
	
		
		Lookup1.click();
	
		
	String contacts	=driver.getTitle();
		
		String str="CRMPRO - Contact lookup";
		
		driver.switchTo().window(child);
		
		if(contacts.equals(str))
		
		
		search.sendKeys("search");
	
		
		Thread.sleep(5000);
		
		driver.switchTo().window(parent);
		
		driver.switchTo().frame("mainpanel");
		
		client.sendKeys("clients");
		
		
		  Lookup2.click();
		  
		  
		  String company=driver.getTitle();
		  
		  
		  String st="CRMPRO - Company lookup";
		
		  driver.switchTo().window(child);
		  
		  
		  if(company.equals(st))
		  
		  search.sendKeys("searsd");
		
	
		
		
	}
	
	
	
	
}
	


