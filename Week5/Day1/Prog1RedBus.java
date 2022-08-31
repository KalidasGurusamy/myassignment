package week5.day1homeassignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1RedBus {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://www.redbus.in/");
		
		String strdate ="30-Sept-2022";
		Boolean sMonfnd = true;
		
		WebElement sSource = driver.findElement(By.id("src"));
		WebElement sDest = driver.findElement(By.id("dest"));
		
		
		sSource.sendKeys("madi");
		Thread.sleep(1000);
		sSource.sendKeys(Keys.ENTER);
		
		sDest.sendKeys("koya");
		Thread.sleep(1000);
		sDest.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(1000);
		
		String splitter[] = strdate.split("-");
		String month_year = splitter[1] + " " + splitter[2];
		String day = splitter[0]; 
		//System.out.println(month_year);
		//System.out.println(day);
		
		/*List<WebElement> days = driver.findElements(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[3]/td"));
		System.out.println(days.size());*/
		
		while(sMonfnd)
		{
			String sMontxt = driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[1]/td[2]")).getText();
			//System.out.println(sMontxt);
			if (sMontxt.equalsIgnoreCase(month_year))
			{
				//System.out.println("Match");
				List<WebElement> daysrow = driver.findElements(By.xpath("//div[@class='rb-calendar']/table/tbody/tr"));
				for(int i=3;i<=daysrow.size(); i++)
				{
					List<WebElement> dayscolumn = driver.findElements(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[" + i + "]/td"));
					for(int j=0; j<dayscolumn.size();j++)
					{
						if(day.equalsIgnoreCase(dayscolumn.get(j).getText()))
						{
							j=j+1;
							driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[" + i + "]/td[" + j + "]")).click();
							sMonfnd = false;
							break;
						}
						
							
					}
				}
			}
			else
			{
				//System.out.println("Not Match");
				driver.findElement(By.xpath("//td[@class='next']/button")).click();
				Thread.sleep(1000);
			}
			
		}
		System.out.println(driver.getTitle());
		
		
	}

}
