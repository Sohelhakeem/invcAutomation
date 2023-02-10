package scripts;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class checkfirst extends BaseClass{
	@Test(retryAnalyzer = MyRetry.class)
	public void tc7() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
//		Thread.sleep(2000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
		

		WebElement profEditBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		profEditBtn.click();
		Thread.sleep(500);
//		Thread.sleep(2000);
		WebElement position=driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		position.click();
		
		String exp_Txt = "Official Details";
		String act_Txt = driver.findElement(By.xpath("//h3[normalize-space()='Official Details']")).getText();
		Assert.assertEquals(exp_Txt, act_Txt);
		
		
	}
	
	//Verifying the Functionality inVC Professional Details with Valid Details. 
	@Test(retryAnalyzer = MyRetry.class)
	public void tc8() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
//		Thread.sleep(2000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
		

		WebElement profEditBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		profEditBtn.click();
//		Thread.sleep(2000);
		
		WebElement position=driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		position.sendKeys("Test Engineer");
		
		WebElement Email=driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
		Email.sendKeys("sohel@peoplelinkvc.com");
		
		
		WebElement Branch=driver.findElement(By.xpath("(//input[@aria-invalid='false'])[3]"));
		Branch.sendKeys("HM");
		
		WebElement Address=driver.findElement(By.xpath("(//input[@aria-invalid='false'])[4]"));
		Address.sendKeys("Hyderabad");
		
		WebElement saveBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[4]"));
		saveBtn.click();
		
		String exp_Txt = "My Profile";
		String act_Txt = driver.findElement(By.xpath("//h2[normalize-space()='My Profile']")).getText();
		Assert.assertEquals(exp_Txt, act_Txt);
		

	}	
	
}
	
	
   

		
		
		
		
		
	
		

