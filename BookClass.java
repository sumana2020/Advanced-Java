import java.util.Scanner;

class Book
{
	String author,title,publisher;
	double price;
	Book()
	{
		author = "";
		title = "";
		publisher="";
		price = 0;		
	}
	Book(String author,String title,String publisher,double price)
	{
		this.author=author;
		this.title= title;
		this.publisher=publisher;
		this.price = price;	
	}
	public String toString()
	{
		return "Author "+author+" with title "+title+" with price "+price;
	}
	
}
public class BookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of books");
		Scanner sc = new Scanner(System.in);
		int size=Integer.parseInt(sc.nextLine());
		//int i[] = new int[20];
		//int i[20]; //not allowed
		Book b[] = new Book[size];// b is only reference
		String t;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Title, author and publisher details");
			t = sc.nextLine();
			String a = sc.nextLine();
			String p = sc.nextLine();
			System.out.println("Enter price");
			double pr = Double.parseDouble(sc.nextLine());
			b[i]= new Book(a,t,p,pr);
				
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(b[i]);
		}
		//b[i]=new Book();
		for(int i=0;i<size;i++ )
		{if("a1".equals(b[i].author))
				{
			System.out.println(b[i]);
				}
			
		}
		
			
		}}

		

	
