package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
@FindBy(xpath = "//div[@class='_8ZYZKvxC8bvw1xgQGSkvvA==']")
WebElement initials;

@FindBy(xpath="//*[@id='mectrl_currentAccount_primary']")
WebElement name;

@FindBy(xpath="//*[@id='mectrl_currentAccount_secondary']")
WebElement email;

public void clickInitials() throws InterruptedException  {
	Thread.sleep(2000);
	Actions action=new Actions(driver);
	action.moveToElement(initials).click().perform();
	}


public String getName() {
//	System.out.println(name.getText());
	String username=name.getText();
   return username;
}

public String getEmail() {
	//System.out.println(email.getText());
	String usermail= email.getText();
	return usermail;
}
}




