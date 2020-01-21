package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Handling_JavaAlerts_Popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Automation sources\\geckodriver.exe");
		DesiredCapabilities compabit=DesiredCapabilities.firefox();
		compabit.setCapability("marionette", true);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath(".//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[1]/a")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		//al.dismiss();

	}

}
