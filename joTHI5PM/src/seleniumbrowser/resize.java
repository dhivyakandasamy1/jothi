package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class resize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website

		d.get("http://www.facebook.com");
		
		//create an object for dimension class 
		//pass desired height and width in it
		//apply it on the window
		//400,400
		
		Dimension s= new Dimension(300,200);
		d.manage().window().setSize(s);
		
		Thread.sleep(3000);
		
		d.quit();
	}
}
