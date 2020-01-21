package demo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Handling_Radiobuttons_Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Automation sources\\geckodriver.exe");
		DesiredCapabilities compabit=DesiredCapabilities.firefox();
		compabit.setCapability("marionette", true);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.goindigo.in/");
		List<WebElement> abc=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(abc.size());
		abc.get(1).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		

	}

}
