import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropObsqura {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/drag-drop.php");

		WebElement source = driver.findElement(By.xpath("//span[@draggable='true'][1]"));
		WebElement destination = driver.findElement(By.xpath("(//h4[normalize-space()='Dropped Items List items'])[1]"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).moveToElement(destination).release().build().perform();
		

}
}
