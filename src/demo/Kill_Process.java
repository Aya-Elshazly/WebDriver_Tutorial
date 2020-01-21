package demo;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class Kill_Process {

	public static void main(String[] args) throws IOException {
		
		
		//WindowsUtils.killByName("Notepad.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\Automation sources\\geckodriver.exe");
		DesiredCapabilities compabit=DesiredCapabilities.firefox();
		compabit.setCapability("marionette", true);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		Set<Cookie>abc=driver.manage().getCookies();
		System.out.println(abc.size());
		driver.manage().deleteAllCookies();
		Set<Cookie>abcd=driver.manage().getCookies();
		System.out.println(abcd.size());
		
		//taking screen shots
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("c:\\tmp\\screenshot.png"));
		

	}

}
