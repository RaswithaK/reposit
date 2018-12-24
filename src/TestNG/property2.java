package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class property2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File fil=new File("C:\\selenium_1\\eclipse workplace\\TestNGTutorial\\src\\TestNG\\datadriven.properties");
FileInputStream fis=null;
WebDriver driver=null;

try {
	fis=new FileInputStream(fil);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Properties prop=new Properties();
try {
	prop.load(fis);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
if(prop.getProperty("browser").contains("chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\selenium_1\\DRIVERS\\chromedriver.exe");

driver = new ChromeDriver();}
else if(prop.getProperty("browser").contains("firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\selenium_1\\DRIVERS\\geckodriver.exe");

	driver = new ChromeDriver();	
}
else
{
	System.out.println("failed");
}

driver.get(prop.getProperty("url"));

	}
}
