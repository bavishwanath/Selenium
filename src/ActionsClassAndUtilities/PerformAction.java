package ActionsClassAndUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Actions a = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		a.moveToElement(menu).build().perform();
		System.out.println("Action completed");

	}

}
