import java.util.*;
public class HashMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First Constructor
		HashMap<Integer,String> st = new HashMap<Integer,String>();
			
		st.put(101, "ABC"); //add object to the Maps
		st.put(102,"DEF");
		st.put(103, "XYZ");
		//Second Constructor - creating a hashmap from an already hashmap
		HashMap<Integer,String> st1 = new HashMap<Integer,String>(st);
		//Third Constructor - int intial capacity
		HashMap<Integer,String> st3 = new HashMap<Integer,String>(200);
		//Fourth constructor - int initial capacity,float fill ratio
		HashMap<Integer,String> st4 = new HashMap<Integer,String>(100,0.85f);
		String n1 = st.get(101); //retrieving the value based on key
		if(st.containsKey(101)) //search based on key
		{
			System.out.println("exists");
		}
		if(st.containsValue(n1)) //search based on value
		{
			System.out.println("exists");
		}
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//hm.put(104,"jkl");
		hm.putAll(st); 
		if(st.equals(hm)) //compare 2 hashmaps
		{
			System.out.println("equal");
		}
		
		String s = hm.remove(101);
		System.out.println(hm.remove(102,"def"));
		hm.put(104, "abcdef");
		hm.replace(104, "abcd");
		Set<Map.Entry<Integer,String>> set = hm.entrySet();
		for(Map.Entry<Integer,String> ss:set)
		{ //getKey(), getValue(),setValue()
			System.out.println("key"+ss.getKey());
			System.out.println("value"+ss.getValue());
			ss.setValue("cfgh");
		}
		Set<Integer> keys= hm.keySet();
		for(Integer i:keys)
			System.out.println("key "+i);
		ArrayList<String> val = new ArrayList<String>();
		val.addAll(hm.values());	
		
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		

	}

}
