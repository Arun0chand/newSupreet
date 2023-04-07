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

public class AdminSettings{
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
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/aside[1]/ul[1]/li[12]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/uib-accordion[1]/div[1]/div[2]/div[1]/h4[1]/a[1]/span[1]/h3[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[13]/span[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("3");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("4");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/input[1]")).sendKeys("5");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/input[1]")).sendKeys("6");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[7]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[7]/input[1]")).sendKeys("7");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[8]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[8]/input[1]")).sendKeys("8");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[9]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[9]/input[1]")).sendKeys("9");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[10]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[10]/input[1]")).sendKeys("0");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[12]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[12]/input[1]")).sendKeys("4");
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		
		driver.manage().window().minimize();
		driver.quit();
	


	}
}