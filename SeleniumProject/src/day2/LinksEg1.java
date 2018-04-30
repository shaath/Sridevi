package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(5);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The number of links in google page:"+links.size());
		
//		System.out.println(links.get(1).getText());
		
//		System.out.println(links.get(1).getAttribute("class"));
		
		for (int i = 0; i < links.size(); i++) 
		{
			String lName=links.get(i).getText();
			System.out.println(lName);
			if (lName.equalsIgnoreCase("gmail")) 
			{
				links.get(i).click();
				break;
			}
		}
	}

}
