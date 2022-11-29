package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	//visit the website
	d.get("http://www.mycontactform.com");
	
	/*
	 * xpath: xml path language
	 * 
	 * relative xpath
	 * absolute xpath
	 * 
	 * absolute xpath :   starts with single slash
	 *                    from the root to the desired element
	 *  copy=> copyfullxpath: /html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input
	 *  
	 *  
	 *  Relative xpath:   starts with double slash
	 *                 
	 *                 manual    : //*[@loc/attribute='value']
	 *                 shortcut  : copy=> copy xpath* 
	 * */
	
	// locator
	d.findElementByXPath("//*[@id='user']").sendKeys("Dhivyakarthi123");
	
	//attribute
	d.findElementByXPath("//*[@type='password']").sendKeys("12345");
	
	// shortcut: copy=> copy xpath
	//d.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
	
	d.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/div/input").click();
}
}
