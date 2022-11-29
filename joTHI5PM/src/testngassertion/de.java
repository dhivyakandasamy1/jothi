package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testnglist.c1.class)
public class de {
	
	//assertion : technique where we will be comparing actual result with obtained result
	// hard asserts:    
	//                provided by Assert builtin class
	//                static in nature
	//                if assertion fails, it will fail the test case 
	
	// soft asserts:
	//              provided by SoftAssert builtin class
	//              nonstatic in nature
	//              even if assertion fails, it will proceed further
	//              actual result=> invoke assertAll()
	
	//assertEqual(actual, expected)
	//assertNotequals(actual, expected)
	//assertTrue(condition)
	//assertFalse(condition)

	@Test
	public void ha()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 ChromeDriver d = new ChromeDriver();
		 d.get("http://www.google.com");
		 //Assert.assertEquals(d.getTitle(), "yahoo");
		 Assert.assertNotEquals(d.getTitle(), "yahoo");//pass
		 WebElement ele = d.findElementByLinkText("Gmail");
		 Assert.assertTrue(ele.isDisplayed());//pass
		 Assert.assertFalse(ele.isSelected());//pass
		 d.quit();
	}
}
