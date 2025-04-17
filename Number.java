package P2;

import java.util.*;


public class Number {
	
	private int a;
	protected int b;
	int d; // default access specifier
	public int c;
	
	Number(int a,int b,int d, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;	
	}
		}

 class Sub extends Number{
	 
	 Sub(int w,int x,int y,int z)
	 {
		 super(w,x,y,z);
		 //w=a;// a is private to Number
		 
	 }
	 void print() {
		 //System.out.println("private var "+a);
		 System.out.println("protected var "+b);
		 System.out.println("default var "+d);
		 System.out.println("public var "+c);
	 }
	 
 }

 