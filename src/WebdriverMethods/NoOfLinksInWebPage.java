package WebdriverMethods;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksInWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.altimetrik.com");
		driver.findElement(By.cssSelector("#cookie_action_close_header")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.tagName("footer"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement socialLinksInFooter = footer.findElement(By.cssSelector(".social-icons"));
		System.out.println(socialLinksInFooter.findElements(By.tagName("a")).size());
		Set<String> me = driver.getWindowHandles();
		Iterator<String> you = me.iterator();
		String parentWindow = you.next();
		for(int i=0; i<socialLinksInFooter.findElements(By.tagName("a")).size(); i++) {
			socialLinksInFooter.findElements(By.tagName("a")).get(i).click();
			driver.switchTo().window(parentWindow);
		}

	}

}
