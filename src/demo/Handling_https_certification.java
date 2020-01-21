package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Handling_https_certification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile prof=new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
		
		//System.setProperty("webdriver.gecko.driver", "E:\\Automation sources\\geckodriver.exe");
		//DesiredCapabilities compabit=DesiredCapabilities.firefox();
		//compabit.setCapability("marionette", true);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");

	}

}
