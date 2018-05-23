package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	

	WebDriver driver=new FirefoxDriver();
	@Test
  public void f() throws InterruptedException {
		
	       driver.findElement(By.name("identifier")).sendKeys("testautomationqai");
	       driver.findElement(By.id("identifierNext")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.name("password")).sendKeys("automation@123");
	       driver.findElement(By.id("passwordNext")).click();
		
  }
  @BeforeTest
  public void beforeMethod() {
	  driver.get("http://www.gmail.com");
  }

  @AfterTest
  public void afterMethod() {
	  driver.close();
  }

}
