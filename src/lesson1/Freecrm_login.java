package lesson1;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Freecrm_login {
	public static void main(String[] args) 
    {
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		//String abc=hasmapuse_try_functions.getcredentials().get("first");
		//String abc1=hasmapuse_try_functions.getcredentials().get("second");
		HashMap<String,String> ghf=hasmapuse_try_functions.getcredentials();
		for (Entry<String, String> entry : ghf.entrySet())
		{
	    driver.findElement(By.name("username")).sendKeys(entry.getKey());
	    driver.findElement(By.name("password")).sendKeys(entry.getValue());
	    }
     }
}