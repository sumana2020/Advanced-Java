package P2;
import P1.*;
public class MainP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n1 = new Number(2,3,4,5);
		ComplexP c1 = new ComplexP(2,4);
		
		//System.out.println("private member "+n1.a);
		System.out.println("protected member "+n1.b);
		System.out.println("default member "+n1.d);
		System.out.println("public member "+n1.c);
		

	}

}
