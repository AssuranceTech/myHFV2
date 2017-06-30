package com.org.myHFV2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.io.IOException;

 
public class TestBrowser {
	
	@Test
	public void OpenBrowser() throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C://Users//asyedzia//workspace//myHybridFramework-V2//geckodriver.exe");
		driver = new FirefoxDriver();
		FrameworkLib.BrowseTests(driver);	
	}

}
