package S09_Session_Junit_June23rd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_assrt 
{
	@Before
	public  void TestBefore()
	{
		System.out.println("Part -1 this is before annotaitoion");
	}
	
	@BeforeClass
	public static void TestBeforeClass()
	{
		System.out.println("Part -1 this is before Class annotaitoion");
	}
	

	
	@Test
	public void TestSum()
	{
		assertEquals(11,junit_method.sum(5, 6));
	}
	
	@Test
	public void TestQube()
	{
		assertEquals(8,junit_method.qube(2));
	}
	
	@Test
	public void TestQube1()
	{
		assertEquals(8,junit_method.qube(2));
	}
	
	@After
	public  void TestAfter()
	{
		System.out.println("Part 3 this is after annotaitoion");
	}
	
	@AfterClass
	public static  void TestAfterClass()
	{
		System.out.println("Part 3 this is afterClass annotaitoion");
	}
	
	
	
}
	
