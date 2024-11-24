package com.IBM.Fusion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.filemail.com/share/upload-file");
		
		WebElement l1=driver.findElement(By.id("addBtn"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.click(l1).perform();
		
		StringSelection copy=new StringSelection("C:\\Users\\pc\\Documents\\Test case Sk.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copy,null);
		Robot rb=new Robot();
		rb.delay(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
