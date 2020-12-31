package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vananda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is launched! ");
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		System.out.println("current url is "+driver.getCurrentUrl());
		Thread.sleep(5000);
		System.out.println("Clicked on browser back button");
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("current url is "+driver.getCurrentUrl());
		driver.navigate().to("https://www.svb.com/");
		Thread.sleep(5000);
		System.out.println("current url is "+driver.getCurrentUrl());
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println("current url is "+driver.getCurrentUrl());
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println("current url is "+driver.getCurrentUrl());
		driver.close();
		System.out.println("Chrome Browser closed! ");

	}

}
