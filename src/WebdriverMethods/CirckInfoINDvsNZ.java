package WebdriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CirckInfoINDvsNZ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/search?q=india+match&rlz=1C1GCEU_enIN839IN839&oq=indi&aqs=chrome.0.69i59j69i57j69i61j69i65j69i60j69i61l2j69i60.2949j0j7&sourceid=chrome&ie=UTF-8#sie=m;/g/11fllg85wb;5;/m/021q23;cms;fp;1;;");
		driver.findElement(By.cssSelector("li[data-tab_type='CRICKET_MERGED_SCORECARD']")).click();
		WebElement ourSection = driver.findElement(By.cssSelector("#second-team-boxscore-round-0_scorecard_0"));
		System.out.println(ourSection.findElements(By.cssSelector("div div table tbody tr td:nth-child(3) span")).size());
		int noOfRows = ourSection.findElements(By.cssSelector("div div table tbody tr td:nth-child(3) span")).size();
		for(int i =0; i<noOfRows; i++) {
			System.out.println(ourSection.findElements(By.cssSelector("div div table tbody tr td:nth-child(3) span")).get(i).getText());
		}
		
	}

}
