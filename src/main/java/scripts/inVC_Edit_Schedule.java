package scripts;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;



public class inVC_Edit_Schedule extends BaseClass{
	
	
	//ALL FEATURES RECURRING SCHEDULE.
			@Test(priority=0, retryAnalyzer = MyRetry.class)

			public void tc1() throws InterruptedException, AWTException, IOException {
				
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys(p.getPropertyFiledata("mail"));
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys(p.getPropertyFiledata("pass"));
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
				myMeetingLink.click();
				Thread.sleep(500);
				WebElement  scheduleMeeting= driver.findElement(By.xpath("//div[@class='webAutoWidth']//button[@type='button']"));
				scheduleMeeting.click();
				
				WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
				MeetingTitleTF.sendKeys("SCRUM MEETING");
				
				WebElement License_DD = driver.findElement(By.xpath("//div[@id='outlined-basic']"));
				License_DD.click();
				WebElement Host_License = driver.findElement(By.xpath(p.getPropertyFiledata("License")));
				Host_License.click();
				
				 //selectslot 15 min
				 	WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
				 	JavascriptExecutor js = (JavascriptExecutor) driver;
				 	js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
				 	Thread.sleep(500);
				 	selectslot_15.click();
					
					//select Custom Seats 
					WebElement  selectseats_Custom= driver.findElement(By.xpath("(//button[normalize-space()='Custom'])[2]"));
					selectseats_Custom.click();
					js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
					Thread.sleep(500);
					//participant_Seats_drp_Down
					Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
					participant_drp.selectByVisibleText("6 Participant Seats");
					js.executeScript("arguments[0].scrollIntoView();", participant_drp);
					  
					  
					Thread.sleep(200);
					WebElement Schedule_Meeting_Button = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
					Schedule_Meeting_Button.click();
					Thread.sleep(2000);
					
					String actual_Text = "Meeting Details";
					String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
					Assert.assertEquals(actual_Text, exp_Text);
					  
			}

	
	//Upcoming View Button
	@Test(priority=1, retryAnalyzer = MyRetry.class)
	public void tc2() throws InterruptedException, IOException {

		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		Thread.sleep(500);
		
		WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
		View_Btn.click();
		
		String actual_Text = "Meeting Details";
		String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
		Assert.assertEquals(actual_Text, exp_Text);
		
		
	}
	@Test(priority=2, retryAnalyzer = MyRetry.class)
	public void tc3() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		Thread.sleep(500);
		
		WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
		View_Btn.click();
		
		WebElement  Edit_Btn= driver.findElement(By.xpath("//button[@class='textIconBtn']"));
		Edit_Btn.click();
		Thread.sleep(500);
		
		String actual_Text = "Meeting Title";
		String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Title']")).getText();
		Assert.assertEquals(actual_Text, exp_Text);
	}
	
	//Update_Meeting_Btn
	@Test(priority=3, retryAnalyzer = MyRetry.class)
	public void tc4() throws InterruptedException, IOException {
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
 		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		Thread.sleep(500);
		
		WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
		View_Btn.click();
		
		WebElement  Edit_Btn= driver.findElement(By.xpath("//button[@class='textIconBtn']"));
		Edit_Btn.click();
		Thread.sleep(500);
		 WebElement Update_Schedule =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",Update_Schedule);
		  Thread.sleep(500);
		  Update_Schedule.click(); 
//		  Thread.sleep(1000);
		  String actual_Text = "Meeting Details";
			String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
			Assert.assertEquals(actual_Text, exp_Text);
		
	}

		//Full Features
		@Test(priority=4, retryAnalyzer = MyRetry.class)
		public void tc5() throws InterruptedException, AWTException, IOException {
			
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys(p.getPropertyFiledata("mail"));
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
			myMeetingLink.click();
			Thread.sleep(500);
			
			WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
			View_Btn.click();
			
			WebElement  Edit_Btn= driver.findElement(By.xpath("//button[@class='textIconBtn']"));
			Edit_Btn.click();
			Thread.sleep(500);
			
			WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			MeetingTitleTF.sendKeys("SCRUM MEETING");
			
			WebElement License_DD = driver.findElement(By.xpath("//div[@id='outlined-basic']"));
			License_DD.click();
			WebElement Host_License = driver.findElement(By.xpath(p.getPropertyFiledata("License")));
			Host_License.click();
			
			 //selectslot 15 min
		 	WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 	JavascriptExecutor js = (JavascriptExecutor) driver;
		 	js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
		 	Thread.sleep(500);
		 	selectslot_15.click();
			
			//select Custom Seats 
			WebElement  selectseats_Custom= driver.findElement(By.xpath("(//button[normalize-space()='Custom'])[2]"));
			selectseats_Custom.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
			Thread.sleep(500);
			//participant_Seats_drp_Down
			Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
			participant_drp.selectByVisibleText("6 Participant Seats");
			js.executeScript("arguments[0].scrollIntoView();", participant_drp);
			  
			  
			Thread.sleep(200);
			WebElement Schedule_Meeting_Button = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
			Schedule_Meeting_Button.click();
			Thread.sleep(500);
			
			String actual_Text = "Meeting Details";
			String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
			Assert.assertEquals(actual_Text, exp_Text);
			  		
		
		}
		
		//Delete all recurring days completely
				@Test(priority=5, retryAnalyzer = MyRetry.class)
				public void tc6() throws InterruptedException, AWTException, IOException {
					WebElement username=driver.findElement(By.id("email"));
					username.sendKeys(p.getPropertyFiledata("mail"));
					
					WebElement password=driver.findElement(By.id("password"));
					password.sendKeys(p.getPropertyFiledata("pass"));
					
					WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
					login.click();
					
					WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
					myMeetingLink.click();
					
					WebElement  Delete_Meeting= driver.findElement(By.xpath("//div[@class='flexMinWidth jcFE']//div[1]//button[1]"));
					Delete_Meeting.click();
					
//					WebElement  Radio_Btn= driver.findElement(By.xpath("//input[@value='delAll']"));
//					Radio_Btn.click();
					
					WebElement  Confirm_Delete= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
					Confirm_Delete.click();
					
					String actual_Text = "My Meetings";
					String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='My Meetings']")).getText();
					Assert.assertEquals(actual_Text, exp_Text);
					
				}

}
