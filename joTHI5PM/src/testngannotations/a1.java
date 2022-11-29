package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 * before test:    run only once, before all the test cases started its execution
	 * after test :    run only once, after all the test cases finished its execution
	 * 
	 * before class:  run only once, after before test 
	 * after class:   run only once, before after test 
	 * 
	 * before method: run before each test case 
	 * after method:  run after each test case 
	 * 
	 * before test :   visiting
	 *  before class : max
	 *      before method: refresh  tc1 : click      aftermethod : deleting cookies 
	 *      before method: refresh  tc2 : gettitle   aftermethod : deleting cookies
	 *       
	 *   after class : get url
	 * after test  : closing
	 ** */
	ChromeDriver d;
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method : refresh");
		d.navigate().refresh();
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after method : deleting cookies");
		d.manage().deleteAllCookies();
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class : maximising");
		d.manage().window().maximize();
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class: url");
		System.out.println(d.getCurrentUrl());
	}
	@BeforeTest
	public void bt()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 d= new ChromeDriver();
		//visit the website
		 d.get("http://www.google.com");
		System.out.println("before test");
	}
	
	@AfterTest
	public void at() throws InterruptedException
	{
		System.out.println("after test : closing");
		Thread.sleep(3000);
		d.quit();
	}
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test case 1 : clicking on Gmail");
		d.findElementByLinkText("Gmail").click();
	}
	

	@Test(priority=1)
	public void t2()
	{
		System.out.println("Test case 2: getting title");
		System.out.println(d.getTitle());
	}

}
