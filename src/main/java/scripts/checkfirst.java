package scripts;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class checkfirst extends BaseClass{
	//Verifying LoginPage with valid details.
		@Test
		public void tc2() throws InterruptedException {
			
			WebElement username=driver.findElement(By.id("email"));
			WebElement password=driver.findElement(By.id("password"));
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			username.sendKeys("sohel@peoplelinkvc.com");
			password.sendKeys("Hyderabad@123");
			login.click();
//test			
			String expectedErrorMsg = "Today Meetings";
			 WebElement exp = driver.findElement(By.xpath("//span[@class='cardhdngTxt']"));
		        String actualErrorMsg = exp.getText();
		        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
		        
			}
		

}
	
	
   

		
		
		
		
		
	
		

