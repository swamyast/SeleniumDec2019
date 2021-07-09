package testNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOffset {
	public static void main(String[] args) throws InterruptedException {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(5000);
		
			
		Actions act=new Actions(driver);  //Two mthods one detailed and second direct
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		act.dragAndDropBy(src,200,75).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
