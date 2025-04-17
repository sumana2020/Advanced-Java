public class Rectangle implements Shape
{ double d1,d2;
 double area;
 	
	Rectangle(double d1,double d2)
	{
		this.d1=d1;
		this.d2 = d2;
	}
	public void getArea()
	 {
		 area= d1*d2;
		 //return area;
	 }
	
	public void printArea()
	 { //Rectangle r1= new Rectangle();
	   System.out.println("Area is "+ area);//+r1.getArea(3, 4));
	 }
}