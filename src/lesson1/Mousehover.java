package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
		WebDriver obj1=new FirefoxDriver();
		obj1.get("http://book.spicejet.com/search.aspx");
        Actions act=new Actions(obj1);
        act.moveToElement(obj1.findElement(By.linkText("Add-ons"))).build().perform();
        WebDriverWait wt =new WebDriverWait(obj1,30);
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='GetPage.aspx?pg=http://www.spicejet.com/SpiceClubMembershipOffer.aspx']"))).click();
        obj1.navigate().to("http://jqueryui.com/droppable/");
        obj1.switchTo().frame(obj1.findElement(By.xpath("//iframe[@class='demo-frame']")));
        act.clickAndHold(obj1.findElement(By.id("draggable"))).moveToElement(obj1.findElement(By.id("droppable"))).release().build().perform();
        System.out.println("done");
	}

}
