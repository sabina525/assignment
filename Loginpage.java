package currency_package;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	String 	URL;
	
	
	public Loginpage(WebDriver driver) {
	this.driver = driver;
	}

	public void GetURL(String url) {
		this.URL = url;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get(url);
		
		
		
		// Wait for 5 second	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// This  will scroll page 400 pixel vertical
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		//((JavascriptExecutor) driver)
	    // .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	     
		String title = driver.getTitle();
		System.out.println("The Page Title is" +title);
		
		
	 
		
	}
	


	
		
	
}
