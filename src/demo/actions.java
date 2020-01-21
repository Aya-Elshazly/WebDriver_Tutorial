package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class actions {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Automation sources\\geckodriver.exe");
		DesiredCapabilities compabit=DesiredCapabilities.firefox();
		compabit.setCapability("marionette", true);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		Actions abc=new Actions(driver);
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
		abc.moveToElement(element).build().perform();
		
		WebElement xyz=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("smallletters").build().perform();
		
		abc.contextClick(xyz).build().perform();
		
        
	}*/
		System.setProperty("webdriver.chrome.driver", "E:\\Automation sources\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://freecrm.com/");
        
		
		driver.findElement(By.xpath("html/body/div[1]/header/div/nav/div[2]/div/a")).click();
		
	}

}
