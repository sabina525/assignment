package currency_package;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;




public class Login_Test {

	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.gecko.driver", "F:/Software_Automation/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		
		Loginpage aLoginpage = new Loginpage(driver);
		 aLoginpage.GetURL("https://www.paysera.lt/v2/en-LT/fees/currency-conversion-calculator#/");
		 
		 driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("40");
		 Thread.sleep(1500);
			
	     driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("50");
	     Thread.sleep(1000);
	     
	     //Scrolling 
	     JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(1000);
		 
		 
	  
	    driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[2]/div/span/span[2]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"countries-dropdown\"]")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Russia']")).click();
	    Thread.sleep(1000);
	    
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
	  
		
	}

}
