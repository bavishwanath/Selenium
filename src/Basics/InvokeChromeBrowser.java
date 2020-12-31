package Basics;

import java.io.File;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.collections4.FactoryUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.beust.jcommander.Strings;

public class InvokeChromeBrowser {
	@Test
	public void launchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + Keys.SHIFT +"t");
		driver.get("https://www.bincodes.com/random-creditcard-generator/");
		/*
		 * Thread.sleep(9000); String content = driver.findElement(By.xpath(
		 * "//h4[contains(text(),'Visa')]//parent::strong//parent::li")) .getText();
		 * System.out.println(content); String sam = content.substring(4, 21);
		 * System.out.println(sam); driver.close();
		 * 
		 * 
		 * 
		 * 
		 * sample 
		 * 
		 */
		

		// TakesScreenshot scrshot = ((TakesScreenshot)driver); File fil =
		// scrshot.getScreenshotAs(OutputType.FILE);

//		ArrayList arr = new ArrayList();
//		arr.add("25");
//		arr.add("1");
//		arr.add("0");
//		arr.add("44");
//		arr.add("99");
//		arr.add("52");
//		System.out.println(arr);
//		Collections.sort(arr);
//		System.out.println(arr);

		/*
		 * @SuppressWarnings("unchecked") Wait wait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(5))
		 * .ignoring(Exception.class);
		 */

//		WebDriverWait wait = new WebDriverWait(driver, 30);
		/* wait.until(ExpectedConditions.elementToBeClickable(".clas")); */
		// driver.close();
	}

}
