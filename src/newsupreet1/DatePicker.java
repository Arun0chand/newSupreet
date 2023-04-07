package newsupreet1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {
public static void main(String [] args) throws InterruptedException {
	
	String month="March 2019";
	String day="25";
	ChromeDriver driver=new ChromeDriver();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().window().maximize();
    
	//login
	//****************************************************************************
	driver.get("http://campaignsopend.tech-active.com/#/admin_login");
	WebElement emailTextField = driver.findElement(By.id("email_id"));
	emailTextField.clear();
	emailTextField.sendKeys("admin@opend.com");
	WebElement passwordTextField = driver.findElement(By.id("password"));
	passwordTextField.clear();
	passwordTextField.sendKeys("1234");		
	driver.findElement(By.xpath("//button[text()='Sign In']")).submit();
	//******************************************************************************
	//click on the Campaign
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/aside[1]/ul[1]/li[2]/a[1]")).click();
	Thread.sleep(2000);
//	Click on the Calendar
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/button[1]")).click();
//	Click on the month and date
	driver.findElement(By.xpath("//tbody/tr[2]/td[6]/button[1]/span[1]")).click();
     Thread.sleep(2000);
//	while(true) {
//		Thread.sleep(2000);
//		String text=driver.findElement(By.xpath("//strong[contains(text(),'November 2022')]")).getText();
//		
//		if(text.equals(month)) {
//			
//			break;
//		}
//			else {
//				driver.findElement(By.xpath("//thead/tr[1]/th[1]/button[1]/i[1]")).click();
//				
//				}
//		driver.findElement(By.xpath("//span[contains(text(),"+day+")]"));
//		
//		}
		
	}
	
	
}
	






















