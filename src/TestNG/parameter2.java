package TestNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter2 extends propertY1 {
@Parameters({"URL"})
	@Test
public void parem(String name)
{
	System.out.println("hello2");
	System.out.println(name);
}
}
