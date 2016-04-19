package packNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_2 {
  @Test
  public void f() {
	  System.out.println("This is SECOND NG test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("SECOND: This is before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("SECOND: This is after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("SECOND: This is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("SECOND: This is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("SECOND: This is before Test");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("SECOND: This is after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("SECOND: This is before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("SECOND: This is after suite");
  }

}
