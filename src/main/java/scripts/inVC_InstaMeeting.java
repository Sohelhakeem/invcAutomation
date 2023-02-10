package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_InstaMeeting extends BaseClass {
	@Test(retryAnalyzer = MyRetry.class)
	public void tc1() throws InterruptedException, IOException{
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("pwd"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
		instaMeetingIcon.click();
		
		String actualUrl="https://app.invc.vc/insta-meeting";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);

	}
	
	
	//Schedule Insta Meeting.
		@Test(retryAnalyzer = MyRetry.class)
		public void tc2() throws InterruptedException, IOException{
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(p.getPropertyFiledata("pwd"));
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
			instaMeetingIcon.click();
			
			WebElement Meeting_Title = driver.findElement(By.xpath("//input[@id='outlined-basic']"));
			Meeting_Title.sendKeys("Autoamtion_Script");
			
			WebElement License_DD = driver.findElement(By.xpath("//div[@id='outlined-basic']"));
			License_DD.click();
			WebElement Host_License = driver.findElement(By.xpath(p.getPropertyFiledata("License")));
			Host_License.click();
			
			//Select slot
			WebElement slot15_min = driver.findElement(By.xpath("//label[normalize-space()='15min']"));
			slot15_min.click();
			
			//Select Participant Seats
			WebElement four_4 = driver.findElement(By.xpath("//label[normalize-space()='4 Seats']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",four_4);
			Thread.sleep(200);
			four_4.click();
			
			WebElement create_Meeting = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root jss21 MuiButton-contained resBtnFullWidth MuiButton-containedPrimary MuiButton-containedSizeLarge MuiButton-sizeLarge MuiButton-disableElevation']"));
			js.executeScript("arguments[0].scrollIntoView();",create_Meeting);
			Thread.sleep(200);
			create_Meeting.click();
			
			String expected_Text = "Ready to Join ?";
			 WebElement text= driver.findElement(By.xpath("//span[@class='joinText resPdngTop']"));
			 String actual_Text = text.getText();
			Assert.assertEquals(expected_Text, actual_Text);

			}

		//Schedule Insta Meeting Custom time and Custom seats.
		@Test(retryAnalyzer = MyRetry.class)
		public void tc3() throws InterruptedException, IOException{
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(p.getPropertyFiledata("pwd"));
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
			instaMeetingIcon.click();
			
			WebElement Meeting_Title = driver.findElement(By.xpath("//input[@id='outlined-basic']"));
			Meeting_Title.sendKeys("Autoamtion_Script");
			
			WebElement License_DD = driver.findElement(By.xpath("//div[@id='outlined-basic']"));
			License_DD.click();
			WebElement Host_License = driver.findElement(By.xpath(p.getPropertyFiledata("License")));
			Host_License.click();
			
			//Select Custom slot
//			WebElement custom_slot = driver.findElement(By.xpath("//div[5]//button[1]"));
//			custom_slot.click();
//			Select hours_DD = new Select (driver.findElement(By.xpath("//select[@id='selectHours']")));
//			hours_DD.selectByVisibleText("1 hours");
//			Select minutes_DD =new Select ( driver.findElement(By.xpath("//select[@id='selectMins']")));
//			minutes_DD.selectByVisibleText("15 minutes");
			//Select slot
			WebElement slot15_min = driver.findElement(By.xpath("//label[normalize-space()='15min']"));
			slot15_min.click();
			Thread.sleep(200);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//			WebElement cancel = driver.findElement(By.xpath("//span[normalize-space()='CANCEL']"));
//			js.executeScript("arguments[0].scrollIntoView();",cancel);
//			Thread.sleep(200);
//			cancel.isDisplayed();
//			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/button[1]")).click();
//			Thread.sleep(200);
			
			//Select Participant Seats
			WebElement custom_seats = driver.findElement(By.xpath("//div[@class='mainContainer ']//div[3]//div[1]//div[1]//div[1]//div[4]//button[1]"));
			js.executeScript("arguments[0].scrollIntoView();",custom_seats);
			Thread.sleep(200);
			custom_seats.click();
			Select seats_dd = new Select (driver.findElement(By.xpath("//select[@id='selecSeats']")));
			seats_dd.selectByVisibleText("5 Participant Seats");
			
			WebElement create_Meeting = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root jss21 MuiButton-contained resBtnFullWidth MuiButton-containedPrimary MuiButton-containedSizeLarge MuiButton-sizeLarge MuiButton-disableElevation']"));
			js.executeScript("arguments[0].scrollIntoView();",create_Meeting);
			Thread.sleep(200);
			create_Meeting.click();
			
			String expected_Text = "Ready to Join ?";
			 WebElement text= driver.findElement(By.xpath("//span[@class='joinText resPdngTop']"));
			 String actual_Text = text.getText();
			Assert.assertEquals(expected_Text, actual_Text);

			}
		
				
			}
