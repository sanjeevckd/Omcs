package com.om.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DSA {
	

	public class jenkinprogram {
	  @SuppressWarnings("deprecation")
	  //@Parameters("Browser")
	@Test
	  public void display(String Browser) {
		  
		 System.out.println("New file Oms");
		  

		  WebDriverManager.chromedriver().setup();
	        //driver = new ChromeDriver();
		  //System.setProperty("Webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("http://ToolsQa.com");
		  
		 // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.manage().window().maximize();
		  //driver.findElement(By.xpath("//a[contains(text(),'Enroll')]")).click();
		  //driver.quit();
		  
	  }
	}
}


