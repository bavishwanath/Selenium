package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentDemo {
	ExtentReports extent;
	ExtentSparkReporter reporter;
	@BeforeTest
	public void setupExtent() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("THE WEB AUTOMATION REPORT");
		reporter.config().setDocumentTitle("Test Report");
		reporter.config().setReportName("Vishwanatha Ananda");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vishwa");
		
	}
	
	
	
	@Test
	public void smokeTest() {
		extent.createTest("Smoke Test");
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
		extent.flush();
		
	}
	
	@Test
	public void regressionTest() {
		extent.createTest("Regresson Test");
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();extent.flush();
		
	}
	
	@Test
	public void sanityTest() throws InterruptedException {
		extent.createTest("Sanity Test");
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
		driver.quit();
		extent.flush();
		
	}
}
