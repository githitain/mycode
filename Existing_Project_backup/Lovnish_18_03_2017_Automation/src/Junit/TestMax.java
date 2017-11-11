package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMax 
{
	@BeforeClass
	public static void set()
	{
		System.out.println("Before Class-1");
	}
	
	@After
	public void donw()
	{
		System.out.println("@After-2");
	}
	
	@Test
	public void Testfindcube()
	{
		System.out.println("Test Testfindcube-3");
		assertEquals(27,max.findcube(3));
		assertEquals(27,max.findcube(4));
		
	}
	@Test
	public void Testfindreverse()
	{
		System.out.println("Test Testfindreverse-4");
		assertEquals("eman",max.findreverse("name"));
		assertEquals("trial",max.findreverse("name"));
	}
	@Test
	public void TestFindmax()
	{
		System.out.println("Test TestFindMax-5");
		assertEquals(4,max.findMax(new int[]{1,2,3,4}));
		assertEquals(2,max.findMax(new int[]{1,2,3,4}));
	}
	
	@AfterClass
	public static void donwAll()
	{
		System.out.println("@AfterCLass-6");
	}
	
	@Before
	public void setup()
	{
		System.out.println("@@Before-7");
	}
}
