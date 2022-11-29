package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class c2 {
	
	//softassert=> softAssert builtin
	// nonstatic 
	@Test
	public void soft()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 ChromeDriver d = new ChromeDriver();
		 d.get("http://www.google.com");
		 
		 SoftAssert s= new SoftAssert();
		 
		 s.assertEquals(d.getTitle(), "yahoo");//fail
		 s.assertNotEquals(d.getTitle(), "yahoo");//pass
		 WebElement ele = d.findElementByLinkText("Gmail");
		s.assertTrue(ele.isDisplayed());//pass
		 s.assertFalse(ele.isSelected());//pass
		 d.quit();
		 s.assertAll();
	}

}
