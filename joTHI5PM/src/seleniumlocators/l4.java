package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//visit the website
		d.get("http://www.mycontactform.com");
		
		//css: 2 ways: manual :7 ways
		//             shortcut: copy=> copy selector
		
		//1. tagname and id          syntax: tagname#id
		//d.findElementByCssSelector("input#user").sendKeys("hi");
		//2. tagname and classname   syntax: tagname.classname
		//d.findElementByCssSelector("input.txt_log").sendKeys("hi");
		//3. tagname and attribute    syntax: tagname[attribute='value']
		//type=text
		//d.findElementByCssSelector("input[type='text']").sendKeys("hi");
		//4.tagname, classname and attribute   syntax: tagname.classname[attribute='value']
		//d.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
		
		//5.tagname and prefix of attribute      syntax: tagname[attribute^='prefix']
		//d.findElementByCssSelector("input[type^='te']").sendKeys("hi");
		
		//6.tagname and suffix of attribute      syntax: tagname[attribute$='suffix']
		//d.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
		
		//7.tagname and substring of attribute      syntax: tagname[attribute*='substring']
		//d.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
		
		// copy=> copy selector
		d.findElementByCssSelector("#user").sendKeys("hi");
		Thread.sleep(3000);
		d.quit();
	}

}
