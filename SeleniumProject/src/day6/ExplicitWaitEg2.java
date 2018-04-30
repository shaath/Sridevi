package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class ExplicitWaitEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
//		WebDriverWait wait=new WebDriverWait(driver, 40);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Up to 40% off: tableware']"))).click();;

		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
										.withTimeout(40, TimeUnit.SECONDS)
										.pollingEvery(2, TimeUnit.SECONDS)
										.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Up to 40% off: tableware']"))).click();;

	}

}
