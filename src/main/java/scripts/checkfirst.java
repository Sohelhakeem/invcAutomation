package scripts;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class checkfirst extends BaseClass{
	@Test
	public void tc6() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		Thread.sleep(1000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
		
		WebElement contactInfo =driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
		contactInfo.click();
		
		WebElement websiteLinkAddBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		websiteLinkAddBtn.click();

		WebElement websiteTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		websiteTf.clear();
		
		//Thread.sleep(3000);
		WebElement websiteSaveBtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
		websiteSaveBtn.click();
		
		Thread.sleep(3000);
		String ExpectedErrorMsg = "Please Enter the Website name";
		WebElement exp = driver.findElement(By.xpath("//p[@class='MuiFormHelperText-root Mui-error Mui-required MuiFormHelperText-marginDense']"));
		String actualErrorMsg =  exp.getText();
		Assert.assertEquals(actualErrorMsg, ExpectedErrorMsg);
		
		}
	
}
	
	
   

		
		
		
		
		
	
		

