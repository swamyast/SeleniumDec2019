package testNGExamples;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.WIN10);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.html.am/html-codes/forms/html-checkbox-code.cfm");
		
		WebElement lnk=driver.findElement(By.xpath("//input[@name='fruit' and @value='Apple']"));
						
		lnk.click();
		if(lnk.isSelected())
			System.out.println("The checox checked");
		
	}
}
