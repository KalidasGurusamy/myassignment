package week2.day2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog3DeleteLeads {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
				
				//Navigate to Leads page
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Find Leads")).click();
				
				driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
				
				driver.findElement(By.name("phoneNumber")).sendKeys("97");
				
				driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
				
				Thread.sleep(1000);
				
				String sLeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
				
				//System.out.println(sLeadId);
				
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
				
				//driver.findElement(By.xpath(sXpath)).click();
				
								
				driver.findElement(By.xpath("//a[contains(@href, 'deleteLeadForm')]")).click();
				
				driver.findElement(By.linkText("Find Leads")).click();
				
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(sLeadId);
				
				driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
				
				Thread.sleep(1000);
				
				System.out.println(driver.findElement(By.xpath("//div[text() = 'No records to display']")).getText());
				
				Thread.sleep(1000);
				
				driver.close();
				
		
	}

}
