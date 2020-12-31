package WebdriverMethods;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AltiPlayground {
	private static Logger log = LogManager.getLogger(AltiPlayground.class.getName());

	public static void main(String[] args) throws InterruptedException {
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.info("Set the implicit timeout");
		driver.manage().window().maximize();
		log.info("maximized the window");

		// Coral portal login
		driver.get("https://o365altimetrik.sharepoint.com/Pages/Default.aspx");
		Lginfo lg = new Lginfo();
		String USerName = lg.getUserName();
		String passWord = lg.getPassWord();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(USerName);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.cssSelector("#passwordInput")).sendKeys(passWord);
		driver.findElement(By.cssSelector("#submitButton")).click();
		driver.findElement(By.cssSelector("#idBtn_Back")).click();

		// Get current points
		driver.findElement(By.cssSelector(".box .usageCounter")).click();
		String currentscore = driver.findElement(By.id("curUserScore")).getText();
		String currentRank = driver.findElement(By.cssSelector("#curUserRank")).getText();
		System.out.println("The rank before the script run : " + currentRank);
		System.out.println("Total Points before the script run : " + currentscore);
		driver.findElement(By.id("close-popup1")).click();

		// First visit to Playground portal
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#flyimage3img")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("a[id='playGroundLink']")).click();

		// Get the windowhandles
		Set<String> me = driver.getWindowHandles();
		Iterator<String> you = me.iterator();
		String parentWindow = you.next();

		// Switch to parent window
		driver.switchTo().window(parentWindow);

		// For rest 7 times page visit to Playground portal
		for (int i = 0; i < 7; i++) {
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#flyimage3img")).click();
			Thread.sleep(6000);
			driver.findElement(By.cssSelector("a[id='playGroundLink']")).click();
			driver.switchTo().window(parentWindow);
		}

		// Get the no of channel links in the coral page
		driver.findElement(By.cssSelector(".feedHeading img")).click();
		WebElement headingsListOfLinks = driver.findElement(By.cssSelector(".slide-out-div"));
		int noOfLinks = headingsListOfLinks.findElements(By.tagName("a")).size();
		// System.out.println(noOfLinks);

		// Click on all channel links except last 2 links twice
		int j = 0;
		while (j < 2) {
			for (int i = 0; i < noOfLinks - 2; i++) {
				Thread.sleep(3000);
				headingsListOfLinks.findElements(By.tagName("a")).get(i).click();
				Thread.sleep(2000);
				driver.switchTo().window(parentWindow);
			}
			j++;
		}

		// Get current points after script run
		driver.findElement(By.cssSelector(".box .usageCounter")).click();
		String currentscoreafterscriptrun = driver.findElement(By.id("curUserScore")).getText();
		System.out.println("Total Points after the script run : " + currentscoreafterscriptrun);
		System.out.println("The rank after the script run : " + currentRank);
		driver.findElement(By.id("close-popup1")).click();

		// Sign out of coral page
		driver.findElement(By.cssSelector(".profile")).click();
		driver.findElement(By.cssSelector("a[name='Abutton1']")).click();
		System.out.println("Clicked on Sign out!");

		// check the successful sign out
		String currentPageTitleAfterSignogg = driver.findElement(By.cssSelector("div[role='heading']")).getText();
		System.out.println(currentPageTitleAfterSignogg);
		driver.findElement(By.cssSelector("div[data-test-id='vananda@altimetrik.com-menu-dots']")).click();
		driver.findElement(By.cssSelector("#forgetLink")).click();
		System.out.println(currentPageTitleAfterSignogg);

		// Close browser
		driver.quit();
		System.out.println("browser closed");
		System.out.println("TASK COMPLETED!");

	}
}
