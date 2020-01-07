package lesson1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Assertion {
	
  @Test
  public void test(){
	  SoftAssert obj1=new SoftAssert();
	  System.out.println("test started");
	  obj1.assertEquals(12, 123,"no match qwe");
	  System.out.println("test complete");
	  obj1.assertAll();
  }
}
