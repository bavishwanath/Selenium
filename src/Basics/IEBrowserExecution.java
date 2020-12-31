package Basics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class IEBrowserExecution {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\automation\\New folder\\IEDriverServer.exe");
		
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.introduceFlakinessByIgnoringSecurityDomains();
		options.ignoreZoomSettings();
		options.destructivelyEnsureCleanSession();
		options.requireWindowFocus();
		options.takeFullPageScreenshot();
        
		WebDriver driver = new InternetExplorerDriver(options);
		driver.get("https://www.google.com");
		System.out.println();
		//driver.close();
		
		 }
		 


	}


