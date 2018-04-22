package TestCase;

import TestBase.Base;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Form;
import Pages.Document;
import Pages.Home;
import Pages.Login;
import TestBase.Base;
import Util.Utility;
public class DocumentPageTest extends Base {

	Login login;
	Home home;
	Utility util;
	Document doc;
	

	
@BeforeMethod

public void startup()
{   
	FileRead();
	initialize();
	login =  new Login();
	login.logincheck(prop.getProperty("username"),prop.getProperty("password"));
	
	home= new Home();
	util = new Utility();
	doc = new Document();
	
}



@Test(priority=1)
public void ValidateNewDoc() throws InterruptedException
{

	util.switchToFrame();
	
	home.NewDocs();
	
	Thread.sleep(5000);
	
	doc.NewDocs("title", "description", "23", "search","asas");
	
	
}

}

