package scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_File_Upload extends BaseClass{
	
	@Test
	public void tc1() throws InterruptedException, AWTException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohelhakeem@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		//Thread.sleep(2000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
		
		Thread.sleep(2000);
		
//		WebElement upload_file = driver.findElement(By.id("contained-button-file"));
//		upload_file.sendKeys("‪D:\\automtion scipts pic\\green.jpg");
//		Thread.sleep(5000);
//		WebElement save_Button = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
//		save_Button.click();
//		Thread.sleep(3000);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
	}
	
	@Test
	public void tc2() throws InterruptedException, AWTException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohelhakeem@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		//Thread.sleep(2000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
		
		Thread.sleep(2000);
		
//		WebElement upload_file = driver.findElement(By.id("contained-button-file"));
//		//Click action on upload file.
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", upload_file);
//
//		Thread.sleep(1000);
//		
//		// creating object of Robot class
//	    Robot rb = new Robot();
//	 
//	    // copying File path to Clipboard
//	    StringSelection str = new StringSelection("D:\\automtion scipts pic\\car.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//	 Thread.sleep(500);
//	     // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	 
//	    // release Contol+V for pasting
//	    rb.keyRelease(KeyEvent.VK_CONTROL);
//	    rb.keyRelease(KeyEvent.VK_V);
//	 
//	    // for pressing and releasing Enter
//	    rb.keyPress(KeyEvent.VK_ENTER);
//	    rb.keyRelease(KeyEvent.VK_ENTER);
//	    
//	    Thread.sleep(1000);
//		WebElement save_Button = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
//		save_Button.click();
//		Thread.sleep(3000);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
		
	}
	
}
