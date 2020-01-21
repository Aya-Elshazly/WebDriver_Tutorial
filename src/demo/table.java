package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Automation sources\\geckodriver.exe");
		DesiredCapabilities compabit=DesiredCapabilities.firefox();
		compabit.setCapability("marionette", true);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://espncricinfo.com/ci/engine/match/415281.html");
		WebElement table=driver.findElement(By.id("tableid"));
		//finding rows in table
		List<WebElement>noofrows=table.findElements(By.tagName("tr"));
		System.out.println("number of rows are"+noofrows.size());
		int i=0;
		//finding coloum count in each row
		for(WebElement eachrow:noofrows)
		{
			List<WebElement>eachcoloum=eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("no of coloums in"+i+"the row are"+eachcoloum.size());
			//finding cell value
			for(WebElement text:eachcoloum)
			{
				System.out.println(text.getText());
			}
		}
		

	}

}
