package seleniumbrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class repositioning {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	//visit the website

	d.get("http://www.facebook.com");
	
	// create an object for point 
	// pass desired x and y value in it
	// apply it on the window
	
	//300,300
	Point pt= new Point(200,200);
	d.manage().window().setPosition(pt);
}
}
