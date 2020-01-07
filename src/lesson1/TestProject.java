package lesson1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.seleniumeasy.com/test/");
		//obj.manage().window().maximize();
		obj.manage().window().setSize(new Dimension(1366,768));
		//obj.manage().window().fullscreen();
		System.out.println("Title of the page is "+obj.getTitle());
		System.out.println("Title of the page is "+obj.getCurrentUrl());
		if(obj.getTitle().contains("Best Demo"))
			System.out.println("Title is correct");
		else
			System.out.println("Title is in	correct");
	    if(obj.getCurrentUrl().equals("http://www.seleniumeasy.com/test/"))
		    System.out.println("URL correct");
	    else
		    System.out.println("URL is in correct");
	    obj.findElement(By.id("basic_example")).click();
	    String test=obj.findElement(By.xpath("//div[@id='basic']/p[1]")).getText();
	    if (test.contains("Assuming you have a basic understanding of HTML and CSS"))
	    	System.out.println("we are in basic tab and below are the contents present in that");
	    else
	    	System.out.println("we are somwhere else");
	    List<WebElement> links=obj.findElements(By.xpath("//a//following::div[@class='list-group']//preceding::a[@id='btn_inter_example']"));
	    for(int i=0;i<links.size();i++) {
	    	System.out.println(links.get(i).getText());}
	    System.out.println(links.size());
	    int c=links.size();
	    if(c==8)
	    	System.out.println("the contents are correct");
	    else
	    	System.out.println("Contents are not correct in no.");
	    for (int j=0;j<links.size();j++)
	    	System.out.println(links.get(0).getText());
	    	links.get(0).click();
	        
	  //ArrayList<WebElement> arr=new ArrayList<WebElement>();
	  //arr=obj.findElements(By.xpath("//preceding::p[@class='text-center']//a//following::div[@class='list-group']"));*/
	  //the above code does not work since findElements has return type as list
   }
}


