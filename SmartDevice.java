//Enabling multiple inheritance - can implement multiple interfaces
public class SmartDevice extends MainProg implements Camera,Phone 
{
	public void takePhoto()
	{  System.out.print("Enter a string");
		String s = sc.nextLine();
		
		System.out.println("Photo Captured "+s);
	}
	public void makeCall(String number)
	{
		System.out.println("Number called is "+number);
	}
	
}
