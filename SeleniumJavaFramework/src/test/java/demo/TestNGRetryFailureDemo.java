package demo;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNGRetryFailureDemo {
	
	@Test
	public void Test1()
	{
		System.out.println("I am in Test1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("I am in Test2");
		//int i=1/0;
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void Test3()
	{
		Assert.assertTrue(false);
	}

}
