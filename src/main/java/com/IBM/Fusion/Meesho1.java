package com.IBM.Fusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Meesho1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();
		driver.findElement(By.partialLinkText("")).click();
		

	}//Electronics

}
