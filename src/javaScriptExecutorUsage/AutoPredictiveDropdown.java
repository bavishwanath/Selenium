package javaScriptExecutorUsage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPredictiveDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com");
		
		/*  usage of java script executor*/
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 String script = "document.getElementById(\"likesCnt\").value();";
		 String test = (String) js.executeScript(script);
		 System.out.println(test);
		 

	}

}
