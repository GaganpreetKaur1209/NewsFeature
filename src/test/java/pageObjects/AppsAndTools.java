package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppsAndTools extends BasePage{

	public AppsAndTools(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id='vpc_WebPart.QuickLinksWebPart.internal.89c5ffca-2ffb-4052-a723-e99c8c9a14ef']/div/div")
	WebElement around;
	
public void scroll() {
	JavascriptExecutor display=(JavascriptExecutor) driver;
	 display.executeScript("arguments[0].scrollIntoView();",around);
}

@FindBy(xpath="//*[@id='vpc_WebPart.QuickLinksWebPart.internal.89c5ffca-2ffb-4052-a723-e99c8c9a14ef']/div/div/div/div[2]/div/div/div/div/div/div/div")
List<WebElement> apps;

@FindBy(xpath="//*[@id='vpc_WebPart.QuickLinksWebPart.internal.89c5ffca-2ffb-4052-a723-e99c8c9a14ef']/div/div/div/div[1]/div/span")
WebElement heading;

	public void countapps() {	
		System.out.println("Heading is :"+heading.getText());
		 for(int i=0;i<apps.size();i++) {
			 String displayedapps=apps.get(i).getText();
			 System.out.println(displayedapps);
		 }
	}
	}

