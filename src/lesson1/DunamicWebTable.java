package lesson1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DunamicWebTable {
		static WebDriver obj1;
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
		WebDriver obj1=new FirefoxDriver();
		obj1.get("http://money.rediff.com/gainers/bsc/daily/groupa");
		System.out.println("***************");
		ArrayList<String> li=new ArrayList<String>();
		List<WebElement> li2=obj1.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
		for(int i=1;i<=li2.size();i++) 
		{
		String Companyname=obj1.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
		String Group=obj1.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td[2]")).getText();
		String Prevcloseprice=obj1.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td[3]")).getText();
		String Currprice=obj1.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td[4]")).getText();
		String Changeperent=obj1.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td[5]")).getText();
		Double abc=Double.parseDouble(Currprice.replaceAll(",",""));
		Double cde=Double.parseDouble(Prevcloseprice.replaceAll(",",""));
		String changeinprice=Double.toString(abc-cde);
		if(Companyname.equals("Arvind Ltd."))
		{
			System.out.println("***************");
			System.out.println(Group + " " + Prevcloseprice + " " + " " + Currprice);
		}
//		li.add(Companyname);
//		li.add(Group);
//		li.add(Prevcloseprice);
//		li.add(Currprice);
//		li.add(Changeperent);
//		li.add(changeinprice);
//		}
//		for(String g : li)
//		{
//			System.out.println(g);
//		}
	 }
}
}
