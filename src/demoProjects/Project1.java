package demoProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project1 {

	public static void main(String[] args) {
		String baseURL = "http://www.demo.guru99.com/V4/";
		String expectedTitlePostLogin = "Guru99 Bank Manager HomePage";
		System.setProperty("webdriver.gecko.driver", "D:\\automation\\drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		System.out.println("Application launched");

		driver.findElement(By.name("uid")).sendKeys("mngr272401");
		driver.findElement(By.name("password")).sendKeys("EbuvemA");
		System.out.println("Entered the credentials");
		driver.findElement(By.name("btnLogin")).click();
		System.out.println("Clicked on Login button");

		String actualTitlePostLogin = driver.getTitle();

		if (expectedTitlePostLogin.equals(actualTitlePostLogin)) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Login Failed");
		}

		driver.close();
		System.out.println("Browser closed");
		
	}
}
