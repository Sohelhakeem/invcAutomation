package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_JoinMeetingPage extends BaseClass {
	//Verifying the functionality of joinmeeting
	@Test(retryAnalyzer = MyRetry.class)
	public void tc1() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(5000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		
		String Exp_Text="Provide Meeting ID in the below input box.";
		String actual_Text= driver.findElement(By.xpath("//span[@class='mrgnBtmSM infoTXTSM']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		
		}
	//Verifying the functionality of joinmeeting - my Meeting TF
	@Test(retryAnalyzer = MyRetry.class)
	public void tc2() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		String Exp_Text="Provide Meeting ID in the below input box.";
		String actual_Text= driver.findElement(By.xpath("//span[@class='mrgnBtmSM infoTXTSM']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		
	}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon
	@Test(retryAnalyzer = MyRetry.class)
	public void tc3() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();

		String Exp_Text="Ready to Join ?";
		String actual_Text= driver.findElement(By.xpath("//span[@class='joinText resPdngTop']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		
		
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon-EnterName.
	@Test(retryAnalyzer = MyRetry.class)
	public void tc4() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		
		//URL changes with meeting Id
		Thread.sleep(2000);
		String Exp_Text="Ready to Join ?";
		String actual_Text= driver.findElement(By.xpath("//span[@class='joinText resPdngTop']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon - enterName- join
	@Test(retryAnalyzer = MyRetry.class)
	public void tc5() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		
		WebElement joinButton = driver.findElement(By.xpath("//button[@id='joinButton']"));
		joinButton.click();
		//URL changes with meeting Id
		Thread.sleep(3000);
//		String Exp_Text="Sohail (Host)";
//		String actual_Text= driver.findElement(By.xpath("//span[@class='jss147']")).getText();
//		Assert.assertEquals(Exp_Text,actual_Text);
		
		WebElement leaveButton = driver.findElement(By.xpath("//button[@aria-label='Leave']"));
		leaveButton.isDisplayed();
		
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon - enterName- join-Leave-No
	@Test(retryAnalyzer = MyRetry.class)
	public void tc6() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("joinMeeting"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Invc@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		Thread.sleep(1000);
		WebElement joinButton = driver.findElement(By.xpath("//button[@id='joinButton']"));
		joinButton.click();
		
		Thread.sleep(3000);
		WebElement leaveButton = driver.findElement(By.xpath("//button[@aria-label='Leave']"));
		leaveButton.click();
		Thread.sleep(500);
		
		WebElement leaveButton2 = driver.findElement(By.xpath("(//div[@role='presentation'])[3]"));
		leaveButton2.click();

		Thread.sleep(2000);
		WebElement NoButton = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary']"));
		NoButton.click();
		
		//URL changes with meeting Id
		String Exp_Text="Leave";
		String actual_Text= driver.findElement(By.xpath("//b[normalize-space()='Leave']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon - enterName- join-Leave-YES
	@Test(retryAnalyzer = MyRetry.class)
	public void tc7() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("joinMeeting"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Invc@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		Thread.sleep(1000);
		WebElement joinButton = driver.findElement(By.xpath("//button[@id='joinButton']"));
		joinButton.click();
		
		Thread.sleep(3000);
		WebElement leaveButton = driver.findElement(By.xpath("//button[@aria-label='Leave']"));
		leaveButton.click();
		Thread.sleep(500);
		
		WebElement leaveButton2 = driver.findElement(By.xpath("(//div[@role='presentation'])[3]"));
		leaveButton2.click();

		Thread.sleep(2000);
		WebElement YesButton = driver.findElement(By.xpath("//div[@role='none presentation']//button[2]"));
		YesButton.click();
		Thread.sleep(2000);

		String actualUrl="https://app.invc.vc/meeting";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
		}
	
}
