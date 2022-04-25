package pomWOPageFactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomWOPageFactory.LoginPayroll1;

public class LoginpayrollTest1 {

	
		// TODO Auto-generated constructor stub
	@Test
	public void verifyLogin() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");

		LoginPayroll1 page = new LoginPayroll1(driver);
		page.enterUserName();
		page.enterPassword();
		page.clickLoginButton();

	}
	}


