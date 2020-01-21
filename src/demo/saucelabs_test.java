package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class saucelabs_test {
	@Test
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		dc.setCapability("version", "10.0");
		dc.setCapability("platform", "Windows 10");
		WebDriver driver=new RemoteWebDriver(new URL("http://Aya_Elshazly:999096b5-c8a9-4bcf-b899-7c0e2787a6af@ondemand.saucelabs.com:80/wd/hub"),dc);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
