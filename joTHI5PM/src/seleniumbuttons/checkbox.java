package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website
		d.get("https://courses.letskodeit.com/practice");
		/*d.findElementById("bmwcheck").click();
		Thread.sleep(3000);
		d.findElementById("benzcheck").click();
		Thread.sleep(3000);
		d.findElementById("hondacheck").click();
		Thread.sleep(3000);*/
		
		//method2: collect all the checkboxes , iterate, click
		// xpath:   //*[@loc/attribute='value' and @loc/attribute='value']
		
		List<WebElement> l = d.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
		//for(datatype tempvari: nameofthecollection)
		
		for(WebElement x: l)
		{
			x.click();
			Thread.sleep(2000);
		}
	}
}
