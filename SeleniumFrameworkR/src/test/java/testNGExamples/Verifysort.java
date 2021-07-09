package testNGExamples;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Verifysort {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/howto/howto_js_sort_table.asp");
		
		List<WebElement> names=driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
		WebElement elm=driver.findElement(By.xpath("//button[contains(text(),'Sort')]"));
		String arrBeforeSort[]=new String[names.size()];
		for(int i=0;i<names.size();i++) {
			arrBeforeSort[i]=names.get(i).getText().trim();
		}
		printVals(arrBeforeSort);
		Arrays.parallelSort(arrBeforeSort);
		System.out.println("*************** After Sort");
		printVals(arrBeforeSort);
		
		elm.click();
		List<WebElement> nameSorted=driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
		String arrAfterSort[]=new String[nameSorted.size()];
		for(int i=0;i<nameSorted.size();i++) {
			arrAfterSort[i]=nameSorted.get(i).getText().trim();
		}
		System.out.println("*************** After click Sort");
		printVals(arrAfterSort);
		System.out.println("*************** After compare");
		for(int j=0;j<arrAfterSort.length;j++) {
			if(arrAfterSort[j].contentEquals(arrBeforeSort[j])) {
				System.out.println("The values are equal "+arrAfterSort[j]);
			}
		}
	}

	public static void printVals(String arr[]) {
		for(String s: arr) {
			System.out.println("The values are "+s);
		}
	}
}
