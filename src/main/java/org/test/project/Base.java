package org.test.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void click(WebElement e) {
		e.click();
	}





	public static void urlLaunch(String url) {
	driver.get(url);

	}
	public static void getUrl() {
	driver.get("http://adactinhotelapp.com/");

	}
	public static void implictWait(int sec) {
	driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);

	}

	public static String getTitle() {
	String title = driver.getTitle();
	return title;

	}
	public static void quit() {
	driver.quit();
	}
	public static void dragAndDrop(WebElement source,WebElement target) {
	Actions a=new Actions(driver);
	a.dragAndDrop(source, target);
	}
	public static void selectByid(WebElement e,int a) {
	Select s=new Select(e);
	s.selectByIndex(a);
	}
	public static  void findEelement(String locatorName,String loc) {
	if (locatorName.equalsIgnoreCase("id")) {
	driver.findElement(By.id("loc"));

	}else if (locatorName.equalsIgnoreCase("name")) {
		driver.findElement(By.name("loc"));
	}else if (locatorName.equalsIgnoreCase("pass")) {
		driver.findElement(By.xpath("loc"));
	}









	}
	}
	
	

