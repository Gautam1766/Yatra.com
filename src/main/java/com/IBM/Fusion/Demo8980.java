package com.IBM.Fusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8980 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://test.rubywatir.com/radios.php");
		driver.findElement(By.className("radioclass")).click();
	//	driver.findElement(By.xpath(null))
		
	}

}
