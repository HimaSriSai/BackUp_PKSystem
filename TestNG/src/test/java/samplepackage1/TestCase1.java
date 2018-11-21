package samplepackage1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void testCase1() {
		System.out.println("1 test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("1 test case 2");
	}
	@Test(groups={ "functest"})
	public void testMethod1() {
		System.out.println("1 group test 1");
	}

	@Test(groups={ "functest"})
	public void testMethod2() {
		System.out.println("1 group test 2");
	}

	@AfterSuite
	public void afterSuiteTest() {
		System.out.println("1 after suite class");
	}

	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("1 before suite class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println(" 1 before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("1 after test");
	}

	@BeforeGroups(groups={ "functest"})
	public void beforeGroupsTest() {
		System.out.println("1 before group test");

	}

	@AfterGroups(groups={ "functest"})
	public void afterGroupTest() {
		System.out.println("1 after group test");
	}

	@BeforeClass
	public void beforeClassTest() {
		System.out.println("1 before class");
	}

	@AfterClass
	public void afterClassTest() {
		System.out.println("1 after class ");

	}

	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("1 before method");
	}

	@AfterMethod
	public void afterMethodTest() {
		System.out.println("1 after method");
	}

}
