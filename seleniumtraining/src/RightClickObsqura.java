import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickObsqura {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		Actions act = new Actions(driver);

		WebElement right1 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		act.contextClick(right1).build().perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']"))
		.click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		}

}
