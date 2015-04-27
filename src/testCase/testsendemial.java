package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testsendemial {
	
	public WebDriver driver = null;
	
  @Test
  public void teest() {
	  
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://10.78.74.199/Ticketing/SearchFrame.aspx?p=SearchLeads");
	  driver.switchTo().frame(driver.findElement(By.id("ctl00_PageBodyPlaceHolder_ifContent")));
	  driver.findElement(By.xpath(".//*[@id='ctl00_PageBodyPlaceHolder_tbFirstName']")).sendKeys("TSE");
	 
	  
	    
	  
  }
}
