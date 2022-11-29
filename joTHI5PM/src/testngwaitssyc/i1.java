package testngwaitssyc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class i1 {
	/*webdriver synchronisation tech/ testngwaits
	 * 
	 * conditional sync      :  explicit wait 
	 * unconditional sync    :  implicit wait ,thread.sleep()
	 * 
	 * implicit wait:  once it is declared all the code which is present after it will take the time limit
	 * 
	 * code is correct: executes within time limit, it will not wait for completion of time limit, it will proceed further
	 * code is wrong :  it will wait for completion of time limit, then it will throw up error 
	 * * 
	 * */
	@Test
	public void ha()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 ChromeDriver d = new ChromeDriver();
		 d.get("http://www.google.com");
		 d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 System.out.println(d.getTitle());//5
		 System.out.println(d.getCurrentUrl());//5
		 d.navigate().refresh();//5
		 d.findElementByLinkText("Gmail"); //5
		 d.quit();
	}
}
