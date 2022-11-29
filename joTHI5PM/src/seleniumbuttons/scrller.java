package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class scrller {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website
		d.get("http://www.seleniumeasy.com");
		
		/*
		 *horizontal scroller :  move along x axis,y value will be 0
		 * 
		 *              right: +x
		 *              left : -x
		 *                                        
		 *vertical scroller : move along y axis, x value will be 0
		 * 
		 *             down: +y
		 *             up: -y * 
	* 
		 * */
		
		d.executeScript("window.scrollBy(0,1000)");// down
		Thread.sleep(3000);
		
		d.executeScript("window.scrollBy(0,-1000)");// up
		Thread.sleep(3000);
	}
}
