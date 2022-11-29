package seleniumget;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
ChromeDriver d= new ChromeDriver();
//visit the website

d.get("http://www.facebook.com");
//get the title of website
System.out.println("title is "+ d.getTitle());

// get the url
System.out.println("Url is "+ d.getCurrentUrl());

// size of the window:  height and width
// Dimension

Dimension s = d.manage().window().getSize();
System.out.println("HEight is "+ s.getHeight());
System.out.println("Width is "+ s.getWidth());

//position:  x and y value of the window
//point

Point pt = d.manage().window().getPosition();
System.out.println(" x value is "+ pt.getX());
System.out.println("y value is "+ pt.getY());

//getting browser details :  capabilities

Capabilities c = d.getCapabilities();
System.out.println("Browser name is "+ c.getBrowserName());
System.out.println("Version is "+ c.getVersion());
System.out.println("Os is "+ c.getPlatform());

d.quit();

	}
}
