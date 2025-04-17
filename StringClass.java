//import P1.StaticDemo;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//STring constructors
		String s1 = new String();
		char c[]= {'a','b','c','d','e','f','g'};
		String s2 = new String(c);
		System.out.println(s2);
		String s3 = new String(c,2,2);
		System.out.println(s3);
		String s4 = new String(s3);
		byte[] b = {65,66,67,68,69,70,71}; // ascii values of character
		String s5 = new String(b);
		System.out.println(s5);
		String s6 = "ABCSD";
		String s7 = s6;
		s6=s6+"XYz";//modified s6
		System.out.println(s6+" s6");
		System.out.println(s7+" s7");
		int a =10;
		String s8 = s6 + " "+"GHIJK "+6.7+" "+a;
		s6 = s6.concat("pqrst  ");
		// Character Extraction methods char charAt(int pos)
		System.out.println(s6.charAt(5));
		//getChars(start,end, chararray,in buf location)
		System.out.println(s6+" s6");
		int end = s6.length(); //length of string
		char buf[]=new char[end]; //char array of size end
		s6.getChars(2, 6, buf, 0);
		System.out.println(buf);
		//getBytes()
		//toCharArray() 
		buf = s2.toCharArray();
		//String Comparisons
		//equals() and equalsIgnoreCase
		String a1 = "Hello";
		String a2 = new String("hello");
		String a3 = a1;
		boolean re = a1.equalsIgnoreCase(a2);
		System.out.println(re);
		boolean r1 = a1==a3;
		System.out.println("a1==a3 " + r1); //bcos a1 and a3 point towards the same location
		boolean r2 = a1==a2;//objects a1  and a2 point towards different locations
		System.out.println("a1==a2 " + r2);//false
		//re = a1.equals(a2);
		String str1 = "Hello world";
		String str2 = " Hi, view the world";
		//check whether world is present in both the strings
		//1.starting loc of world in str1
		//2.second string
		//3.starting loc of world in str2
		//4. Size of comparison of characters
		boolean v1 = str1.regionMatches(6, str2, 15, 4);
		System.out.println(v1);
		//compareTo() method of Comparator<T> interface
		//STring class implements Comparator interface - defined
		//compareTo() method
		// < 0 - string1 is smaller than string 2
		//= 0 - string1 == string2
		//>0 string1 is greater than string2
		String[] arr = {"abc","axd","abd","abb"};
		System.out.println("Before sorting");
		for(String s:arr)
		{
			System.out.println(s);
		}
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		System.out.println("After sorting");
		for(String s:arr)
		{
			System.out.println(s);
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
