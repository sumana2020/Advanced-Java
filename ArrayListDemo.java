import java.util.*;


public class ArrayListDemo {
	public void removeLength(ArrayList<String> s,int len)
	{
		ListIterator<String> it1= s.listIterator();
		while(it1.hasNext())
		{
			if(it1.next().length()==3)
			{
				it1.remove();
			}
		}
		//it1=s.listIterator();
		System.out.println("Reversed List");
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l11 = List.of("abc","def","xyz","xccf");
		l11.add("rff");
		
		ArrayList<Integer> s1 = new ArrayList<Integer>();//default constructor
		/*ArrayList s2 = new ArrayList();
		s2.add("100");
		int c = (int)s2.get(0);*/
		ArrayList<Integer> ill = new ArrayList<Integer>(-5);
		
		s1.add(100);
		s1.add(200); 
		s1.add(1,300);
		Iterator<Integer> it = s1.iterator();
		while(it.hasNext())
		{ if(it.next()==100)
			it.remove();
		}
		for(Integer s:s1)
		{
			if(s==200)
				s1.remove(s);
			System.out.println(s);
		}
		s1.get(0);
		s1.remove(1); //remove object at index location 1
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("ABC");
		s1.removeFirst();
		s1.add(400);
		s1.add(0,250);
		s1.add(2,230);
		Integer[] inn = s1.toArray(new Integer[0]);
		int sum=0;
		for(int i:inn)
		{
			sum+=i;
		}
		System.out.println("Sum is "+sum);
		
		
		
		/*ArrayList<String> s2 = new ArrayList<String>();
		s2.add("s1");
		s2.add("s22");
		s2.add("s333");
		s2.add("s4444");
		s2.addFirst("abc");
		s2.add("1234");
		String st[]= s2.toArray(new String[0]);		
		
		LinkedList<Integer> s3= new LinkedList<Integer>();
		s3.add(3,12);
		s3.peek();
		s3.peekFirst();
		
		ArrayListDemo ad = new ArrayListDemo();
		ad.removeLength(s2,3); //remove elements of the string list of length 3
		for(String s:s2)
		{
			System.out.println(s);
		}
		
		for(Integer i:s1)
		{
			System.out.println(i);
		}
		ArrayList<Integer> s33 = new ArrayList<Integer>(s1);// create from an existing collection
		System.out.println("Second Collection");
		s33.add(260);
		for(Integer i:s33)
		{
			System.out.println(i);
		}
		ArrayList<Integer> s4= new ArrayList<Integer>(5);
		/*
		 * ArrayList(); ArrayList(Collection c); ArrayList(int size);
		 */
		 System.out.println("Size of first collection "+s1.size());
		 System.out.println("location of 300 in the  collection "+s1.indexOf(260));
		 if(s1.contains(250))
			 System.out.println("250 exists");
		 else
			 System.out.println("250 not exists");
		 int v1 = s1.get(3);
		 v1+=10;
		 s1.set(3,s1.get(3)+10);
		 for(Integer i:s1)
			{
				System.out.println(i);
			}
		 
		
		
		
	}

}
