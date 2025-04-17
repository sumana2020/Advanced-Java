import java.util.*;
class Student
{
	String USN,name;
	String ph_no;
	double cgpa;
	Student(String USN,String name,String ph_no,double cgpa)
	{
		this.USN = USN;
		this.name = name;
		this.ph_no = ph_no;
		this.cgpa = cgpa;
	}
	public String toString()
	{
		return USN+"  "+name+"  "+ph_no+"  "+cgpa;
	}
}
public class StudentCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> A = new LinkedList<Student>();
		ArrayList<Student> B = new ArrayList<Student>();
		A.add(new Student("1MS23","ABC","1234567",8.3));
		A.add(new Student("1MS24","ABC1","12845",4.3));
		A.add(new Student("1MS25","ABC2","1334567",9.0));
		B.add(new Student("1MS22","ABC3","2234554",8.4));
		A.addAll(B);
		System.out.println(A);
		/*for(Student s:A)
		{
			A.remove(s);
		}*/
		Iterator<Student> it = A.iterator();
		while(it.hasNext())
		{
			Student s1 = it.next();
			if(s1.cgpa<5)
				it.remove();
			else
				if(s1.ph_no.length()<7)
					it.remove();
							
		}
		for(Student s:A)
		{
			System.out.println(s);
		}
		LinkedList<Student> s2 = new LinkedList<Student>();
			

	}

}
