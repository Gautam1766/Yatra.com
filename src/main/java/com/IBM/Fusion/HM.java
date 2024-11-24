package com.IBM.Fusion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.handmadeinbritain.co.uk");
		Thread.sleep(5000);
		driver.findElement(By.id("ss")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.findElement(By.id("dfd-searchbox-id-cLMtG-input")).sendKeys("jug");
        driver.findElement(By.xpath("//input[@id='dfd-searchbox-id-cLMtG-input']")).sendKeys("jug");
	}

}
