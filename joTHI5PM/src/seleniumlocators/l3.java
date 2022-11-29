package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website
		d.get("http://www.mycontactform.com");
		
		//tagname: cannot find a single element using tag name
		// images=> img
		// links => a
		// elements=> div, input, li, select
		
		// number of images, links, div, input
		
		List<WebElement> i = d.findElementsByTagName("img");
		System.out.println("Number of images "+ i.size());
		
		List<WebElement> i1 = d.findElementsByTagName("a");
		System.out.println("Number of links "+ i1.size());
		
		List<WebElement> i2 = d.findElementsByTagName("div");
		System.out.println("Number of elements with div "+ i2.size());
		
		List<WebElement> i3 = d.findElementsByTagName("input");
		System.out.println("Number of elements with input tag  "+ i3.size());
		
		d.quit();
	}

}
