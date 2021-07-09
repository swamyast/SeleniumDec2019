package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']")).click();
		WebElement src=driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		WebElement dest=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		
		Actions act=new Actions(driver);  //Two mthods one detailed and second direct
		/*
		 * act.clickAndHold(src).pause(Duration.ofSeconds(3)) .moveToElement(dest)
		 * .pause(Duration.ofSeconds(2)) .release() .build().perform();
		 */
		
		act.dragAndDrop(src, dest).perform();
	}
}
