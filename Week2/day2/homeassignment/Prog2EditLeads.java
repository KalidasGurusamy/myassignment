package week2.day2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2EditLeads {
	
	public static void main(String[] args) {
		
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
				
				//Create Leads
				driver.findElement(By.linkText("Find Leads")).click();
				
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
				
				System.out.println(driver.getTitle());	
				
				driver.findElement(By.xpath("//a[contains(@href, 'updateLeadForm?party')]")).click();
				
				driver.findElement(By.id("updateLeadForm_companyName")).clear();
				driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("New Amazon1");
				
				driver.findElement(By.xpath("(//form[@id='updateLeadForm']/div/div[2]/table/tbody/tr)[12]/td[2]/input")).click();
				
				System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
				
				driver.close();
				
				
	}

}
