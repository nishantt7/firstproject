package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtube_try1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
		WebDriver obj1=new FirefoxDriver();	
		obj1.get("https://www.ebay.com/");
		WebDriverWait wt=new WebDriverWait(obj1,30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='infcontainer']//a[@href='javascript:;'][@id='i-faq']")));
		obj1.findElement(By.linkText("register")).click();
		obj1.findElement(By.id("sgnTab")).click();
		obj1.findElement(By.id("regTab")).click();
		obj1.findElement(By.name("firstname")).sendKeys("abc");
		obj1.findElement(By.id("lastname")).sendKeys("def");
		obj1.findElement(By.name("email")).sendKeys("abc@gmail.com");
		obj1.findElement(By.id("PASSWORD")).sendKeys("Halfbay@123");
		obj1.findElement(By.xpath("//div[@id='showPASSWORD']//span[@class='gspr chk-off']")).click();
		obj1.findElement(By.xpath("//div[@id='showPASSWORD']//span[@class='gspr chk-on']")).click();
		obj1.findElement(By.xpath("//div[@id='infcontainer']//a[@href='javascript:;'][@id='i-faq']")).click();
		obj1.findElement(By.className("expand")).click();
		String test=obj1.findElement(By.id("faqdeskoly")).getText();
		System.out.println(test);
		if (test.contains("Where"))
			System.out.println("success");
		else
			System.out.println(" no success");
		wt.until(ExpectedConditions.elementToBeClickable(By.id("i-srvy")));
        obj1.findElement(By.id("i-srvy")).click();
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("srvydeskolyin")));
		String test2=obj1.findElement(By.id("srvydeskolyin")).getText();
		System.out.println(test2);
		if (test2.contains("Tell us"))
			System.out.println("success");
		else
			System.out.println(" no success");
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='srvyanswr']")));
		obj1.findElement(By.xpath("//div[@class='srvyanswr']")).click();
		System.out.println("click done");
		obj1.findElement(By.xpath("//div[@class='srvyanswr']")).sendKeys("hello");
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='button'][@class='ibtn ibtn-ter sbtdsk']")));
		obj1.findElement(By.xpath("//input[@type='button'][@class='ibtn ibtn-ter sbtdsk']")).click();
		System.out.println("done");
	}
}
