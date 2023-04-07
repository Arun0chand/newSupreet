package newsupreet1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Camapaign{
	public static void main(String [] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		// login
		// ****************************************************************************
		driver.get("http://campaignsopend.tech-active.com/#/admin_login");
		WebElement emailTextField = driver.findElement(By.id("email_id"));
		emailTextField.clear();
		emailTextField.sendKeys("admin@opend.com");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Sign In']")).submit();

		// ******************************************************************************
		//Click on the campaign
		JavascriptExecutor js5 = (JavascriptExecutor) driver;

		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/aside[1]/ul[1]/li[2]/a[1]")).click();
		// Click on the start button
		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/a[1]")));
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/a[1]/img[1]")).click();
		//click on the Advertiser dropdown
		WebElement advertiserDrop=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		new Select(advertiserDrop).selectByValue("1");
		Thread.sleep(2000);
		//Enter the campaign name
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Test_Camp1");
		// Enter the Advertiser cost type
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[2]/div[3]/div[1]/span[1]/label[1]")).click();
		// Enter the Campaign country

		WebElement campaignCountry=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[2]/div[5]/select[1]"));
		new Select(campaignCountry).selectByValue("79");
		// Enter the advertiser type

		WebElement advertiserType=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[2]/div[6]/select[1]"));
		new Select(advertiserType).selectByValue("1");
		//Enter  the Camapaign category

		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[2]/div[7]/input[1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Automotive')]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[2]/div[1]/button[1]")).click();
		//Enter the Audience interest
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[2]/div[8]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[2]/div[1]/label[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/button[1]")).click();

		//Enter the Select Publisher
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[2]/div[12]/input[1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Latch 4')]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/div[2]/div[1]/button[1]")).click();

		//Enter the publisher cost
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[2]/div[13]/div[1]/span[1]/label[1]")).click();

		//Enter the proceed button
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[3]/button[1]")).click();

		//Enter the subject line
		driver.findElement(By.xpath("//input[@id='subjectone']")).sendKeys("Welcome TechActive");
		Thread.sleep(5000);
		//Enter the FROM button
		driver.findElement(By.xpath("//input[@id='uploadBtn1']")).click();
		//Enter the Select button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[1]")).click();
		//Enter the proceed button
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/div[16]/button[1]")).click();
		Thread.sleep(5000);
		//Enter the proceed button
		js5.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(5000);
		//Click on the location
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).click();
		//select location
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/div[1]/div[2]/div[1]/label[1]")).click();
		//Click on the submit button
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/div[2]/div[1]/button[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/div[4]/button[1]")));
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/div[4]/button[1]")).click();
		//Enter the select Audience reach
		Thread.sleep(6000);
    	driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/div[1]/div[1]/span[1]/input[1]")).clear();
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/div[1]/div[1]/span[1]/input[1]")).sendKeys("2000");
		//Select the Email Deliverability
		driver.findElement(By.xpath("//label[contains(text(),'Round Robin (Mailgun)')]")).click();
//		js5.executeScript("window.scrollBy(0, 500)");
		//Create the campaign Immediate
		driver.findElement(By.xpath("//label[contains(text(),'Start Campaign Immediately')]")).click();
		Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[contains(text(),'Start Campaign')]")).click();









	}
}