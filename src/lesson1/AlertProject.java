package lesson1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertProject {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
		WebDriver obj1=new FirefoxDriver();
		obj1.get("http://www.rediff.com/");
		WebDriverWait wt=new WebDriverWait(obj1,30);
		obj1.findElement(By.linkText("Sign in")).click();
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='floatL']/input")));
		obj1.findElement(By.xpath("//div[@class='floatL']/input")).click();
		Thread.sleep(20000);
		Alert alt=obj1.switchTo().alert();
		String abc=alt.getText();
		System.out.println(abc);
		alt.accept();
		obj1.quit();
	}
}







