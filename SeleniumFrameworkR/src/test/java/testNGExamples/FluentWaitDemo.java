package testNGExamples;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
	static WebDriver driver=null;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://google.com");
		driver.findElement(By.name("q")).sendKeys("iphone11");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(2,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement elm=wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				WebElement element=driver.findElement(By.name("ABCD"));
				return element;
				
			}
		});
		
	}
}
