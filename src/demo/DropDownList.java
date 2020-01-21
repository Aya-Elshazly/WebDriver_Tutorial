package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Automation sources\\geckodriver.exe");
		DesiredCapabilities compabit=DesiredCapabilities.firefox();
		compabit.setCapability("marionette", true);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement address=driver.findElement(By.xpath(".//*[@id='select-demo']"));
		Select ab=new Select(address);
		ab.selectByVisibleText("Friday");
		
		

	}

}
