package testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcilUtility;
import pageObjects.AppsAndTools;
import pageObjects.HomePage;
import pageObjects.NewsPage;
import testBase.BaseClass;

public class TC_001_NewsTest extends BaseClass{
	
	public HomePage	hp;
	
	static int row=1;
	static String file_path = System.getProperty("user.dir") + ".\\testData\\newsdata.xlsx";
	
	@Test(priority = 1)
	public void verify_userinfo() throws InterruptedException, IOException{
	    hp=new HomePage(driver);
	    Thread.sleep(5000);
		hp.clickInitials();
		screenshot("user Info");
		Thread.sleep(5000);
		hp.getName();
		hp.getEmail();
		
		Assert.assertEquals(hp.getName(),"Kaur, Gaganpreet (Cognizant)");
	}
	
	@Test(priority=2)
	public void verify_news() throws InterruptedException
	{
		NewsPage np=new NewsPage(driver) ;
		np.scrollTillNews1();
		np.countFeaturedNews();
		np.featuredNews();
		screenshot("All News");
		}

	@Test(priority=3)
		public void compare_news() {
		NewsPage np=new NewsPage(driver) ;
		boolean result=np.compareNews();
		Assert.assertEquals(result,false);
	}
	
	@Test(priority=4)
	public void news1() throws InterruptedException {
		NewsPage np=new NewsPage(driver) ;
		np.clickImage1();
		boolean verifytitle1=np.validate_Title1();
		Assert.assertEquals(verifytitle1,true, "Titles are not matching");
		String news1=np.fetchedNews1();
		try {
			ExcilUtility.setCellData(file_path,"Sheet1",0,0,"News Displayed");
			ExcilUtility.setCellData(file_path,"Sheet1",row,0,news1);
			row++;
		}
		catch(Exception e) {
			
		}
		screenshot("News 1");
		np.beCognizantbtn1();
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public void news2() {
		NewsPage np=new NewsPage(driver) ;
		np.scrollTillNews2();
		np.clickImage2();
		boolean verifytitle2=np.validate_Title1();
		Assert.assertEquals(verifytitle2,true, "Titles are not matching");
		String news2=np.fetchedNews2();
			try {
				ExcilUtility.setCellData(file_path,"Sheet1",row,0,news2);
				row++;
			}
			catch(Exception e) {
				
			}
			screenshot("News 2");
		np.beCognizantbtn2();
	}
	
	@Test(priority=6)
	public void news3() throws InterruptedException {
		NewsPage np=new NewsPage(driver) ;
		
		np.scrollTillNews3();
		Thread.sleep(3000);
		np.clickImage3();
		boolean verifytitle3=np.validate_Title1();
		Assert.assertEquals(verifytitle3,true, "Titles are not matching");
		String news3=np.fetchedNews3();
		try {
			ExcilUtility.setCellData(file_path,"Sheet1",row,0,news3);
			row++;
		}
		catch(Exception e) {
			
		}
		screenshot("News 3");
		np.beCognizantbtn3();
	}
	
	@Test(priority=7)
	public void news4() {
		NewsPage np=new NewsPage(driver) ;
		
		np.scrollTillNews4();
		np.clickImage4();
		boolean verifytitle4=np.validate_Title1();
		Assert.assertEquals(verifytitle4,true, "Titles are not matching");
		String news4=np.fetchedNews4();
		try {
			ExcilUtility.setCellData(file_path,"Sheet1",row,0,news4);
			row++;
		}
		catch(Exception e) {
			
		}
		screenshot("News 4");
		np.beCognizantbtn4();
	}
	
	@Test(priority=8)
	public void news5() throws InterruptedException {
		NewsPage np=new NewsPage(driver) ;
		np.scrollTillNews5();
		Thread.sleep(5000);
		np.clickImage5();
		Thread.sleep(5000);
		boolean verifytitle5=np.validate_Title1();
		Assert.assertEquals(verifytitle5,true, "Titles are not matching");
		String news5=np.fetchedNews5();
		try {
			ExcilUtility.setCellData(file_path,"Sheet1",row,0,news5);
			row++;
		}
		catch(Exception e) {
			
		}
		screenshot("News 5");
		np.beCognizantbtn5();
	}

	@Test(priority=9)
	public void scroll_apps() {
		AppsAndTools ap=new AppsAndTools(driver);
		ap.scroll();
		screenshot("Apps and Tools displayed");
	}
	
	@Test(priority=10)
	public void apps_tools() {
		AppsAndTools ap=new AppsAndTools(driver);
	    ap.countapps();
	}
	}

