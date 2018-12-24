package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ng1test {
	@Test
	public void Demo()
	{
		System.out.println("Hello");
	}
	@Parameters({"URL"})
	@Test
    public void Demo2(String urlname)
    {
	System.out.println("Bye");
	System.out.println(urlname);
    }

}
