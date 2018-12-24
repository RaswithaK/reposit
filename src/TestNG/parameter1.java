package TestNG;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter1 {
	@Parameters({"URL", "APIKEY"})
@Test
	public void para1(String uname, String inpt)
{
	System.out.println(uname);
	System.out.println(inpt);
}
	@Test(dataProvider="getdata")
	public void para2(String username,String password)
	{
		System.out.println("WITHOUT PARAMETER");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		//1st combination==val1 valu2
		//3rd combination==val1 valu2
		//2nd combination==val1 valu2
		
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="val1";
		data[0][1]="val2";
		//column in the row are nothing but values
		data[1][0]="val1";
		data[1][1]="val2";		
		//3rd set
		data[2][0]="val1";
		data[2][1]="val2";
		return data;
		
	}
	
}


