package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore
public class TestNGIgnoreDemo {
	
	
	@Test()
	public void Test1()
	{
		System.out.println("In test1");
	}
	
	@Test()
	public void Test2()
	{
		System.out.println("In test2");
	}

}
