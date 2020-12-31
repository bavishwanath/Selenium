package WebdriverMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class WebPageOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vananda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[contains(text(),'Men')]")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Men')] //a[@title='Sports Shoes']")).click();
		//driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_'][3] //a[@title='Clothing']")).click();
		//Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
