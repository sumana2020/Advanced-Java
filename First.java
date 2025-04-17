
public class First {
	int a,b;
	First(int x,int y)
	{
		a=x; b=y;
	}
	void display()
	{
		System.out.println("Member values are "+a+" "+b);
	}

}
class Second extends First
{
	int p;
	Second(int x, int y, int p)
	{
		super(x,y);//super constructor
		this.p = p;
	}
	void display() // overridden method
	{
		super.display();//calling method of base class
		System.out.println("Extra value "+p);
	}
	void anotherF()
	{
		System.out.println("Displaying in Second class");
	}
}
class Third extends Second
{
	int q;
	Third(int x, int y, int p,int q)
	{
		super(x,y,p); //constructor of second class
		this.q = q;
		
	}
}