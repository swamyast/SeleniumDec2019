package svg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SvgDemo {

	public static void main(String[] args) throws InterruptedException {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Swamy/index.html");
		Thread.sleep(5000);
		String s=driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text' and @id='first']")).getText();
		String t=driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text' and @id='first']")).getAttribute("fill");
		System.out.println(s+ " "+t);

	}

}
