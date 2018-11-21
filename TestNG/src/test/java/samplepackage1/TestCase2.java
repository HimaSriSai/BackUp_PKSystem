package samplepackage1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	public void testCase1() {
		System.out.println("2 test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("2 test case 2");
	}

	@BeforeGroups
	public void beforeGroupsTest() {
		System.out.println("2 before group test");

	}

	@AfterGroups
	public void afterGroupTest() {
		System.out.println("2 after group test");
	}

	@BeforeClass
	public void beforeClassTest() {
		System.out.println("2 before class");
	}

	@AfterClass
	public void afterClassTest() {
		System.out.println("2 after class ");

	}

	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("2 before method");
	}

	@AfterMethod
	public void afterMethodTest() {
		System.out.println("2 after method");
	}

}
