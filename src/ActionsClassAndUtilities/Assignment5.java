package ActionsClassAndUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		// Switch to 1st frame
		driver.switchTo().frame("frame-top");
		
		// Switch to another frame in the 1st frame
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
		
		
		

	}

}
