package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class InvokeEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\automation\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("i love internet explorer");
		driver.close();

	}

}
