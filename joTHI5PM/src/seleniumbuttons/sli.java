package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sli {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	d.get("https://jqueryui.com/slider/");
	// horizontal slider:  move along x axis, so y value will be 0
	// vertical slider : move along y axis, x value will be 0
	d.switchTo().frame(0);
	Actions ac= new Actions(d);
	WebElement ele = d.findElementById("slider");
	ac.dragAndDropBy(ele, 40, 0).build().perform();
}
}
