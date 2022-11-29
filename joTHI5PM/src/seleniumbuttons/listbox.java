package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	//visit the website
	d.get("https://courses.letskodeit.com/practice");
	
	// create an object for select class
	// pass list box as input
	// value, index or visible text
	
	// multiple options can be selected at a time
	// deselection is also possible
	
	WebElement ele = d.findElementById("multiple-select-example");
	Select s= new Select(ele);
	s.selectByIndex(0);
	s.selectByValue("orange");
	s.selectByVisibleText("Peach");
	
	Thread.sleep(3000);
	s.deselectByIndex(1);
}
}
