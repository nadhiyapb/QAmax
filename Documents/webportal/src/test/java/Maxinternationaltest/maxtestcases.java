package Maxinternationaltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maxtestcases {

		
		
	@Test
	public void Logintest() throws InterruptedException
	
	{
		System.out.println("login");
				
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();	
	Thread.sleep(2000);
	driver.get("https://qa.max.com/login/");
	Thread.sleep(2000);
	driver.manage().window().maximize();	
	driver.findElement(By.id("myusername")).sendKeys("11103");
	Thread.sleep(2000);
	driver.findElement(By.id("mypassword")).sendKeys("Cheese456!");
    driver.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	driver.close();
	System.out.println("LoginTest successfull");
	}
	
	@Test(priority=2)
	public void HomePageOptions() throws InterruptedException {
	System.out.println("Homepage");
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://qa.max.com/home/");
	driver.findElement(By.id("countries")).click();
	Select s =new Select(driver.findElement(By.id("countries")));
	Thread.sleep(2000);
	s.selectByValue("US");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Beauty")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[25]/div[1]/div[3]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//header/div[2]/ul[1]/a[1]/div[2]/img[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("checkout-btn")).click();
	driver.close();
	System.out.println("Test successfull");
	}
	
}
	
	
	
	
	
      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



