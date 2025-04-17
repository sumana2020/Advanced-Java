import java.util.*;
public class ExceptionC {
	static Scanner sc; //= new Scanner(System.in);
	void procA() throws Exception
	{
		try {
			System.out.println("Try block");
			throw new Exception("Proc A");
				}
		finally {
			System.out.println("Close ProcA");
		}
	}
		
	public static void main(String args[])
	{  sc = new Scanner(System.in);
	   ExceptionC c = new ExceptionC();
	   try {
	   c.procA();
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception handling");
	   }
	
		/*int num,denom;
		System.out.println("Enter the numerator and Denominator");
		num = Integer.parseInt(sc.nextLine());
		denom = Integer.parseInt(sc.nextLine());
		try {
			if(denom==0)
				throw new ArithmeticException("Divide by zero");
			int v = num/denom;
			System.out.println("Result is "+v);
			
			int a[] = {10,20,30,40};
			System.out.println("Enter an index ");
			int index = Integer.parseInt(sc.nextLine());
			a[index]=50;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured "+"Divide by zero ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured "+"Index is off limits ");
		}
		*/
		try
		{
			ExceptionC c1 = new ExceptionC();
			c1.checkAge(15);
			System.out.println("No Exception");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occured "+e.getMessage());
		}
		
	}
	void checkAge(int n) throws NullPointerException
	{
		if(n<18)
		{
			throw new NullPointerException(n+" Age is less than 18 ");
		}
	}

}
