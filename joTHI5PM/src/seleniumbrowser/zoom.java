package seleniumbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class zoom {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website

		d.get("http://www.facebook.com");
		
		//zoom in : greater than 100
		//zoom out: less than 100
		// nrml=> 100
		
		d.executeScript("document.body.style.zoom='200%'"); //zoomin
		Thread.sleep(3000);
		
		d.executeScript("document.body.style.zoom='100%'"); //nrml
		Thread.sleep(3000);
		
		d.executeScript("document.body.style.zoom='20%'"); //zoomout
		Thread.sleep(3000);
	}

}
