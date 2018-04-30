package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Empreg extends TestNGMaster
{
	@Test
	public void OrgEmpreg()
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}

}
