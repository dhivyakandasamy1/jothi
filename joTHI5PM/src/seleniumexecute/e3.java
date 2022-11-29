package seleniumexecute;

import org.openqa.selenium.chrome.ChromeDriver;

public class e3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website
		d.get("http://www.mycontactform.com");
		
		//getElementById
		//getElementsByName
		
		
		//getElementsByTagname
		
		d.executeScript("document.getElementById('user').value='Dhivyakarthi123'");
		
		d.executeScript("document.getElementById('pass').value='12345'");
		
		d.executeScript("document.getElementsByName('btnSubmit')[0].click()");
		
	}

}
