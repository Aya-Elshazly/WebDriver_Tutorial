package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class countlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Automation sources\\geckodriver.exe");
		DesiredCapabilities compabit=DesiredCapabilities.firefox();
		compabit.setCapability("marionette", true);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		String BeforeClicking=null;
		String AfterClicking;
		for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
		{
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				BeforeClicking=driver.getTitle();
				col.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		AfterClicking=driver.getTitle();
		if(BeforeClicking!=AfterClicking)
		{
			if(driver.getPageSource().contains("All categories"))
			System.out.println("Passed");
		}
		else
		{
			System.out.println("failed");
		}
		

	}

}
