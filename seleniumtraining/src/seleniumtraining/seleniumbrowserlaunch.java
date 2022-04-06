package seleniumtraining;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumbrowserlaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
}
}
