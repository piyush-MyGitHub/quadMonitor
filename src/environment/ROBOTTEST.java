package environment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ROBOTTEST {
	public WebDriver driver  = null;
	
  @Test
  public void TESTROBOT() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.facebook.com");
	  driver.findElement(By.id("email")).sendKeys("qtp.pmishra@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("piyush!79");
	  driver.findElement(By.xpath(".//*[@value='Log In']")).click();
	  
	  
	  
	  
  }
}
