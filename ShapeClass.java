package p2;

public class ShapeClass //base class
{
double d1,d2;
ShapeClass(double d1, double d2)
{
	this.d1 = d1;
	this.d2 = d2;
}
void getArea()
{
	System.out.println("compute area");
}
void print()
{
	 System.out.println("Area not computed");
}
}

 class Rectangle extends ShapeClass //derived class
{ double area;
	 Rectangle(double d1,double d2)
	 {  super(d1,d2);
		 //this.d1 = d1;
		 //this.d2=d2;
	 }
	 void getArea()
	 {
		 area= d1*d2;
	 }
	
	 void print()
	 {
		 System.out.println("Area is "+area);
	 }
	 
}
class Traingle extends ShapeClass
{
	double area;
	Traingle(double b,double h)
	{ super(b,h);
		//d1=b;
		//d2=h;
		//System.out.println("Read dimensions in Traingle");
	}
	void getArea()
	{
		area = 0.5*d1*d2;
		System.out.println("compute area in traingle");
	}
	void print()
	 {
		 System.out.println("Area is "+area);
	 }
	
	}
class Cuboid extends ShapeClass
{
	double d3;
	double area;
	Cuboid(double d1,double d2,double d3)
	{ super(d1,d2);
		//this.d1 =d1;
		//this.d2 =d2;
		this.d3 =d3;
	}
	void getArea()
	{
		area = d1*d2*d3;
	}
	void print()
	 {
		 System.out.println("Area is "+area);
	 }
	
}