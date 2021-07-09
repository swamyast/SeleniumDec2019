package testNGExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JsDemo {

	public static void main(String[] args) throws InterruptedException {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		  //js.executeScript("alert('Welcome to Java')");
		  js.executeScript("prompt('Welcome','Enter your name')");
		 
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("hello");
		Thread.sleep(4000);
		alert.accept();
		
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https://in.yahoo.com");
		//driver.findElement(By.id("persistent")).click();
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.name("username"));
		String emailId="swamy.learn@gmail.com";
		js.executeScript("arguments[0].value='swamy.learn@gmail.com'", email,emailId);
		//js.executeScript("arguments[0].value=arguments[1]", email,emailId);
		
		//js.executeScript("document.getElementById('persistent').click()");
		
		WebElement elm=driver.findElement(By.id("persistent"));
		js.executeScript("arguments[0].click()", elm);
	}

}
