package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MouseHoveopsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.id("nav-link-shopall"));
		Actions act=new Actions(driver);
		act.moveToElement(cat).build().perform();
		Sleeper.sleepTightInSeconds(3);
		
		WebElement bools=driver.findElement(By.xpath("//span[text()='Books']"));
		act.moveToElement(bools).build().perform();
		
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath("//span[text()='Textbooks']")).click();

	}

}
