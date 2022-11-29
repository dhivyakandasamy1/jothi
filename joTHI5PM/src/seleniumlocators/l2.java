package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		
		//linktext: word/group of words: click on it a new url will be opened
		//partial linktext: substring of linktext
		
		// no need fr code inspection
		//d.findElementByLinkText("Privacy").click();
		
		d.findElementByPartialLinkText("Pri").click();
		Thread.sleep(3000);
		d.quit();
	}
}
