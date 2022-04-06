package TestNgBasics;

import org.testng.annotations.Test;

public class HomeInsurance {
@Test(priority=1)
public void WebLogin()
{
System.out.println("Home Insurance weblogin");	
}
@Test(priority=2)
public void MobileLogin()
{
System.out.println("Home Insurance mobilelogin");	
}
@Test(priority=2)
public void APILogin()
{
System.out.println("Home Insurance APIlogin");	
}

}
