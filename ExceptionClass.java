import java.util.*;
public class ExceptionClass {
	void CheckAge(int n) throws Exception //throws Exception
	{
		if(n<18)
			throw new Exception("Age should be greater than 18 ");
		else
			System.out.println("No Exceptions");
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//int len = args.length;
		int num,denom;
		try
		{
			System.out.println("Enter numerator and denominator");
			Scanner sc = new Scanner(System.in);
			num = Integer.parseInt(sc.nextLine());
			denom = Integer.parseInt(sc.nextLine());
			double v = num/denom;
			System.out.print("Divided result is "+v);
			int a[] = {10,20,30,40};
			System.out.println("Enter an index ");
			int index = Integer.parseInt(sc.nextLine());
			a[index]=50;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero Exception "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds ");
		}
		try {
		ExceptionClass c = new ExceptionClass();
		c.CheckAge(12);
		}
		catch(Exception e)
		{
			System.out.println("Age lesser than 18 ");
		}
		
		
		
	}

}
