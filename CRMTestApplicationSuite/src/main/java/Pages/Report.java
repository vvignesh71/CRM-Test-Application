package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;
public class Report extends Base {
	
	public void ReportList()
	{
		String beforexpath="html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/table/tbody/tr[";
		String afterxpath="]/td[2]/a";
		
		
		for(int i=2 ;i<4; i++)
			
		{
			String name= driver.findElement(By.xpath(beforexpath +i +afterxpath)).getText();
			System.out.println(name);
			
			if(name.equals("Most called contacts"))
			{
				driver.findElement(By.xpath(beforexpath + i + afterxpath)).click();
			}
			
			
		}
		
		
	}
		

}
