package com.IBM.Fusion;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sele_grid {
	
	public WebDriver driver=null;
	public WebDriverWait wait=null;
	public DesiredCapabilities cap=null;
	
	@BeforeClass
	public void setup() throws Exception 
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		cap=new DesiredCapabilities();
		cap.setBrowserName("Chrome");
		cap.merge(op);
		driver=new RemoteWebDriver(new URL(" http://192.168.1.71:4444"),null);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	void test1() 
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@Test
	void test2() 
	{
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
	}

}
