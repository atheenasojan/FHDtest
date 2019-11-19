package palindrom;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TestCase2 {
	public static void beforeClass(){
		System.out.println("Before PalindromTest2.class");
	}
	@AfterClass
	
	public static void AfterClass(){
		System.out.println("After PalindromTest2.class");
	}
	@Before
	public  void initTest(){
	
	}	
	@Test
	public void testIsPal() {
		
		palindrom test = new palindrom();
		assertTrue(test.isPal(1221));
		
		for(int i=0;i<100;i++)
		assertFalse(test.isPal(i));
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
