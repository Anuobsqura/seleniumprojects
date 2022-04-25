package POMWithPageFactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POMWithPageFactory.LoginPayroll;

public class LoginPayrollTest {

	
		// TODO Auto-generated constructor stub
		@Test
		public void verifyLogin() {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.qabible.in/payrollapp/site/login");
				
			LoginPayroll pages=PageFactory.initElements(driver,LoginPayroll.class );
				pages.verifyLogin();
							
	}

}
