package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website
		d.get("http://www.mycontactform.com");
		
		/*locators: identify a particular element
		 * 
		 * 8 locators 
		 * 
		 * id
		 * name
		 * classname
		 * linktext
		 * partial linktext
		 * 
		 * 
		 *  tagname
		 * xpath
		 * css
		 *
		 ** 
		 * */
		//id=user
		d.findElementById("user").sendKeys("Dhivyakarthi123");
		
		//name=pass
		d.findElementByName("pass").sendKeys("12345");
		
		//classname=btn_log
		d.findElementByClassName("btn_log").click();
	}
}
