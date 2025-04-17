
public class MainClass {
 public static void main(String args[])
 {
	 First f1 = new Second(2,3,4);
	 f1.display(); // executes the display function of second class
	 //f1.anotherF();//error
	 Second s1 = new Second(3,4,5);
	 s1.display();
	 s1.anotherF();
	 
 }
	
}
