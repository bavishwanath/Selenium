package ActionsClassAndUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5dot1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		WebElement myOption = driver.findElement(By.cssSelector("#checkBoxOption2"));
		WebElement optionName = driver.findElement(By.cssSelector("label[for='benz']"));
		//1
		myOption.click();
		//2
		String selectedOptionText = optionName.getText();
		System.out.println(selectedOptionText);
		//3
		Select s = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
		s.selectByVisibleText(selectedOptionText);
		//4
		driver.findElement(By.cssSelector("#name")).sendKeys(selectedOptionText);
		//5
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String alertMessage = driver.switchTo().alert().getText();
		boolean isSelectedOptionPresentInAlertMessage = alertMessage.contains(selectedOptionText);
		System.out.println(isSelectedOptionPresentInAlertMessage);
	}
}
