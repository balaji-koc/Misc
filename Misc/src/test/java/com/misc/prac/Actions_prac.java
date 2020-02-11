package com.misc.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_prac {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","F:\\Roster\\Roster\\Chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  
	  WebElement element =  driver.findElement(By.name("q"));
	  Actions keyseq  = new Actions(driver);
	  
	  keyseq.keyDown(Keys.SHIFT).sendKeys(element, "modi").keyUp(Keys.SHIFT).click().contextClick(element).
	  sendKeys(Keys.DOWN).click().perform();
	  
	  Thread.sleep(5000);
	  driver.findElement(By.name("btnK")).click();
	  Thread.sleep(3000);
  }
}
