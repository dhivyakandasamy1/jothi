package testngdepe;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {

	ChromeDriver d;
	@Test(priority=0, description="visiting",groups="G")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 d= new ChromeDriver();
		 d.get("http://www.google.com");
	}
	
	@Test(priority=1, description="max",groups="G")
	public void max()
	{
		d.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshing",invocationCount=3,groups="G")
	public void refresh()
	{
		d.navigate().refresh();
	}
	
	@Test(priority=0, description="clicking",dependsOnGroups="G")
	public void clicking()
	{
		d.findElementByLinkText("Images").click();
	}
	
	@Test(priority=0, description="closing",timeOut=5000,dependsOnGroups="G")
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		d.quit();
	}
}
