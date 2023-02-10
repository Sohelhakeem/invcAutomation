package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_Recurring_Schedule extends BaseClass {
	@Test(priority=0, retryAnalyzer = MyRetry.class)
	public void tc1() throws InterruptedException, AWTException, IOException {
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
		
	}
	
	@Test(priority=1, retryAnalyzer = MyRetry.class)
	public void tc2() throws InterruptedException, AWTException, IOException {
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
		Recuring_Schedule.click();;
		 
		//selectslot 15 min
		 WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(3000);
			
	}
	
	@Test(priority=2, retryAnalyzer = MyRetry.class)
	public void tc3() throws InterruptedException, AWTException, IOException {
		
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
		
		//selectslot 15 min
		WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		selectslot_15.click();
		js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
		Thread.sleep(3000);
		
		//select 4 Seats 
		WebElement  selectseats_4= driver.findElement(By.xpath("(//div[@class='radioGroup'])[4]"));
		selectseats_4.click();
		js.executeScript("arguments[0].scrollIntoView();", selectseats_4);
		Thread.sleep(3000);
		
	}
	@Test(priority=3, retryAnalyzer = MyRetry.class)
	public void tc4() throws InterruptedException, AWTException, IOException {
		
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
		//selectslot 15 min
		 WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(3000);
			
			//selectslot 30 min
			WebElement  selectslot_30= driver.findElement(By.xpath("(//div[@class='radioGroup'])[2]"));
			selectslot_30.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_30);
			Thread.sleep(3000);
			
			//select 4 Seats 
			WebElement  selectseats_4= driver.findElement(By.xpath("(//div[@class='radioGroup'])[4]"));
			selectseats_4.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_4);
			Thread.sleep(3000);
			
			//select 2 Seats 
			WebElement  selectseats_2= driver.findElement(By.xpath("(//div[@class='radioGroup'])[3]"));
			selectseats_2.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_2);
			Thread.sleep(3000);
			
	}
	@Test(priority=4, retryAnalyzer = MyRetry.class)
	public void tc5() throws InterruptedException, AWTException, IOException {
		
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
		//selectslot 15 min
		 WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(3000);
			
			//selectslot 30 min
			WebElement  selectslot_30= driver.findElement(By.xpath("(//div[@class='radioGroup'])[2]"));
			selectslot_30.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_30);
			Thread.sleep(3000);
			
			//select 4 Seats 
			WebElement  selectseats_4= driver.findElement(By.xpath("(//div[@class='radioGroup'])[4]"));
			selectseats_4.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_4);
			Thread.sleep(3000);
			
			//select 2 Seats 
			WebElement  selectseats_2= driver.findElement(By.xpath("(//div[@class='radioGroup'])[3]"));
			selectseats_2.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_2);
			Thread.sleep(3000);
			
			//select 8 Seats 
			WebElement  selectseats_8= driver.findElement(By.xpath("(//div[@class='radioGroup'])[5]"));
			selectseats_8.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_8);
			Thread.sleep(3000);
			
			//select Custom Seats 
			WebElement  selectseats_Custom= driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
			selectseats_Custom.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
			Thread.sleep(3000);
			
	}
	@Test(priority=5, retryAnalyzer = MyRetry.class)
	public void tc6() throws InterruptedException, AWTException, IOException {
		
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
			
	}
	
	@Test(priority=6, retryAnalyzer = MyRetry.class)
	public void tc7() throws InterruptedException, AWTException, IOException {
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
			
			
//			//Cancel_Button
//			WebElement  Cancel_Button= driver.findElement(By.xpath("//div[@class='selectTimeBlock width50']//span[@class='MuiButton-label'][normalize-space()='CANCEL']"));
//			Cancel_Button.click();
//			js.executeScript("arguments[0].scrollIntoView();", Cancel_Button);
			
	}
	
	@Test(priority=7, retryAnalyzer = MyRetry.class)
	public void tc8() throws InterruptedException, AWTException, IOException {
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
//			WebElement  Save_Button= driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
//			Save_Button.click();
//			js.executeScript("arguments[0].scrollIntoView();", Save_Button);
	}
	
	//REAPEAT ON ALL DAYS OF WEEK
		@Test(priority=8, retryAnalyzer = MyRetry.class)
		public void tc9() throws InterruptedException, AWTException, IOException {
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
//			Thread.sleep(2000);
			
			WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
			 js.executeScript("arguments[0].scrollIntoView(true);", Recuring_Schedule);
			 Thread.sleep(500);
			Recuring_Schedule.click();
			//participant_Seats_drp_Down
			WebElement FREQUENCY_DD = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmR rexflexHalf']//div[@id='demo-simple-select-outlined']"));
			FREQUENCY_DD.click();
//			js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
			Thread.sleep(1000);
			
				
				//to SELECT WEEK FROM DROP DOWN
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				
				//Select Sun_CheckBox
				WebElement  Sun_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[4]"));
				Sun_CheckBox.click();
				Thread.sleep(100);
				Sun_CheckBox.click();
				
				//Select Mon_CheckBox
				WebElement  Mon_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[5]"));
				Mon_CheckBox.click();
				Thread.sleep(100);
				Mon_CheckBox.click();
				
				//Select Tue_CheckBox
				WebElement  Tue_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[6]"));
				Tue_CheckBox.click();
				Thread.sleep(100);
				Tue_CheckBox.click();
				
				//Select Wed_CheckBox
				WebElement  Wed_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[7]"));
				Wed_CheckBox.click();
				Thread.sleep(100);
				Wed_CheckBox.click();
				
				//Select Thu_CheckBox
				WebElement  Thu_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[8]"));
				Thu_CheckBox.click();
				Thread.sleep(100);
				Thu_CheckBox.click();
				
				//Select Fri_CheckBox
				WebElement  Fri_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[9]"));
				Fri_CheckBox.click();
				Thread.sleep(100);
				Fri_CheckBox.click();
				
				//Select Sat_CheckBox
				WebElement  Sat_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[10]"));
				Sat_CheckBox.click();
				Thread.sleep(100);
				Sat_CheckBox.click();
				Thread.sleep(300);
				
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
				  
//				  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
//				  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();",
//				  Save_Button);
				 
		}
		
		//Select Frequency Month and repeat 3 Months
		@Test(priority=9, retryAnalyzer = MyRetry.class)
		public void tc10() throws InterruptedException, AWTException, IOException {
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
//			Thread.sleep(2000);
			
			WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
			 js.executeScript("arguments[0].scrollIntoView(true);", Recuring_Schedule);
			 Thread.sleep(500);
			Recuring_Schedule.click();
			//Thread.sleep(2000);
			
			
			Thread.sleep(1000);
			//participant_Seats_drp_Down
				WebElement FREQUENCY_DD = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmR rexflexHalf']//div[@id='demo-simple-select-outlined']"));
				FREQUENCY_DD.click();
//				js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
				Thread.sleep(1000);
				
				//to SELECT MONTH FROM DROP DOWN
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
				WebElement Repeat_Every = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmL rexflexHalf']//div[@id='demo-simple-select-outlined']"));
				Repeat_Every.click();
				js.executeScript("arguments[0].scrollIntoView();", Repeat_Every);
				Thread.sleep(1000);
				
				//to SELECT  3 MONTHS FROM DROP DOWN
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
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
//				  
//				  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
//				  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();", Save_Button);
				 
		}
		
		//Select Frequency yearly and repeat 3 Years
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
//			Thread.sleep(2000);
			
			WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
			 js.executeScript("arguments[0].scrollIntoView(true);", Recuring_Schedule);
			 Thread.sleep(500);
			Recuring_Schedule.click();
			//Thread.sleep(2000);
			
			
			Thread.sleep(1000);
			//participant_Seats_drp_Down
				WebElement FREQUENCY_DD = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmR rexflexHalf']//div[@id='demo-simple-select-outlined']"));
				FREQUENCY_DD.click();
//				js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
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
				  
//				  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
//				  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();", Save_Button);
				 
		}
		
		//ALL FEATURES RECURRING SCHEDULE.
		@Test(priority=11, retryAnalyzer = MyRetry.class)
		public void tc12() throws InterruptedException, AWTException, IOException {
			
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
//			Thread.sleep(2000);
			
			WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
			 js.executeScript("arguments[0].scrollIntoView(true);", Recuring_Schedule);
			 Thread.sleep(500);
			Recuring_Schedule.click();
			//Thread.sleep(2000);
			
			
			Thread.sleep(1000);
			//participant_Seats_drp_Down
				WebElement FREQUENCY_DD = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmR rexflexHalf']//div[@id='demo-simple-select-outlined']"));
				FREQUENCY_DD.click();
//				js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
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
				
				Thread.sleep(500);
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
				WebElement Occurance_Ends = driver.findElement(By.xpath("//input[@value='5']"));
//				Occurance_Ends.clear();
				Occurance_Ends.sendKeys(Keys.chord(Keys.CONTROL,"a"));
				Occurance_Ends.sendKeys("20");
				Thread.sleep(500);
				//selectslot 15 min
			 	WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
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
				  
//				  //Save_Button 
//				  
//				  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
//				  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();", Save_Button);
				  
				  WebElement add_invitees=driver.findElement(By.xpath("//div[@class='flexCol pdngVtclMD']//input[@id='outlined-basic']"));
				  js.executeScript("arguments[0].scrollIntoView();",add_invitees);
				  Thread.sleep(200);
				  add_invitees.sendKeys("iqra@yopmail.com"); 
				  Thread.sleep(500);
				  r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
					
				  Thread.sleep(500);
					WebElement Schedule_Meeting_Button = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
					 js.executeScript("arguments[0].scrollIntoView();",Schedule_Meeting_Button);
					  Thread.sleep(500);
					Schedule_Meeting_Button.click();
					Thread.sleep(1000);
					String actual_Text = "Meeting Details";
					String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
					Assert.assertEquals(actual_Text, exp_Text);
				  
		}
		//Remove only selected days
				
		//Delete all recurring days completely
		@Test(priority=13, retryAnalyzer = MyRetry.class)
		public void tc14() throws InterruptedException, AWTException, IOException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys(p.getPropertyFiledata("mail_id"));
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(p.getPropertyFiledata("password"));
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
			myMeetingLink.click();
			
			WebElement  Delete_Meeting= driver.findElement(By.xpath("//div[@class='flexMinWidth jcFE']//div[1]//button[1]"));
			Delete_Meeting.click();
			
			WebElement  Radio_Btn= driver.findElement(By.xpath("//input[@value='delAll']"));
			Radio_Btn.click();
			
			WebElement  Confirm_Delete= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
			Confirm_Delete.click();
			
			String actual_Text = "My Meetings";
			String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='My Meetings']")).getText();
			Assert.assertEquals(actual_Text, exp_Text);
			
		}
//		
//		@Test
//		public void tc15() throws InterruptedException, AWTException, IOException {
//			WebElement username=driver.findElement(By.id("email"));
//			username.sendKeys(p.getPropertyFiledata("mail_id"));
//			
//			WebElement password=driver.findElement(By.id("password"));
//			password.sendKeys(p.getPropertyFiledata("password"));
//			
//			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//			login.click();
//			
//			WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
//			myMeetingLink.click();
//			
//			WebElement  Delete_Meeting= driver.findElement(By.xpath("//div[@class='flexMinWidth jcFE']//div[1]//button[1]"));
//			Delete_Meeting.click();
//			
//			WebElement  Radio_Btn= driver.findElement(By.xpath("//input[@value='dates']"));
//			Radio_Btn.click();
//			
//			WebElement  Check_Box= driver.findElement(By.xpath("(//input[@class='jss22'])[3]"));
//			Check_Box.click();
//			
//			WebElement  Confirm_Delete= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
//			Confirm_Delete.click();
//			
//			String actual_Text = "My Meetings";
//			String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='My Meetings']")).getText();
//			Assert.assertEquals(actual_Text, exp_Text);
//			
//		}
		
}
