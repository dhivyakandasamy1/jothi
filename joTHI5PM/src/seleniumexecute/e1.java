package seleniumexecute;

import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website
		d.get("http://www.mycontactform.com");
		
		//title and url
		System.out.println(d.executeScript("return document.title"));
		System.out.println(d.executeScript("return document.URL"));
		d.quit();
	}

}
