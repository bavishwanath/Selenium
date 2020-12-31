package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAssignmentCheckBoxAssertions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vananda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement option1 = driver.findElement(By.cssSelector("input[value='option1']"));
		
		// Select the checkbox
		option1.click();
		Thread.sleep(2000);
		
		// Check whether the option1 is selected
		System.out.println(option1.isSelected());
		
		// Un Select the checkbox
		option1.click();
		Thread.sleep(2000);
		
		// Check whether the option1 is selected
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		
		driver.close();
	}
}
