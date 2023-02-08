package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_ShareScreenPage extends BaseClass {
	//Verifying the functionality of shareScreen
			@Test(retryAnalyzer = MyRetry.class)
			public void tc1() throws InterruptedException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
//				Thread.sleep(3000);
				
				WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
				shareScreenIcon.click();
				Thread.sleep(500);
				String actualUrl="https://app.invc.vc/join-screenshare";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);
				
				}
			//Verifying the functionality of shareScreen - with Valid meetingId TextField.
			@Test(retryAnalyzer = MyRetry.class)
			public void tc2() throws InterruptedException, IOException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
//				Thread.sleep(3000);
				
				WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
				shareScreenIcon.click();
				Thread.sleep(500);
				WebElement meetingId = driver.findElement(By.id("outlined-basic"));
				meetingId.sendKeys(p.getPropertyFiledata("Meeting_Id"));
				
				String actualUrl="https://app.invc.vc/join-screenshare";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);
				
				}
			//Verifying the functionality of shareScreen - meetingId- join&Share Button.
			@Test(retryAnalyzer = MyRetry.class)
			public void tc3() throws InterruptedException, IOException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
//				Thread.sleep(3000);
				
				WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
				shareScreenIcon.click();
				Thread.sleep(500);
				WebElement meetingId = driver.findElement(By.id("outlined-basic"));
				meetingId.sendKeys(p.getPropertyFiledata("Meeting_Id"));
				Thread.sleep(500);
				WebElement joinAndShareButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/div[4]/button/span[1]"));
				joinAndShareButton.click();
				
				Thread.sleep(1000);
				//URL get changes with every new meeting ID
				String exp_err = "Invalid Meeting Code";
				String act_err = driver.findElement(By.xpath("//div[@role='alert']")).getText();
				Assert.assertEquals(exp_err, act_err);
				
				}
			//Verifying the functionality of shareScreen - meetingId- join&Share Button -your Name.
			@Test(retryAnalyzer = MyRetry.class)
			public void tc4() throws InterruptedException, IOException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
//				Thread.sleep(5000);
				
				WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
				shareScreenIcon.click();
				
				WebElement meetingId = driver.findElement(By.id("outlined-basic"));
				meetingId.sendKeys(p.getPropertyFiledata("Screen_share_Id"));
				
				WebElement joinAndShareButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/div[4]/button/span[1]"));
				joinAndShareButton.click();
				
				WebElement yourNameTf = driver.findElement(By.id("displayname"));
				yourNameTf.sendKeys("SOHAIL");
				
				WebElement JoinButton = driver.findElement(By.id("joinButton"));
				JoinButton.click();
				
//				Thread.sleep(3000);
				//URL get changes with every new meeting ID
				String actualText="Screen Share";
				String expectedText= driver.findElement(By.xpath("//p[@class='jss33']")).getText();
				Assert.assertEquals(expectedText,actualText);
				
				}
			//Verifying the functionality of shareScreen - meetingId- join&Share Button -your Name -click on Share&Screen Button.
			@Test(retryAnalyzer = MyRetry.class)
			public void tc5() throws InterruptedException, IOException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
//				Thread.sleep(5000);
				
				WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
				shareScreenIcon.click();
				
				WebElement meetingId = driver.findElement(By.id("outlined-basic"));
				meetingId.sendKeys(p.getPropertyFiledata("Screen_share_Id"));
				
				WebElement joinAndShareButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/div[4]/button/span[1]"));
				joinAndShareButton.click();
				
				WebElement yourNameTf = driver.findElement(By.id("displayname"));
				yourNameTf.sendKeys("SOHAIL");
				
				WebElement JoinButton = driver.findElement(By.id("joinButton"));
				JoinButton.click();
				
				WebElement sharescreen = driver.findElement(By.xpath("//div[@class='jss26 jss25']"));
				sharescreen.click();
				
				WebElement request = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
				request.click();
				
//				Thread.sleep(3000);
				//URL get changes with every new meeting ID
				String actualText="Screen Share";
				String expectedText= driver.findElement(By.xpath("//p[@class='jss33']")).getText();
				Assert.assertEquals(expectedText,actualText);
				
				}	
			
			}
