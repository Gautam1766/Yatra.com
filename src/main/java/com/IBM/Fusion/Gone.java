package com.IBM.Fusion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gone {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com");
		List <WebElement> e1=driver.findElements(By.tagName("a"));
		System.out.println(e1.size());
		
		for(WebElement e2:e1) 
		{
			System.out.println(e2.getText());
		}
	}

}
