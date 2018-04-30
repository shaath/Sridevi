package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=91ff79c41241341fab81fb0250cee9cd");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("//select[@name='country']"));

		Select s=new Select(drop);
		
		List<WebElement> cList=s.getOptions();
		System.out.println(cList.size());
		
		for (int i = 0; i < cList.size(); i++) 
		{
//			s.selectByIndex(i);
			
//			String name=cList.get(i).getText();
//			System.out.println(name);
//			s.selectByVisibleText(name);
			
			String name=cList.get(i).getAttribute("value");
			System.out.println(name);
			s.selectByValue(name);
		}
	}

}
