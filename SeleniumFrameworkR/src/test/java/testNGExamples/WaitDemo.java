package testNGExamples;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo {
	static WebDriver driver=null;
	@Test
	public void test() {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://google.com");
		driver.findElement(By.name("q")).sendKeys("iphone11");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		System.setProperty("ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY", "true");
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement elm=wait.until(ExpectedConditions.elementToBeClickable(By.className("hello")));
		elm.click();
	}

}
