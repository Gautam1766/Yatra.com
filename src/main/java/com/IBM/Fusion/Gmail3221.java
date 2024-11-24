package com.IBM.Fusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail3221 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.live.com/login.srf?");
		
		WebElement e1=driver.findElement(By.xpath("//input[@placeholder='Email, phone, or Skype']"));
				e1.sendKeys("Punnusingh123@outlook.com");
				
				String s1=e1.getAttribute("value");
				 System.out.println(s1);
				
//		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}

}
