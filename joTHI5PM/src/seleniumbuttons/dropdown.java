package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website
		d.get("https://courses.letskodeit.com/practice");
		
		// create an object for select class
		// pass dropdown box as input
		// value, index or visible text
		
		WebElement ele = d.findElementById("carselect");
		Select s= new Select(ele);
		//s.selectByIndex(1);
		//s.selectByValue("honda");
		s.selectByVisibleText("Benz");
		
	}
}
