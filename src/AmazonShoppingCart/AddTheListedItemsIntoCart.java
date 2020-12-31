package AmazonShoppingCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTheListedItemsIntoCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vananda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Launch amazon application
		String baseURL = "https://www.amazon.in";
		driver.get(baseURL);
		Thread.sleep(8000);
		
		String searchText = "redme7a (matte blue, 2gb ram, 16gb storage)";
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(searchText);
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[alt='Redmi 7A (Matte Blue, 2GB RAM, 16GB Storage)']")).click();		
		
		


	}

}
