package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {

	
	@BeforeTest
public void prerequisite()
{
System.out.println("first execution");
}
	
@BeforeSuite
public void suit()
{
	System.out.println("no 1from first");
}
@AfterSuite
public void asuit()
{
	System.out.println("no 1 from last");
}
@BeforeMethod
public void main()
{
	
}
@BeforeClass
public void befrcls()
{}

@Test
public void Weblogincarloan()
{
	//selenium
	System.out.println("WebLogin Car");
}
@Test
public void Mobilelogincarloan()
{
//appium
	System.out.println("Mobile login Car");
}
@Test
public void Mobilesignincarloan()
{
//appium
	System.out.println("Mobile signin Car");
}
@Test
public void Mobiesignoutcarloan()
{
//appium
	System.out.println("Mobile signout Car");
}
@Test
public void LoginAPI()
{
	//Rest API Automation
	System.out.println("Login API Car");
}
@AfterTest
public void result()
{
	System.out.println("result");
}
}
