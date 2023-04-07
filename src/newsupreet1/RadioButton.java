package newsupreet1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		// login
		// ****************************************************************************
		driver.get("https://campaignsopend.tech-active.com/#/edit-campaign/qePrKl6hgh161671192829/20637");
		WebElement emailTextField = driver.findElement(By.id("email_id"));
		emailTextField.clear();
		emailTextField.sendKeys("admin@opend.com");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Sign In']")).submit();

	}

}
