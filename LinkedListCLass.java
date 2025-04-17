import java.util.*;
public class LinkedListCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> s1 = new LinkedList<String>(); //default
		s1.add("abc");
		s1.add("abd");
		s1.add("accb");
		s1.addFirst("abbv");
		s1.addLast("abcddd");
		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("s1");
		s2.add("s22");
		s2.add("s333");
		s2.add("s4444");
		s2.addFirst("abc");
		s2.add("1234");
		s2.addAll(s1);
		System.out.println(s2);
		Iterator<String> l3 = s2.iterator();
		while(l3.hasNext())
		{
			String st = l3.next();
			if(st.length()<=3)
			{
				l3.remove();
			}
		}
		
		//LinkedList<String> combine = new LinkedList
		String[] stt = s1.toArray(new String[0]);
		
		LinkedList<String> s3 = new LinkedList<String>(s1); //copy
		System.out.println(s1.get(2));
		System.out.println(s1.peek()); //only to LinkedList
		System.out.println(s1.peekLast());// return the last element of linkedlist
		System.out.println(s1.poll());//returns the first element and also removes it
		System.out.println("Revised list");
		for(String s:s1)
		{
			System.out.println(s);
		}
		//System.out.println(s1.pollLast());
		System.out.println("ITerate thru ITerator");
		Iterator<String> it = s1.iterator();
		while(it.hasNext())
		{ String s = it.next();//retrieve the element
			System.out.println(s);
			if(s.length()==3) //remove elements from the collection of length 3
				it.remove();
			
		}
		s1.add("adaff");
		s1.add("dffgg");
		ListIterator<String> it1 = s1.listIterator();
		System.out.println("ListIterator forward");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("ListIterator backwards");
		while(it1.hasPrevious())
		{   String s = it1.previous();
			//System.out.println(s);
		if(s.length()<=5)
			s+="xyz";
		it1.set(s);
		   		}
		System.out.println("After updation");
		for(String s:s1)
		{
			System.out.println(s);
		}
		System.out.println(s1);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		Integer[] ar = l1.toArray(new Integer[0]);
		int sum=0;
		for(int a:ar)
		{
			sum+=a;
		}
	System.out.println("Sum of array list elements are "+sum);
		
		
		
		
		
		
		
	}

}
