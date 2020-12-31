package Basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dataentry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.onlinedataentryjob.com/form-filling-work.php");
		Thread.sleep(5000);
		List thenoOfRows = driver.findElements(By.xpath("//table[@id='table_data']//tr"));
		List thenoOfColoumns = driver.findElements(By.xpath("//table[@id='table_data']//tr[1]/td"));
		
		System.out.println(thenoOfRows.size());
		
		System.out.println("The number of rows "+thenoOfColoumns.size());
		
		// 1) get the no of rows actual test data
		
		// 2) run a for loop for that many times
		
		// 3) in each loop get the next row save data in temp variable an use thattemp vaue to enter in the box
		
		// 4) Click on Submitt button
		
		
		driver.findElement(By.xpath("//input[contains(@name,'name[1508]')]"));
		driver.close();
		System.out.println("Browser closed!!!");

	}
}
