package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEg3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		Links_Count(driver, "http://facebook.com");
	}

	public static void Links_Count(WebDriver driver, String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(5);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The number of links in "+driver.getTitle()+" page:"+links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String lName=links.get(i).getText();
			System.out.println(lName);
		}
	}
}
