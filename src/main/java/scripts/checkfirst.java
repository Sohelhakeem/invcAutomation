package scripts;




import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class checkfirst extends BaseClass{
	//Verifying elements on DashBoard
			@Test(retryAnalyzer = MyRetry.class)
			public void tc1() throws InterruptedException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password =driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
//				Thread.sleep(5000);
				
	Dimension size = driver.findElement(By.xpath("(//a[@href='/meeting'])[2]")).getSize();
				
				System.out.println(size);
				if(driver.findElements(By.xpath("(//a[@href='/meeting'])[2]")).size()!=0){
					System.out.println("Element is present");
					}else{
					System.out.println("Element is absent");
					}
				
			}
	
}
	
	
   

		
		
		
		
		
	
		

