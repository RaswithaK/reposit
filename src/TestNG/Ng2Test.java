package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ng2Test {
	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void demo3(String urlname)
	{
		System.out.println("ploan");
		System.out.println(urlname);
	}
	

}
