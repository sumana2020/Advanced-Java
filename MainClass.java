package p2;

public class MainClass {
	public static void main(String arg[])
	{
		Rectangle r = new Rectangle(5,6);
		r.getArea();
		r.print();
		Traingle t = new Traingle(2,3);
		//Parent Class ShapeClass
		//Traingle is inherited Class 
		//Dynamic Memory Dispatch
		ShapeClass s = new Traingle(3,4);
		System.out.println(s.d1+" "+s.d2);
		s.getArea(); // of the traingle class
		s.print();
		s = new Rectangle(2,4); 
		Cuboid c = new Cuboid(5,6,2);
		c.getArea();
		c.print();
	}

}
