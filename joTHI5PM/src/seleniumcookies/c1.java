package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website

		d.get("http://www.facebook.com");
		
		//cookies: temporary information stored by the browser
		
		Set<Cookie> c = d.manage().getCookies();
		System.out.println("Number f cookies "+ c.size() );
		
		d.quit();
	}
}
