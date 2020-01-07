package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

import org.junit.Assert;

public class Colour_detect {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		WebDriver obj1=new FirefoxDriver();
		obj1.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		String b=obj1.findElement(By.xpath("//button[@id='autoclosable-btn-success']")).getCssValue("background-color");
        System.out.println(b);
        Assert.assertEquals(b, "rgb(92, 184, 92)");
		String c=obj1.findElement(By.xpath("//button[@id='autoclosable-btn-warning']")).getCssValue("background-color");
		System.out.println(c);
		Assert.assertEquals(c, "rgb(240, 173, 78)");
		String d=obj1.findElement(By.xpath("//button[@id='autoclosable-btn-warning']")).getText();
		System.out.println(d);
		obj1.navigate().to("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		obj1.findElement(By.linkText("Launch modal")).click();
		String abc=obj1.getWindowHandle();
		obj1.switchTo().window(abc);
		String def=obj1.findElement(By.xpath("//div[@class='modal fade in']/div/div/div[3]")).getText();
		System.out.println(def);
		obj1.findElement(By.linkText("Close")).click();
		obj1.switchTo().parentFrame();
		obj1.findElement(By.xpath("//a[@href='#myModal']")).click();
		System.out.println("here");
		String ghi=obj1.getWindowHandle();
		System.out.println("here");
		obj1.switchTo().window(ghi);
		System.out.println("here");
		obj1.findElement(By.xpath("//a[@href='#myModal']")).click();
		obj1.findElement(By.xpath("//a[@href='#myModal2']")).click();
		System.out.println("here");
	}
}
