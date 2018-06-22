package automationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Eziz\\Documents\\selenuim dependencies\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://gmail.com");
	driver.findElement(By.name("identifier")).sendKeys("Saryyeweziz@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#identifierNext > content")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("E4124173868");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#passwordNext > content > span")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#\\3a hd > div > div")).click();	
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#\\3a mt")).sendKeys("Simplealone823@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#\\3a ng")).sendKeys("Hello baby");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#\\3a m1")).click();
	
	
	
	
	
	
}
}
