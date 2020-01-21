package demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestParallel {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "E:\\Automation sources\\geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		capabilities.setCapability(FirefoxDriver.BINARY, new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		
		
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.105:5566/wd/hub"),capabilities);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		
		

	}

}