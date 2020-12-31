package GreenKartTestSuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartLocatorArray {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vananda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(2000);
		int listOfItems = driver.findElements(By.cssSelector("h4.product-name")).size();
		System.out.println("The total no of items in the cart is : "+listOfItems);
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0; i<listOfItems; i++) {
			System.out.println(products.get(i).getText());
			System.out.println();
		}
		
		driver.getWindowHandles();
		
		//System.out.println("Printing someting i dony know!!!   "+products);
		driver.close();
		System.out.println("Closed the browser!");

	}

}
