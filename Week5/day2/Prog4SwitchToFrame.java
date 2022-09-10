package week5.day2homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog4SwitchToFrame {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		//.Load the url as " https://login.salesforce.com/ "
		driver.get("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		WebElement sItem4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement sItem5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement sItem6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		WebElement sItem7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(sItem5,sItem4).pause(300).dragAndDrop(sItem6, sItem4).perform();
	}

}
