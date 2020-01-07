package lesson1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popups {
    static WebDriver obj1; 
	public static void main(String[] args) throws InterruptedException, IOException {
		/*Properties prop=new Properties();
		FileInputStream in=new FileInputStream("C:\\eclipse\\FirstProject\\src\\lesson1\\config.properties");
		prop.load(in);
		String URl=prop.getProperty("URL");
		String browser=prop.getProperty("browser");
		if(browser.equals("FF"))
		{*/
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
		obj1=new FirefoxDriver();
		obj1.get("http://popuptest.com/");
		//obj1.findElement(By.linkText("Click here to test...")).click();
		//obj1.findElement(By.linkText("Good PopUp #1")).click();
		obj1.findElement(By.linkText("Multi-PopUp Test")).click();
		Set<String> windows=obj1.getWindowHandles();
		System.out.println(windows);	
		String parentWindow = obj1.getWindowHandle();
		System.out.println(parentWindow);
		Iterator<String> it=windows.iterator();
		//String parentwindow=it.next();
		for(String windhdl : windows) 
		{
			if(!windhdl.equalsIgnoreCase(parentWindow))
			{
				Thread.sleep(2000);
				System.out.println(it.next());
				System.out.println(obj1.switchTo().window(windhdl).getTitle());
				obj1.close();
			}
		}
		obj1.switchTo().window(parentWindow);
		obj1.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(4000);
		System.out.println("here");
		Set<String> handle2=obj1.getWindowHandles();
		System.out.println(handle2);
		String parent2=obj1.getWindowHandle();
		System.out.println(parent2);
		for(String hndl :handle2)
		{
			if(!hndl.equalsIgnoreCase(parent2))
			{
				System.out.println(hndl);
				System.out.println(obj1.switchTo().window(hndl).getTitle());
				obj1.close();
			}
		}
		obj1.switchTo().window(parent2);		
		/*while(it.hasNext())
		{
			System.out.println(it.next());
			if(!it.next().equalsIgnoreCase(parentWindow)) {
				Thread.sleep(4000);
				System.out.println(obj1.switchTo().window(it.next()).getTitle());
			}
		}*/
		WebDriverWait wt =new WebDriverWait(obj1,30);
		wt.until(ExpectedConditions.elementToBeClickable(obj1.findElement(By.linkText("Mouseover PopUp")))).click();
	    //obj1.findElement(By.linkText("Mouseover PopUp")).click();
	    Actions ac1=new Actions(obj1);
	    ac1.moveToElement(obj1.findElement(By.linkText("Mouseover PopUp"))).build().perform();
	    Set<String> s1=obj1.getWindowHandles();
	    String p2=obj1.getWindowHandle();
	    System.out.println(p2);
	    String parenttitle=obj1.getTitle();
	    for(String wind : s1)
	    {
	    	if(!wind.equalsIgnoreCase(p2))
	    	{
	    		Thread.sleep(3000);
	    		System.out.println(obj1.switchTo().window(wind).getTitle());
	    		obj1.close();
	    	}
	    }
	    obj1.switchTo().window(p2);
	    obj1.findElement(By.xpath("//input[@type='button']")).click();
	    System.out.println("here");
	    obj1.quit();
	}
}
