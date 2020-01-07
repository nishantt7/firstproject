package lesson1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class brokenlinks 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
    	ArrayList<String> li3=new ArrayList<String>(verifyLink());
    	XSSFWorkbook workbook = new XSSFWorkbook();
    	FileOutputStream fileOut = new FileOutputStream("D:\\Test.xlsx");
        XSSFSheet sheet = workbook.createSheet("Links and status");
        int j=0;     
        for(int i=0;i<1;i++)
        	 {
              sheet.createRow(i);
        	  for(;j<2;)
        	  {
        	    sheet.getRow(i).createCell(j).setCellValue(li3.get(j));
        	    System.out.println(j);
        	    sheet.getRow(i).createCell(j++).setCellValue(li3.get(j));
        	    System.out.println(j);
        	    j++;
        	  }
             }
        workbook.write(fileOut);
    	fileOut.close();
         }
        	public static List<String> verifyLink()
          	{
        		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
            	WebDriver obj= new FirefoxDriver();
            	obj.get("https://www.makemytrip.com");
            	List<WebElement> li=obj.findElements(By.tagName("a"));
            	System.out.println(li.size());
            	ArrayList<String> li1 =new ArrayList<String>(); 
            	for(WebElement a : li)
            	{
            		try 
            		{
            		String url=a.getAttribute("href");
            		URL link = new URL(url);
                    HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
                    httpConn.setConnectTimeout(2000);
                    li1.add(url);
                    li1.add(httpConn.getResponseMessage());
//                    if(httpConn.getResponseCode()== 200)
//                    { 
//                      System.out.println(urlLink+" - "+httpConn.getResponseMessage());
//                    }
//                    else
//                      System.out.println(urlLink+" - "+httpConn.getResponseMessage());
                    }
        	        catch (StaleElementReferenceException e)
    		        {
    		        }
                    catch (MalformedURLException e)
                    {}
                    catch (Exception e) 
                    {
                    e.printStackTrace();
                    }
            		} 	
            	return li1;
}    	
}


