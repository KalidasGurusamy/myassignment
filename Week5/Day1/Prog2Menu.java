package week5.day1homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2Menu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://www.leafground.com/menu.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Shipments']")).click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//li/ul/li/a/span[text()='Tracker']"))).perform();
		Thread.sleep(3000);
		act.contextClick(driver.findElement(By.xpath("//li/ul/li/a/span[text()='Tracker']"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt134']/div[1]/div[1]/ul[1]/li[2]/a[1]/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Back']")).click();

	}

}
