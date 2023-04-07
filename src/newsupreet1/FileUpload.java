package newsupreet1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions chromeOpt=new ChromeOptions();
		WebDriver driver=new ChromeDriver(chromeOpt.addArguments("--disable-notifications"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://www.foundit.in");
		//Close butto
		driver.switchTo().frame("wiz-iframe-intent");	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='btn close-button' and text()='✕' and @onclick='closediv()']"))));
		driver.findElement(By.xpath("//div[@class='btn close-button']")).click();
		Thread.sleep(3000);
		//Upload the resume
		
		//
//		driver.switchTo().alert().dismiss();
	

		driver.manage().window().minimize();
		driver.quit();
		
	}

}

