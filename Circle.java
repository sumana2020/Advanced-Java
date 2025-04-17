
public class Circle implements Shape{
	double rad;
	double area;
	Circle(double r)
	{
		rad=r;
	}
	public void getArea() {
		area = 3.14*rad*rad;
	}

	public void printArea()
	{
		System.out.println("Area is "+ area);
	}
}
