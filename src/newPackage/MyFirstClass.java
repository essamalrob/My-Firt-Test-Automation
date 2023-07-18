package newPackage;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDr
public class MyFirstClass {
	

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
   //	System.setProperty("webdriver.gecko.driver","C:\\Chrome and firefox driver\\geckodriver.exe");
	System.setProperty("webdriver.gecko.driver","C:\\Chrome and firefox driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	        driver.get("https://www.frontgate.com/UserLogonView");
	        
	        String  CurrentTitle= driver.getTitle();
	        
	      WebElement login = driver.findElement(By.id("logonId"));
	      login.sendKeys("username");
	      WebElement logonPassword =driver.findElement(By.id("logonPassword"));
	     logonPassword.sendKeys("Test@123");
	     //logonButton
	     driver.findElement(By.id("logonButton")).click();
	     
	     String ExpectedTitle =driver.getTitle();
	     
	     if(ExpectedTitle.equals(CurrentTitle))
	     {
	    	 System.out.println("Test Fail");
	    	 
	     }
	     else
	     {
	    	 System.out.println("Test Pass"); 
	     }
	     
	 driver.quit();
	     
	        
	       
    }
}
