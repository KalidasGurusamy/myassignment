package week5.day1homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog3DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Open URL
		driver.get(" https://www.leafground.com/drag.xhtml");
		
		WebElement sNameCol = driver.findElement(By.xpath("//th[@id = 'form:j_idt94:j_idt95']"));
		WebElement sQtyCol = driver.findElement(By.xpath("//th[@id = 'form:j_idt94:j_idt99']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(sNameCol,sQtyCol ).perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[@class = 'ui-growl-title']")).getText());
		Thread.sleep(2000);
		WebElement sRow3 = driver.findElement(By.xpath("//div[@id='form:j_idt111']//table/tbody/tr[@data-ri ='5']"));
		WebElement sRow4 = driver.findElement(By.xpath("//div[@id='form:j_idt111']//table/tbody/tr[@data-ri ='4']"));
		WebElement sRow5 = driver.findElement(By.xpath("//div[@id='form:j_idt111']//table/tbody/tr[@data-ri ='3']"));
		act.dragAndDrop(sRow4, sRow3).perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[@class = 'ui-growl-title']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText());
	}

}
