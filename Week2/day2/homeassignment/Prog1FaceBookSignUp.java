package week2.day2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1FaceBookSignUp {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div/form/div/div/div/div/div/input")).sendKeys("Test FNAME");
		
		driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("Test LNAME");
		
		driver.findElement(By.xpath("//input[contains(@aria-label, 'Mobile number')]")).sendKeys("Testmail");
		
		driver.findElement(By.xpath("//input[@id = 'password_step_input']")).sendKeys("12456");
		
		
		
		Select sBDay =new Select(driver.findElement(By.name("birthday_day")));
		sBDay.selectByIndex(10);
		
		Select sBMonth =new Select(driver.findElement(By.name("birthday_month")));
		sBMonth.selectByValue("9");
		
		Select sBYear =new Select(driver.findElement(By.name("birthday_year")));
		sBYear.selectByVisibleText("1987");
		
		driver.findElement(By.xpath("(//input[@name = 'sex'])[2]")).click();
		
		
		
			
		
	}

}
