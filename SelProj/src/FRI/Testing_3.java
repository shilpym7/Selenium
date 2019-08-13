package FRI;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing_3 {
  @Test
  public void test1() {
	  String er="NOIDA",ar="NOIDA";
	  System.out.println("In test1");
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(ar,er);
	  System.out.println("In test1-After assert");
  }
  @Test
  public void test2()
  {
	  String er="NOIDA",ar="NOID";
	  System.out.println("In test2");
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(ar,er);
	  System.out.println("In test2-After assert");
	//  sa.assertAll();
  }
}
