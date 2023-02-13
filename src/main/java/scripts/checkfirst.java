package scripts;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class checkfirst extends BaseClass{
	@Test(priority=10, retryAnalyzer = MyRetry.class)
	public void tc11() throws InterruptedException, AWTException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		Thread.sleep(500);
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//div[@class='webAutoWidth']//button[@type='button']"));
		scheduleMeeting.click();
		Thread.sleep(500);
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
//		Thread.sleep(2000);
		
		WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
		 js.executeScript("arguments[0].scrollIntoView(true);", Recuring_Schedule);
		 Thread.sleep(500);
		Recuring_Schedule.click();
		//Thread.sleep(2000);
		
		
		Thread.sleep(1000);
		//participant_Seats_drp_Down
			WebElement FREQUENCY_DD = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmR rexflexHalf']//div[@id='demo-simple-select-outlined']"));
			FREQUENCY_DD.click();
//			js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
			Thread.sleep(1000);
			//to SELECT yesrly FROM DROP DOWN
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);
			WebElement Repeat_Every = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmL rexflexHalf']//div[@id='demo-simple-select-outlined']"));
			Repeat_Every.click();
			js.executeScript("arguments[0].scrollIntoView();", Repeat_Every);
			Thread.sleep(500);
			
			//to SELECT  3 YEAR FROM DROP DOWN
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(400);
			
			//selectslot 15 min
		 	WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 	js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
		 	Thread.sleep(500);
		 	selectslot_15.click();
			
			//select Custom Seats 
			WebElement  selectseats_Custom= driver.findElement(By.xpath("(//button[normalize-space()='Custom'])[2]"));
			selectseats_Custom.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
			
			//participant_Seats_drp_Down
			Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
			participant_drp.selectByVisibleText("6 Participant Seats");
			js.executeScript("arguments[0].scrollIntoView();", participant_drp);
			  
			  //Save_Button 
			  
//			  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
//			  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();", Save_Button);
			 
	}
	
	
}
	
	
   

		
		
		
		
		
	
		

