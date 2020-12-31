package ActionsClassAndUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframesDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vananda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggabl");
		WebElement iframeElement = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(iframeElement);
		driver.findElement(By.id("draggable")).click();
		System.out.println("All done");
		driver.quit();
	}
	
}
