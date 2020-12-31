package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksINHeathPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("apple");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER);
		List<WebElement> links = driver.findElements(By.tagName("h3"));
		System.out.println(links.size());
		for (int i=1; i<=10; i++) {
			System.out.println(links.get(i).getText());
			//links.get(i).sendKeys(Keys.CONTROL, keys.c);sendKeys(Keys.CONTROL)
		}
	}

}
