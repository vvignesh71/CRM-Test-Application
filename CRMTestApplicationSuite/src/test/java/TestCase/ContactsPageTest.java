package TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import Pages.Contacts;
import Pages.Home;
import Pages.Login;
import Pages.Report;
import TestBase.Base;
import Util.Utility;

public class ContactsPageTest extends Base {
	
	Login login;
	Home home;
	Report reports;
	Utility util;
	Contacts contacts;
	
@BeforeMethod
	
	public void StartUp()
	
	{  
	
	
		FileRead();
		initialize();	
		
		login =  new Login();
		
		
		
		login.logincheck(prop.getProperty("username"),prop.getProperty("password"));
		home= new Home();
		util = new Utility();
		contacts=new Contacts();
		
		
	}
	



@Test(priority=1)

public void CompanyClick() throws Exception
{
	util.switchToFrame();
	home.CompanyClick();
	Thread.sleep(2000);
	
	contacts.ContactSelect();
	
	
}

}
