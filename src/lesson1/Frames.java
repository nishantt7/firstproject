package lesson1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) 
	{
		try {
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Desktop/test.html");
		driver.switchTo().frame(0);
		driver.findElement(By.name("userName")).sendKeys("test1");
		driver.switchTo().parentFrame();
		//driver.findElement(By.name("userName")).sendKeys("parent");
		driver.switchTo().frame("IF2");
		driver.findElement(By.name("userName")).sendKeys("test");
		driver.switchTo().parentFrame();
		driver.switchTo().frame("iframe1");
		driver.findElement(By.name("userName")).sendKeys("test2");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}