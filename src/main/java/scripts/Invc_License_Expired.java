package scripts;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Invc_License_Expired extends BaseClass {
	@Test(priority=0,retryAnalyzer = MyRetry.class)
	public void tc1() throws InterruptedException, IOException{
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("LE_mail"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("LE_pass"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(3000);
		
		WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
		instaMeetingIcon.click();
//		Thread.sleep(2000);
		
		WebElement LicenceButton = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		LicenceButton.click();
//		Thread.sleep(5000);
		
		String parentID = driver.getWindowHandle();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		if(parentID.equals(tabs2.get(0))) {
		  driver.switchTo().window(tabs2.get(1));
		}else {
		  driver.switchTo().window(tabs2.get(0));
		}
		
		String actualUrl="https://www.invc.vc/pricing/";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
	}
	
	@Test(priority =1 , retryAnalyzer = MyRetry.class)
	public void tc2() throws InterruptedException, IOException{
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("LE_mail"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("LE_pass"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(3000);
		
		WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
		instaMeetingIcon.click();
		
		WebElement LicenceButton = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		LicenceButton.click();
//		Thread.sleep(8000);
		
		String parentID = driver.getWindowHandle();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		if(parentID.equals(tabs2.get(0))) {
		  driver.switchTo().window(tabs2.get(1));
		}else {
		  driver.switchTo().window(tabs2.get(0));
		}
		
		WebElement cancelBtn = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		cancelBtn.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
//		Thread.sleep(3000);
		
		WebElement startTrail = driver.findElement(By.xpath("//a[text()='Start Trial']"));
		startTrail.click();
		
//		Thread.sleep(3000);
		String actualUrl="https://app.invc.vc/sign-up?redirect=/place-your-order/INVCFREE/1";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		}
}
