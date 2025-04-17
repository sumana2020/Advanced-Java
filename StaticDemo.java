package P1;

public class StaticDemo {
	static int var1=0;//static variable - called directly by class
	String v1; //instance variable - variable that called by objects
	final int v2 = 10;
	StaticDemo(String v1)
	{
		this.v1 = v1;
		var1++;
	}
	final void print() {
		System.out.println("val");
	}
	static void display()
	{
		System.out.println("Numb of objects "+var1);
	}
	public static void main(String args[])
	{
		StaticDemo s1 = new StaticDemo("n1");
		StaticDemo s2 = new StaticDemo("n2");
		StaticDemo s3 = new StaticDemo("n3");
		System.out.println("count "+StaticDemo.var1);
		//System.out.println("count "+StaticDemo.v1);//instance var 
		
		StaticDemo.display();
		
		
	}

}
final class Inherit extends StaticDemo
{
	
	int v2;
	Inherit(String s,int v)
	{
		super(s);
		v2 = v;
	}
	/*void print() //method overriding final method in Base class
	{
		
	}*/
	
}

	
	
	
	
	
	
	
	
}
