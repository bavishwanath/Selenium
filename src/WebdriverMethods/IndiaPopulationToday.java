package WebdriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndiaPopulationToday {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.worldometers.info/world-population/india-population/");
		String population = driver.findElement(By.cssSelector(".maincounter-number")).getText();
		System.out.println(population);

	}

}
