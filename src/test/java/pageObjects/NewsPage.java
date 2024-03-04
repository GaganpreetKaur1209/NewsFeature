package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

//import cas.ExcelUtility;

public class NewsPage extends BasePage{

	
	public NewsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"4f7e87d5-f184-4501-8008-0ee4b0a38fcf\"]")
	WebElement ele;

	@FindBy(xpath="//*[@class='c_a_37591358 l_a_37591358 k_a_37591358']/div")
	List<WebElement> countnews; 

	@FindBy(xpath="//*[@class='z_a_91bed31b l_a_91bed31b']/div/a")
	List<WebElement> newsTitle;
	
	@FindBy(xpath="//*[@id=\'vpc_WebPart.NewsWebPart.internal.4f7e87d5-f184-4501-8008-0ee4b0a38fcf\']/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[1]/a/img")
	WebElement img1;
	
	@FindBy(xpath="//*[@id='title_text']")
	WebElement newsTitle1;
	
	@FindBy(xpath="//*[@id='fa45f946-463e-428f-a84b-0bbbde09c3ba']/div/div/div")
	WebElement fetchDisplayedNews1;
	
	@FindBy(xpath="//*[@id=\"spTopPlaceholder\"]/div/div[2]/div/div/div/div/div/div/div[1]/a/span")
	WebElement beCognizantbtn;
	
	@FindBy(xpath="//*[@id=\"vpc_WebPart.NewsWebPart.internal.4f7e87d5-f184-4501-8008-0ee4b0a38fcf\"]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[1]/a/img")
	WebElement img2;
	
	@FindBy(xpath="//*[@id='fa45f946-463e-428f-a84b-0bbbde09c3ba']/div/div/div/p[1]")
	WebElement fetchDisplayedNews2;
	
	@FindBy(xpath="//*[@id='vpc_WebPart.NewsWebPart.internal.4f7e87d5-f184-4501-8008-0ee4b0a38fcf']/div/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[1]/a/img")
	WebElement img3;
	
	@FindBy(xpath="//*[@id=\"fa45f946-463e-428f-a84b-0bbbde09c3ba\"]/div/div/div")
	WebElement fetchDisplayedNews3;
	
	@FindBy(xpath="//*[@id=\"vpc_WebPart.NewsWebPart.internal.4f7e87d5-f184-4501-8008-0ee4b0a38fcf\"]/div/div/div/div[2]/div/div/div/div/div/div[4]/div/div/div/div[1]/a/img")
	WebElement img4;
	
	@FindBy(xpath="//*[@id=\"fa45f946-463e-428f-a84b-0bbbde09c3ba\"]")
	WebElement fetchDisplayedNews4;
	
	@FindBy(xpath="//*[@id=\"vpc_WebPart.NewsWebPart.internal.4f7e87d5-f184-4501-8008-0ee4b0a38fcf\"]/div/div/div/div[2]/div/div/div/div/div/div[5]/div/div/div/div[1]/a/img")
	WebElement img5;

	@FindBy(xpath="//*[@id=\"spPageCanvasContent\"]/div/div/div/div/div/div[1]/div/div")
	WebElement fetchDisplayedNews5;
	
	
	//Action Methods
	public void scrollTillNews1() {
		JavascriptExecutor newsimg=(JavascriptExecutor) driver;
		newsimg.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public void countFeaturedNews() {
		System.out.println("Number of featured news are: "+countnews.size());
	}
	
	public void featuredNews() {
		String news;
		for(int i=0;i<countnews.size();i++) {
			 news=countnews.get(i).getText();
		System.out.println(news);
		}
	}
	
	public boolean compareNews() {
	for(int i=0;i<newsTitle.size();i++)
	{
	//String title=newsTitle.get(i).getAttribute("title").toString();
	String title=newsTitle.get(i).getAttribute("title");
	String s1=countnews.get(i).getText();
	 if(title.equals(s1)) {
		 return true;
	 }
	}
	return false;
	}
	
	public void clickImage1() {
		img1.click();
	}
	
	public boolean validate_Title1() {
	String newsTitle1=driver.findElement(By.id("title_text")).getText();
	String toolDip1=driver.findElement(By.id("title_text")).getAttribute("title");
	if(newsTitle1.equals(toolDip1))
		return true;
	return false;
	}
		
	public String fetchedNews1() {
	return fetchDisplayedNews1.getText();
	}
	
	public void beCognizantbtn1() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",beCognizantbtn);
	}
	
	public void scrollTillNews2() {
		JavascriptExecutor newsimg=(JavascriptExecutor) driver;
		newsimg.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public boolean compareNews2() {
	for(int i=0;i<newsTitle.size();i++)
	{
	String title=newsTitle.get(i).getAttribute("title");
	String s1=countnews.get(i).getText();
	 if(title.equals(s1)) {
		 return true;
	 }
	}
	return false;
	}
	
	public void clickImage2() {
		//img2.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",img2);
	}
	
	public boolean validate_Title2() {
		String newsTitle2=driver.findElement(By.id("title_text")).getText();
		String toolDip2=driver.findElement(By.id("title_text")).getAttribute("title");
		if(newsTitle2.equals(toolDip2))
			return true;
		return false;
		}

	public String fetchedNews2() {
		return fetchDisplayedNews2.getText();
		}
	
	public void beCognizantbtn2() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",beCognizantbtn);
	}
	
	public void scrollTillNews3() {
		JavascriptExecutor newsimg=(JavascriptExecutor) driver;
		newsimg.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public void clickImage3() {
		//img2.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",img3);
	}
	
	public boolean validate_Title3() {
		String newsTitle3=driver.findElement(By.id("title_text")).getText();
		String toolDip3=driver.findElement(By.id("title_text")).getAttribute("title");
		if(newsTitle3.equals(toolDip3))
			return true;
		return false;
		}
	
	public String fetchedNews3() {
		return fetchDisplayedNews3.getText();
		}
	
	public void beCognizantbtn3() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",beCognizantbtn);
	}
	
	public void scrollTillNews4() {
		JavascriptExecutor newsimg=(JavascriptExecutor) driver;
		newsimg.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	public void clickImage4() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", img4);
	}
	
	public boolean validate_Title4() {
		String newsTitle4=driver.findElement(By.id("title_text")).getText();
		String toolDip4=driver.findElement(By.id("title_text")).getAttribute("title");
		if(newsTitle4.equals(toolDip4))
			return true;
		return false;
		}
	
	public String fetchedNews4() {
		return fetchDisplayedNews4.getText();
		}
	
	public void beCognizantbtn4() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",beCognizantbtn);
	}
	
	public void scrollTillNews5() {
		JavascriptExecutor newsimg=(JavascriptExecutor) driver;
		newsimg.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public void clickImage5() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", img5);
	}
	
	public boolean validate_Title5() {
		String newsTitle5=driver.findElement(By.id("title_text")).getText();
		String toolDip5=driver.findElement(By.id("title_text")).getAttribute("title");
		if(newsTitle5.equals(toolDip5))
			return true;
		return false;
		}
	
	public String fetchedNews5() {
		return fetchDisplayedNews5.getText();
		}
	
	public void beCognizantbtn5() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",beCognizantbtn);
	}
	
}
