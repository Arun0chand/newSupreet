package newsupreet1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Doodle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.google.com/doodles");
JavascriptExecutor jse=(JavascriptExecutor)driver;
	for(;;) {
		try {
	//		WebElement teachersDayDoodle = driver.findElement(By.linkText("Teachers' Day 2021 (October 3)"));
			WebElement teachersDayDoodle = driver.findElement(By.xpath("//a[contains(text(),\"Fatima Sheikh's 191st Birthday\")]"));
			teachersDayDoodle.click();
			break;
		} catch (NoSuchElementException e) {
		//System.out.println("The Element Is not their in the view port area.");
		jse.executeScript("window.scrollBy(0,500)");
	}
	}
}
}
