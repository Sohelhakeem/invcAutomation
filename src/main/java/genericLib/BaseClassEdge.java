package genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassEdge {
	WebDriver driver;
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public void CloeApp(ITestResult result) throws IOException {
		int status = result.getStatus();
		String name = result.getName();
		
		if(status==2) {
			Sceenshot s = new Sceenshot();
			s.getScreenshot(driver, name);
			
			
		}
		
	}
		
	public String getPropertyFiledata (String key) throws IOException {
		Properties p = new Properties();
			FileInputStream  fis =new  FileInputStream (AutoConstant.proertyfilePath);
			p.load(fis);
			return p.getProperty(key);
		
	}
	
	
	public void getScreenshot (WebDriver driver, String name) throws IOException {
		
		Date d = new Date();
		String currentdate  = d.toString().replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File (AutoConstant.photoPath+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
	
	}
	
		
	}
	
