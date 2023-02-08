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
	@Test
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
		WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
		Host_License.click();
		
		WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
		Thread.sleep(200);
		Recurring_Schedule_btn.click();
		Thread.sleep(500);
		
	}
	
	@Test
	public void tc2() throws InterruptedException, AWTException, IOException {
		
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
		WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
		Host_License.click();
		
		WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
		Thread.sleep(200);
		Recurring_Schedule_btn.click();
		 
		//selectslot 15 min
		 WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(3000);
			
	}
	
	@Test
	public void tc3() throws InterruptedException, AWTException, IOException {
		
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
		WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
		Host_License.click();
		
		WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
		Thread.sleep(200);
		Recurring_Schedule_btn.click();
		
		//selectslot 15 min
		WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		selectslot_15.click();
		js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
		Thread.sleep(300);
		
		//select 4 Seats 
		WebElement  selectseats_4= driver.findElement(By.xpath("(//div[@class='radioGroup'])[4]"));
		selectseats_4.click();
		js.executeScript("arguments[0].scrollIntoView();", selectseats_4);
		Thread.sleep(300);
		
	}
	@Test(retryAnalyzer = MyRetry.class)
	public void tc4() throws InterruptedException, AWTException, IOException {
		
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
		WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
		Host_License.click();
		
		WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
		Thread.sleep(200);
		Recurring_Schedule_btn.click();
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
	@Test(retryAnalyzer = MyRetry.class)
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
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//div[@class='webAutoWidth']//button[@type='button']"));
		scheduleMeeting.click();
		
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
		
		WebElement License_DD = driver.findElement(By.xpath("//div[@id='outlined-basic']"));
		License_DD.click();
		WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
		Host_License.click();
		
		WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
		Thread.sleep(200);
		Recurring_Schedule_btn.click();		//selectslot 15 min
		 WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(300);
			
			//selectslot 30 min
			WebElement  selectslot_30= driver.findElement(By.xpath("(//div[@class='radioGroup'])[2]"));
			selectslot_30.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_30);
			Thread.sleep(300);
			
			//select 4 Seats 
			WebElement  selectseats_4= driver.findElement(By.xpath("(//div[@class='radioGroup'])[4]"));
			selectseats_4.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_4);
			Thread.sleep(300);
			
			//select 2 Seats 
			WebElement  selectseats_2= driver.findElement(By.xpath("(//div[@class='radioGroup'])[3]"));
			selectseats_2.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_2);
			Thread.sleep(300);
			
			//select 8 Seats 
			WebElement  selectseats_8= driver.findElement(By.xpath("(//div[@class='radioGroup'])[5]"));
			selectseats_8.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_8);
			Thread.sleep(300);
			
			//select Custom Seats 
			WebElement  selectseats_Custom= driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
			selectseats_Custom.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
			Thread.sleep(300);
			
	}
	@Test
	public void tc6() throws InterruptedException, AWTException, IOException {
		
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
		WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
		Host_License.click();
		
		WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
		Thread.sleep(200);
		Recurring_Schedule_btn.click();
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
	
	@Test(retryAnalyzer = MyRetry.class)
	public void tc7() throws InterruptedException, AWTException, IOException {
		
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
		WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
		Host_License.click();
		
		WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
		Thread.sleep(200);
		Recurring_Schedule_btn.click();
		
		//Select Custom slot
		WebElement custom_slot = driver.findElement(By.xpath("//div[5]//button[1]"));
		custom_slot.click();
		Select hours_DD = new Select (driver.findElement(By.xpath("//select[@id='selectHours']")));
		hours_DD.selectByVisibleText("1 hours");
		Select minutes_DD =new Select ( driver.findElement(By.xpath("//select[@id='selectMins']")));
		minutes_DD.selectByVisibleText("15 minutes");
		Thread.sleep(200);
		
		WebElement cancel = driver.findElement(By.xpath("//span[normalize-space()='CANCEL']"));
		js.executeScript("arguments[0].scrollIntoView();",cancel);
		Thread.sleep(200);
		cancel.isDisplayed();
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(200);
		
		//Select Participant Seats
		WebElement custom_seats = driver.findElement(By.xpath("//div[@class='sdulItem']//button[@class='customSlotBtn'][normalize-space()='Custom']"));
		js.executeScript("arguments[0].scrollIntoView();",custom_seats);
		Thread.sleep(200);
		custom_seats.click();
		Select seats_dd = new Select (driver.findElement(By.xpath("//select[@id='selecSeats']")));
		seats_dd.selectByVisibleText("5 Participant Seats");
		Thread.sleep(2000);
			
	}
	
	@Test
	public void tc8() throws InterruptedException, AWTException, IOException {
		
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
		WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
		Host_License.click();
		
		WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
		Thread.sleep(200);
		Recurring_Schedule_btn.click();
		
			
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
	
	//REAPEAT ON ALL DAYS OF WEEK
		@Test(retryAnalyzer = MyRetry.class)
		public void tc9() throws InterruptedException, AWTException, IOException {
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
			WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
			Host_License.click();
			
			WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
			Thread.sleep(200);
			Recurring_Schedule_btn.click();
			//participant_Seats_drp_Down
				WebElement news = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmR rexflexHalf']//div[@id='demo-simple-select-outlined']"));
				news.click();
				js.executeScript("arguments[0].scrollIntoView();", news);
				
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
				
				//Select Custom slot
				WebElement custom_slot = driver.findElement(By.xpath("//div[5]//button[1]"));
				custom_slot.click();
				Select hours_DD = new Select (driver.findElement(By.xpath("//select[@id='selectHours']")));
				hours_DD.selectByVisibleText("1 hours");
				Select minutes_DD =new Select ( driver.findElement(By.xpath("//select[@id='selectMins']")));
				minutes_DD.selectByVisibleText("15 minutes");
				Thread.sleep(200);
				
				WebElement cancel = driver.findElement(By.xpath("//span[normalize-space()='CANCEL']"));
				js.executeScript("arguments[0].scrollIntoView();",cancel);
				Thread.sleep(200);
				cancel.isDisplayed();
				driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
				Thread.sleep(200);
				
				//Select Participant Seats
				WebElement custom_seats = driver.findElement(By.xpath("//div[@class='sdulItem']//button[@class='customSlotBtn'][normalize-space()='Custom']"));
				js.executeScript("arguments[0].scrollIntoView();",custom_seats);
				Thread.sleep(200);
				custom_seats.click();
				Select seats_dd = new Select (driver.findElement(By.xpath("//select[@id='selecSeats']")));
				seats_dd.selectByVisibleText("5 Participant Seats");
				 
		}
		
		//Select Frequency Month and repeat 3 Months
		@Test
		public void tc10() throws InterruptedException, AWTException, IOException {
			
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
			WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
			Host_License.click();
			
			WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
			Thread.sleep(200);
			Recurring_Schedule_btn.click();
			 
			//participant_Seats_drp_Down
				WebElement FREQUENCY_DD = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmR rexflexHalf']//div[@id='demo-simple-select-outlined']"));
				FREQUENCY_DD.click();
				js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
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
				
				//Select Custom slot
				WebElement custom_slot = driver.findElement(By.xpath("//div[5]//button[1]"));
				custom_slot.click();
				Select hours_DD = new Select (driver.findElement(By.xpath("//select[@id='selectHours']")));
				hours_DD.selectByVisibleText("1 hours");
				Select minutes_DD =new Select ( driver.findElement(By.xpath("//select[@id='selectMins']")));
				minutes_DD.selectByVisibleText("15 minutes");
				Thread.sleep(200);
				
				WebElement cancel = driver.findElement(By.xpath("//span[normalize-space()='CANCEL']"));
				js.executeScript("arguments[0].scrollIntoView();",cancel);
				Thread.sleep(200);
				cancel.isDisplayed();
				driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
				Thread.sleep(200);
				
				//Select Participant Seats
				WebElement custom_seats = driver.findElement(By.xpath("//div[@class='sdulItem']//button[@class='customSlotBtn'][normalize-space()='Custom']"));
				js.executeScript("arguments[0].scrollIntoView();",custom_seats);
				Thread.sleep(200);
				custom_seats.click();
				Select seats_dd = new Select (driver.findElement(By.xpath("//select[@id='selecSeats']")));
				seats_dd.selectByVisibleText("5 Participant Seats");
				 
		}
		
		//Select Frequency yearly and repeat 3 Years
		@Test
		public void tc11() throws InterruptedException, AWTException, IOException {
			
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
			WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
			Host_License.click();
			
			WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
			Thread.sleep(200);
			Recurring_Schedule_btn.click();
			 
			//participant_Seats_drp_Down
				WebElement FREQUENCY_DD = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmR rexflexHalf']//div[@id='demo-simple-select-outlined']"));
				FREQUENCY_DD.click();
				js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
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
				 
		}
		
		//ALL FEATURES RECURRING SCHEDULE.
		@Test(retryAnalyzer = MyRetry.class)
		public void tc12() throws InterruptedException, AWTException, IOException {
			
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
			WebElement Host_License = driver.findElement(By.xpath("//li[normalize-space()='INVCHOST100_100']"));
			Host_License.click();
			
			WebElement  Recurring_Schedule_btn= driver.findElement(By.xpath("(//span[@class='MuiSwitch-root'])[2]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",Recurring_Schedule_btn);
			Thread.sleep(200);
			Recurring_Schedule_btn.click();
			
			//participant_Seats_drp_Down
				WebElement FREQUENCY_DD = driver.findElement(By.xpath("//div[@class='flexCol pdngCstmR rexflexHalf']//div[@id='demo-simple-select-outlined']"));
				FREQUENCY_DD.click();
				js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
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
				  
				  
				Thread.sleep(200);
				WebElement Schedule_Meeting_Button = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
				Schedule_Meeting_Button.click();
				Thread.sleep(500);
				
				String actual_Text = "Meeting Details";
				String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
				Assert.assertEquals(actual_Text, exp_Text);
				  
		}

		
		 
		//Remove only selected days
				
		//Delete all recurring days completely
		@Test(retryAnalyzer = MyRetry.class)
		public void tc14() throws InterruptedException, AWTException, IOException {

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
