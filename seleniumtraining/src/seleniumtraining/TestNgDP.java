package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDP {
	@Test(dataProvider="getLogin")
	public void Login(String Username,String Password) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();// maximize window
	driver.findElement(By.id("txtUsername")).click();// clicking on username box using ID
	driver.findElement(By.id("txtUsername")).sendKeys("Username");// entering username
	driver.findElement(By.name("txtPassword")).click();// clicking password textbox using Name
	driver.findElement(By.name("txtPassword")).sendKeys("Password");// entering password
	driver.findElement(By.id("btnLogin")).click();// login
	driver.findElement(By.className("button")).click();//using classname locator login button
	driver.findElement(By.className("panelTrigger")).click();// welcome
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();// using LINKTEXT locator logout
}
@DataProvider
public Object[][] getLogin() {
	Object [][] data =new Object[1][2];
	data [0][0]="standard_user";
	data [0][1]="user_sauce";
	data [1][0]="locked_out_user";
	data [1][1]="secret_sauce";
	return data;
}
	
	
}
