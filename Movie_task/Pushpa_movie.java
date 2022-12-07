package selenium_demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Pushpa_movie {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DESLA\\Desktop\\Aradhana\\selenium_demo\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		//driver.findElement(By.name("search")).sendKeys("pushpa");
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		
		 File srcFile = driver.getScreenshotAs(OutputType.FILE);
	     File destFile = new File("C:\\Program Files\\Java\\ss");
	     
	     FileHandler.copy(srcFile, destFile);
	     
	    
	     WebElement actual=driver.findElement(By.name("17&nbsp;December&nbsp;2021"));
	     String Expected =("Release date December 17,2021");
	     actual.equals("Expected");
	     
	     WebElement Exact=driver.findElement(By.name("<td class=\"infobox-data\">India</td>"));
	     String Real =("Country India");
	     Exact.equals("Expected");
	     
	     
	     
	     
		 
		
		
	}

}
