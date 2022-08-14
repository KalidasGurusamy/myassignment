package week2.day1homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1TestLeafCRMCreateLead {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("http://leaftaps.com/opentaps");
		
		//Login Application
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Navigate to Leads page
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		//Create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter Values to Create Leads
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test FIrst Name");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test Last Name");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test Company");
		driver.findElement(By.name("departmentName")).sendKeys("Test Department");
		driver.findElement(By.name("description")).sendKeys("Test Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Testemail@testleaf.com");
		driver.findElement(By.name("submitButton")).click();
		
		//Display Page Title
		System.out.println(driver.getTitle());
		
		
		
	}

}
