package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {
public  WebDriver driver;

	@Parameters({"browser"})
	@BeforeClass
	public void setup(String br) throws InterruptedException {
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
				}
				else if(br.equals("edge")) {
					driver=new EdgeDriver();
						}
				else if(br.equals("firefox")) {
					driver=new FirefoxDriver();
						}		
			driver.get("https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public  void screenshot(String name) {
		TakesScreenshot ss = ((TakesScreenshot) driver);
				File src=ss.getScreenshotAs(OutputType.FILE);
		try {
			File trg=new File("./testcase/Screenshot/"+name+".png");
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@AfterClass
   public void tearDown()
   {
		driver.quit();
   }
	
}
