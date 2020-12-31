package ActionsClassAndUtilities;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmnet2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		// Get window handles
		Set<String> me = driver.getWindowHandles();
		Iterator<String> you = me.iterator();
		String parentWindow = you.next();
		String childWindow = you.next();

		// Print Child window content
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

		// Print Parent window content
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

	}

}
