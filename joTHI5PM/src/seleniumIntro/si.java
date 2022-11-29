package seleniumIntro;

import org.openqa.selenium.chrome.ChromeDriver;

public class si {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * selenium:
		 *  automation framework
		 *  automate web based applications 
		 *  14 languages 
		 *  all browsers
		 *  windows, linux, mac
		 *  
		 * selenium hq server standalone jar 
		 * 
		 * right click on project=> properties=> java build path=> libraries
		 *     
		 * 
		 classpath=> add external jar=> browse=> select=> apply and close 
		 
		 acess the browser through its corresponding driver
		 
		 step1 : configuring the chrome driver
		 step2: create an object for chromedriver class
		 step3: visiting website 
		 * */
		
		//seleniumeasy.com
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
ChromeDriver d= new ChromeDriver();
//visit the website
d.get("http://www.facebook.com");

//maximise
//d.manage().window().maximize();

//fullscreen
//d.manage().window().fullscreen();

//refresh
d.navigate().refresh();

//hold the page for certain seconds
Thread.sleep(3000);

//close the website 
d.quit();

	}
}
