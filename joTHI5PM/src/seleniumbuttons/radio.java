package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website
		d.get("https://courses.letskodeit.com/practice");
		//radio: can select only one button at a time
		
	/*	d.findElementById("bmwradio").click();
		Thread.sleep(3000);
		

		d.findElementById("benzradio").click();
		Thread.sleep(3000);
		

		d.findElementById("hondaradio").click();
		Thread.sleep(3000);*/
		
		//method2: collect all the raio buttons, iterate, click
		// xpath:   //*[@loc/attribute='value' and @loc/attribute='value']
		
		List<WebElement> l = d.findElementsByXPath("//*[@name='cars' and @type='radio']");
		//for(datatype tempvari: nameofthecollection)
		
		for(WebElement x: l)
		{
			x.click();
			Thread.sleep(2000);
		}
	}
}
