package ActionsClassAndUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		WebElement table = driver.findElement(By.cssSelector("fieldset .table-display"));

		// No of rows in the table
		int noOfRows = table.findElements(By.cssSelector("tbody tr")).size();
		System.out.println("Rows: " + noOfRows);

		// No of colounms in the table
		int noOfColoumn = table.findElements(By.cssSelector("tbody tr th")).size();
		System.out.println("Coloumns: " + noOfColoumn);

		// Data in the second row
		String theSecondRowData = table.findElement(By.cssSelector("tbody tr:nth-child(3)")).getText();
		System.out.println("2nd row data: " + theSecondRowData);
	}

}
