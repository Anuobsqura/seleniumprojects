package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ObsquraBrowser {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/index.php");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//a[@href='simple-form-demo.php']")).click();

			// simple form demo //
			
			driver.findElement(By.xpath("//input[@placeholder='Message']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Message']")).sendKeys("HELLO");
			driver.findElement(By.cssSelector("button#button-one")).click();// click show message
			System.out.println(driver.findElement(By.cssSelector("button#button-one")).getText());// message show
			System.out.println(driver.findElement(By.cssSelector("div.my-2")).getText());// your message css tag.class

			driver.findElement(By.xpath("//input[@id='value-a']")).click();
			driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys("100");
			driver.findElement(By.id("value-b")).click();
			driver.findElement(By.id("value-b")).sendKeys("50");
			driver.findElement(By.xpath("//button[@id='button-two']")).click();// click total
			System.out.println(driver.findElement(By.cssSelector("div#message-two")).getText());// show sum output

			// checkbox demo //
			
			driver.findElement(By.xpath("//a[@href='check-box-demo.php']")).click();// checkbox demo click
			
			// single check box //
			
			driver.findElement(By.cssSelector("label[for*='grid']")).click();
			System.out.println(driver.findElement(By.cssSelector("div#message-one")).getText());
			// multiple check box
			// driver.findElement(By.xpath("//label[@for='check-box-one']")).click();
			// driver.findElement(By.xpath("//label[@for='check-box-four']")).click();

			driver.findElement(By.cssSelector("input#button-two")).click();// select all

			//  Radio buttons select //
			
			driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click();
			driver.findElement(By.cssSelector("input#inlineRadio1")).click();// male click
			driver.findElement(By.id("button-one")).click();
			System.out.println(driver.findElement(By.xpath("//div[@id='message-one']")).getText());

			// group radio buttons select //
			
			driver.findElement(By.xpath("//input[@id='inlineRadio11']")).click();
			driver.findElement(By.xpath("//input[@id='inlineRadio23']")).click();// age group
			driver.findElement(By.cssSelector("button#button-two")).click();// get results
			// show message
			System.out.println(driver.findElement(By.xpath("//div[@id='message-two']")).getText());

			// select input dropdown colours //

			driver.findElement(By.xpath("//a[@href='select-input.php']")).click();
			WebElement sdrop = driver.findElement(By.xpath("//select[@id='single-input-field']"));
			Select dropdown = new Select(sdrop);
			dropdown.selectByIndex(1);
			System.out.println(driver.findElement(By.xpath("//div[@id='message-one']")).getText());

			driver.findElement(By.cssSelector("option[value='Red']")).click();
			driver.findElement(By.xpath("//button[@id='button-first']")).click();
			//driver.findElement(By.cssSelector("option[value='Yellow']")).click();
			System.out.println(driver.findElement(By.cssSelector("div[id='message-two']")).getText());

			
			
			driver.findElement(By.xpath("//a[@href='form-submit.php']")).click();
			driver.findElement(By.xpath("//input[@id='validationCustom01']")).click();
			driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys("Anu");

			driver.findElement(By.id("validationCustom02")).click();
			driver.findElement(By.id("validationCustom02")).sendKeys("Das");

			driver.findElement(By.cssSelector("input[id='validationCustomUsername']")).click();
			driver.findElement(By.cssSelector("input[id='validationCustomUsername']")).sendKeys("anuobsqura");

			driver.findElement(By.id("validationCustom03")).click();
			driver.findElement(By.id("validationCustom03")).sendKeys("kollam");

			driver.findElement(By.xpath("//input[@placeholder='State']")).click();
			driver.findElement(By.xpath("//input[@placeholder='State']")).sendKeys("Kerala");

			driver.findElement(By.xpath("//input[@id='validationCustom05']")).click();
			driver.findElement(By.xpath("//input[@id='validationCustom05']")).sendKeys("691004");

			driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();

			driver.findElement(By.xpath("//button[@type='submit']")).click();

			
			System.out.println(driver.findElement(By.xpath("//div[@id='message-one']")).getText());
			driver.close();

			}

			}




