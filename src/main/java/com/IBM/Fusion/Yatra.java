package com.IBM.Fusion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args) throws Exception  {
	//	String ExpMonthYrDay="18/06/2024";
		//String ExpDay="10";
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yatra.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.id("BE_flight_origin_date")).click();
		Thread.sleep(3000);
		String Actmonthyr=driver.findElement(By.xpath("//div [@class='active-month-holder']")).getText();
		//System.out.println(Actmonthyr);
		Thread.sleep(3000);
	    WebElement l2=driver.findElement(By.xpath("//div[contains(text(),'June')]"));
	    js.executeScript("arguments[0].scrollIntoView();", l2);
	    
	    driver.findElement(By.xpath("//td[@id='05/10/2024']")).click();
//	    Thread.sleep(3000);
//       driver.findElement(By.xpath("//input[@id='BE_flight_arrival_date']")).click();
//       
//       String RetActmonthyr=driver.findElement(By.xpath("//div [@class='active-month-holder']")).getText();
//       WebElement l4=driver.findElement(By.xpath("//div[contains(text(),'June')]"));
//	    js.executeScript("arguments[0].scrollIntoView();", l4);
//	    
//	    driver.findElement(By.xpath("//td[@id='28/06/2024']")).click();
		}
			 
		 
			
}