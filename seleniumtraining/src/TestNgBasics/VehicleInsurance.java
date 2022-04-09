package TestNgBasics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VehicleInsurance {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("execute first from suite level");	
	}
		@Test
		public void WebLogin()
		{
		System.out.println("Vehicle Insurance weblogin");	
		}
		@Test
		public void MobileLogin()
		{
		System.out.println("Vehicle Insurance mobilelogin");	
		}
		@Test
		public void APILogin()
		{
		System.out.println("Vehicle Insurance APIlogin");	
		}
		@AfterSuite
		public void aftersuite()
		{
			System.out.println("execute last from suite level");	
		}
}
