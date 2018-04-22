package Pages;

import org.openqa.selenium.By;

import TestBase.Base;

public class Contacts extends Base{
	
	public void ContactSelect()
	{	
		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";
		// .//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a
		// .//*[@id='vContactsForm']/table/tbody/tr[8]/td[2]/a
		// .//*[@id='vContactsForm']/table/tbody/tr[9]/td[2]/a
		for(int i=4;i<=7;i++)
		
		{
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();

		System.out.println(name);
			
			//Use firepath for this kind of xpath
		        if(name.equals("Abc paul"))
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[2]/a")).click();	
					
						
		}
		
			
		
		
	}
	
	
	
	
}
