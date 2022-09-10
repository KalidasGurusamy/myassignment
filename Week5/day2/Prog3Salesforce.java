package week5.day2homeassignment;

import java.util.ArrayList;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog3Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch the browser
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		//.Load the url as " https://login.salesforce.com/ "
		driver.get("https://login.salesforce.com/");
		
		//Enter the username as " ramkumar.ramaiah@testleaf.com "
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
		// Enter the password as " Password#123 "
		driver.findElement(By.id("password")).sendKeys("Password#123");
		
		//Click on the login button
		driver.findElement(By.id("Login")).click();
		
		
		//click on the learn more option in the Mobile publisher		
		//driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		//driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@title='Learn More']")).click();
		
		//Switch to the next window using Windowhandles.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> switchTOWindow=new ArrayList<String>(windowHandles);
		int sSize = windowHandles.size();
		driver.switchTo().window(switchTOWindow.get(sSize-1));
	
		//click on the confirm button in the redirecting page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		//Get the title
		System.out.println(driver.getTitle());
		
		//Get back to the parent window
		driver.switchTo().window(switchTOWindow.get(0));
		driver.quit();
		
	}

}
