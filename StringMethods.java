
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Searching Strings
		//int indexOf(char ch) - returns the index of char in String else -1
		//int indexOf(String str);
		//int indexOf(char ch,int startIndex); 
		//int indexOf(String str, int startIndex);
		String st = "This is Java class";
		System.out.println("Presence of J in String "+st.indexOf('J'));
		System.out.println("Presence of 'is' in String "+st.indexOf("is"));
		System.out.println("Presence of 'is' in String from loc 3 "+st.indexOf("is",3));
		//int lastIndexOf(char ch)
		//int lastIndexOf(String str);
				//int lastIndexOf(char ch,int startIndex); 
				//int lastIndexOf(String str, int startIndex);
		System.out.println("Presence of i in String "+st.lastIndexOf('i'));
		//String methods
		//String substring(int startindex)
		String sub = st.substring(4);
		System.out.println("substring "+ sub);
		System.out.println("substring1 "+ st.substring(5,10));
		//String replace(char or,char re)
		st=st.replace('i', 'k');
		System.out.println(st);
		//trim - removes leading and trailing spaces
		// static String valueOf(String g) - converts data of a specific type to String
		String i= String.valueOf(4); //converts 4 to string type
		String f = String.valueOf(4.5);
		System.out.println(i+" f"+f);
		String i1 =""+4;
		System.out.println(i1);
		//static String join(String s1,String s2,....,String sn);
		
		String res = String.join("  ","alpha","beta"," gamma");
		System.out.println(res);
		boolean v1 = st.startsWith("Th");
		//boolean startsWith(String s1);
		//boolean endsWith(String s2);
		//StringBuffer class - work with strings that need not be fixed length
		//they are mutable
		//Constructors
		//StringBuffer()
		//StringBuffer(int size)
		//StringBuffer(String str)
		//StringBuffer(CharSequence s)
		StringBuffer sb = new StringBuffer(); //16 bytes character space
		StringBuffer sb1 = new StringBuffer(48);
		StringBuffer sb2 = new StringBuffer("This is Java class");
		//CharSequence ch[] = "abc";
		//StringBuffer sb3 = new StringBuffer(ch);
		//int length() -gives the number of characters present
		//int capacity() - max size of the string
		//setLength(int size)
		//char charAt(int pos) 
		// setCharAt(int pos, char ch)
		//char[] getChars()
		//append(String s1)
		sb.append("abc");
		sb.insert(4, 'c');
		sb.insert(6, "abc");
		sb.reverse();
		sb.replace(0, 5, "Hello");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//
		
		
		
		

	}

}
