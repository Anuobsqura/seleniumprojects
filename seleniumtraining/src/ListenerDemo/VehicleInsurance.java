package ListenerDemo;

import org.testng.Assert;
import org.testng.annotations.Test;



public class VehicleInsurance {
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
	Assert.assertTrue(false);
	}
}
