package testngwaitssyc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class i2 {
	/*
	 * explicit wait: time limit is applicable for certain conditions
	 * 
	 * create an object for webdriver wait class
	 * pass driver instance and time limit as input
	 * call untill method
	 * call expected conditions 
	 * 
	 * code is correct: executes within time limit, it will not wait for completion of time limit, it will proceed further
	 * code is wrong :  it will wait for completion of time limit, then it will throw up error 
	 * * 
	 * */
	
	@Test
	public void ha()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 ChromeDriver d = new ChromeDriver();
		 d.get("http://www.google.com");
		 WebDriverWait w= new WebDriverWait(d,5);
		 
		 // title
		 //w.until(ExpectedConditions.titleIs("Golkmlkj"));//5
		 //w.until(ExpectedConditions.titleContains("oo"));
		 
		 //presence of alert 
		 //w.until(ExpectedConditions.alertIsPresent()); //5
		 
		 // checking visibility of an element
		 //finding the element and checking its visibility
		 //w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
		 
		 // clickable or not
		 // finding the element and checking whether it is clickable
		// w.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));
		 
		 //checking visibility of more elements
		 // images=> visible or not
		 // collect all the images, check whether they are visible
		 //w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		 
		 // check number of elements
		 // 2 images
		 // collect all the images, count its number and check it against expected count
		 w.until(ExpectedConditions.numberOfElementsToBe(By.tagName("img"), 2));
		 
		 d.quit();
	}

}
