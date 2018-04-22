package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base {

	public static WebDriver driver;
	public static WebElement e1;
	public static Properties prop;

	
	public static void FileRead()
	
	{
		try {
			prop = new Properties();
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\CRMTestApplicationSuite\\src\\main\\java\\Config\\config.properties");
				prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
		
			System.out.println("Not able to read File Content");
		}
		
	}
		public  static void initialize()

		{

				 String browsername = prop.getProperty("browser");

		System.out.println(browsername);
				 if(browsername.equals("chrome"))
				 {
					 
					 try {
						System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
						 driver = new ChromeDriver();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println("Problem in Opening Browser");
					}
					 			 
				 }
		      		 
				 driver.manage().window().maximize();
				 
				 driver.manage().deleteAllCookies();
				 
				 driver.get(prop.getProperty("url"));
		}	
		
		
		
			
	
}
