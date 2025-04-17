
public class FinallyDemo {
	void procA()  {
		try {
			System.out.println("Inside Proc A");
			throw new RuntimeException("checking finally");
				}
		finally {
			System.out.println("Proc A's Finally");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FinallyDemo f1 = new FinallyDemo();
			f1.procA();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}

	}

}
