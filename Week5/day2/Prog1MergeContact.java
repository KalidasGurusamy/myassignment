package week5.day2homeassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps");
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on contacts Button
		driver.findElement(By.xpath("//a[contains(@href, 'createContactForm')]")).click();
		
		// Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[contains(@href, 'mergeContactsForm')]")).click();
		
		//Click on Widget of From Contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> switchTOWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(switchTOWindow.get(1));
		String title = driver.getTitle();	
		System.out.println(title);
		Thread.sleep(1000);
		
		//Click on First Resulting Contact
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a")).click();
		driver.switchTo().window(switchTOWindow.get(0));
		title = driver.getTitle();	
		System.out.println(title);
		
		//Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		windowHandles = driver.getWindowHandles();
		switchTOWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(switchTOWindow.get(1));
	title = driver.getTitle();	
		System.out.println(title);
		Thread.sleep(1000);
		
		//Click on Second Resulting Contact
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody/tr/td/div/a")).click();
		driver.switchTo().window(switchTOWindow.get(0));
		title = driver.getTitle();	
		System.out.println(title);
		
		//Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[@class= 'buttonDangerous']")).click();
		Thread.sleep(1000);
		
		//Accept the Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Verify the title of the page
		title = driver.getTitle();	
		System.out.println(title);
		
		
	}

}
