package seleniumexecute;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website
		d.get("http://www.mycontactform.com");
		
		//alert: popup/message box
		d.executeScript("alert('TimeOut')");
		
		//properly handle the alert
		Alert al = d.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		
	}

}
