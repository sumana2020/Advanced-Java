import java.util.*;
public class MainProg {
   Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{ 
		SmartDevice ph =  new SmartDevice();
		ph.makeCall("90009090");
		ph.takePhoto();
	}
}
