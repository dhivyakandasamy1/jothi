package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	//visit the website
	d.get("https://jqueryui.com/droppable/");
	
	// webelements => present inside a frame
	// switch your control to that frame
	// id, name or index
	
	d.switchTo().frame(0);
	Actions ac= new Actions(d);
	
	WebElement ele2 = d.findElementById("draggable");
	
	WebElement ele3 = d.findElementById("droppable");
	
	ac.dragAndDrop(ele2, ele3).build().perform();
}
}
