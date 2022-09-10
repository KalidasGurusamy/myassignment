package week5.day2homeassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2Windows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		int sSize = windowHandles.size();
		System.out.println("Size of the Window - " + windowHandles.size());
		List<String> switchTOWindow=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(switchTOWindow.get(sSize-1));
		System.out.println(driver.getTitle());
		
		for(int i=0;i<sSize-1;i++)
		{
			driver.switchTo().window(switchTOWindow.get(i));
			driver.close();
		}
		

	}

}
