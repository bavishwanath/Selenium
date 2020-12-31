package SeleniumAssesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMaps {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/maps");
		driver.findElement(By.cssSelector("button[aria-label='Directions']")).click();
		driver.findElement(By.cssSelector("input[aria-label*='Choose starting point']")).sendKeys("Silk board bus stand, Central Silk Board Colony, Stage 2, BTM Layout, Bengaluru, Karnataka");
		driver.findElement(By.cssSelector("input[aria-label*='Choose destination']")).sendKeys("Electronics City Phase 1, Electronic City, Bengaluru, Karnataka 560100");
		driver.findElement(By.cssSelector("div[aria-label*='Transit']")).click();
		
	}

}
