package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class propertY1 {
public WebDriver driver=null;
	@Test
public void Login() throws IOException 
{
Properties prop=new Properties();
FileInputStream fis=new FileInputStream("C:\\selenium_1\\eclipse workplace\\TestNGTutorial\\src\\TestNG\\datadriven.properties");
prop.load(fis);
//System.out.println(prop.getProperty("username"));
if(prop.getProperty("browser").equals("firefox"))
{
	driver=new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver","C:\\selenium_1\\DRIVERS\\geckodriver.exe");
	driver.get(prop.getProperty("url"));
	
}

driver.get(prop.getProperty("url"));

}



@Test
public void softwatre()
{
	
}
@AfterTest
public void signout()
{
	
}
}

