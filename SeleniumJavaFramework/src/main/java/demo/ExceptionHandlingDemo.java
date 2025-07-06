package demo;

public class ExceptionHandlingDemo {
	
	public static void main(String args[])
	{
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try
		{
			int i=1/0;
			System.out.println("Completed");
		}catch(Exception e)
		{
			System.out.println("Inside block");
			System.out.println("Message is:"+e.getMessage());
			System.out.println("Message is:"+e.getCause());
			e.printStackTrace();
		}
		finally {
			System.out.println("I am inside finally block");
		}*/
	}

	public static void demo() throws Exception {
		throw new ArithmeticException("Throw error");
	/*	int i=1/0;
		System.out.println("Completed");*/
	}

}
