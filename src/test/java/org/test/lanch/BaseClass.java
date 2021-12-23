package org.test.lanch;

import java.awt.AWTException;
import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	
	// BROWSER LAUNCH
	
	
	public static void browserLanch(String browsername) {
		switch (browsername) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default:
			System.out.println("INVALID BROWSER");
			}
		}
	
	// URL LAUNCH
	
	public static void urlLanch(String url) {
		driver.get(url);
		}
	
	// IMPLICT WAIT
	
	public static void impWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
	}
	
	// SENDKEYS
	
	public static void sendkeys(WebElement e, String data) {
		e.sendKeys(data);
		}
	
	// QUITE
	
	public static void quit() {
		driver.quit();
		}
	
	// GETCURRENTURL
	
	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
		}
	
	// TITLE
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
		}
	
	public static WebElement getWord() {
		WebElement txt = driver.findElement(By.name("order_no"));
		return txt;
	}

	// ACTION
	
	public static void dragAndDrop(WebElement from, WebElement to) {
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).perform(); 
		}
	
	// MOVE TO ELEMENT
	
	public static void moveToElement(WebElement url) {
		Actions a = new Actions(driver);
		a.moveToElement(url).perform();
		}
	
	//Drop Down
	private void dropDown(WebElement h) throws AWTException {
		Select s=new Select(h);
		s.selectByIndex(7);
		

	}
	
	// SELECT
	
	public static void selectByIndex(WebElement e, int index) {
		Select s= new Select(e);
		}
	
	//SCREEN SHOT
	
	public static void screenShot( String ssname) throws IOException {

		TakesScreenshot tk=(TakesScreenshot)driver;
		File from = tk.getScreenshotAs(OutputType.FILE);
		File to = new File("E:\\java\\Maven_22_nov\\src\\test\\resources\\ScreenShot//"+ssname+"png");
	    FileUtils.copyFile(from, to);
		
	
	    
	   
	 
	    
		
		
		
		

		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
