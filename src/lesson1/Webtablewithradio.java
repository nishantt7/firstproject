package lesson1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webtablewithradio {
	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
	WebDriver obj1=new FirefoxDriver();
	obj1.get("http://newtours.demoaut.com");
	obj1.findElement(By.name("userName")).sendKeys("batman");
	obj1.findElement(By.name("password")).sendKeys("batman");
	obj1.findElement(By.name("login")).click();
	//Select arrivingcity=new Select(obj1.findElement(By.xpath("//select[@name='toPort']")));
	WebDriverWait wt=new WebDriverWait(obj1,40);
	wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@name='findflight']/table[1]/tbody/tr[6]/td[2]/select/option[@value='London']")));
	//findElement(By.xpath("//form[@name='findflight']/table[1]/tbody/tr[6]/td[2]/select/option[@value='London']"));
	Select ariivaldate=new Select(obj1.findElement(By.name("toDay")));
	//arrivingcity.selectByValue("London");
	ariivaldate.selectByValue("13");
	obj1.findElement(By.name("findFlights")).click();
	for(int i=0;i<=10;i++)
	{
	List<WebElement> departtable=obj1.findElements(By.xpath("//form[@method='post']/table[1]/tbody/tr["+i+"]"));
	for(WebElement abc : departtable)
	  {
		//System.out.println(abc.getText());
		if(abc.getText().contains("Blue Skies Airlines 361"));
		{
		obj1.findElement(By.xpath("//form[@method='post']/table[1]/tbody/tr[5]/td/input")).click();
		}
		break;
	  }
	}
	for(int i=0;i<=10;i++)
	{
		List<WebElement> departtable=obj1.findElements(By.xpath("//form[@method='post']/table[2]/tbody/tr["+i+"]"));
		for(WebElement abc : departtable)
		  {
		//System.out.println(abc.getText());
			if(abc.getText().contains("Blue Skies Airlines 631"));
			{
			obj1.findElement(By.xpath("//form[@method='post']/table[2]/tbody/tr[5]/td/input")).click();
			}
			break;
		  }
	}
	System.out.println("here");
	obj1.findElement(By.name("reserveFlights")).click();
  }
}



