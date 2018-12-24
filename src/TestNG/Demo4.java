package TestNG;


import org.testng.annotations.Test;

public class Demo4 {
	@Test(enabled=false)
	public void WebloginHomeloan()
	{
		//selenium
		System.out.println("WebLogin Home");
	}
	
	//@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void MobileloginHomeloan()
	{
	//appium
		System.out.println("Mobile login Home");
		//System.out.println(urlname);
	}
	@Test(dependsOnMethods= {"LoginAPI"})
	public void LoginAPI()
	{
		//Rest API Automation
		System.out.println("Login API Home");
	}
	@Test(timeOut=4000)
	public void LoginAPI2()
	{
		//Rest API Automation
		System.out.println("Login API Home2");
	}

}


