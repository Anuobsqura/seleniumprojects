package TestNgBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore
public class GardenInsurance {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("executes before class");	
	}
	@BeforeMethod
	public void beforemethod()
	{
	System.out.println("executes before method");
	}
	
	
	@Test
	public void WebLogin()
	{
	System.out.println("garden Insurance weblogin");	
	}
	@Test
	public void MobileLogin()
	{
	System.out.println("garden Insurance mobilelogin");	
	}
	@Test
	public void APILogin()
	{
	System.out.println("garden Insurance APIlogin");	
	}
	@AfterMethod
	public void aftermethod()
	{
	System.out.println("executes after method");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("executes after class");	
	}
}

