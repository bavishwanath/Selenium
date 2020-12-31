package ActionsClassAndUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalaenderWithGogleFlights {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/flights");
		String requiredMonth = "June";
		driver.findElement(By.cssSelector("span[jstcache='582']")).click();
		System.out.println(driver.findElements(By.tagName("calendar-month")).size());
		int count = driver.findElements(By.tagName("calendar-month")).size();
		
		
		for (int i=0; i<=count; i++) {
			String currentMonth = driver.findElements(By.cssSelector("jsl[jstcache='8994']")).get(i).getText();
			System.out.println(currentMonth);
			if(currentMonth.equalsIgnoreCase(requiredMonth)) {
				
				break;
			}
			driver.findElement(By.cssSelector("div[jstcache='8971']")).click();
		}
		
		
		

	}

}
