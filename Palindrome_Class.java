
/*Create a Palindrome Checker program using StringBuffer that verifies if a given string is a palindrome. The program should implement user-defined exception handling for the following:
1.	If the input string contains non-alphabetical characters, throw a custom exception InvalidInputException.
2.	If the string length is less than 3 characters, throw a custom exception ShortStringException.
3.	If the string is a palindrome (irrespective of the case), print a message indicating that it is a palindrome.
4.	If the string is not a palindrome, print a message indicating that it is not a palindrome.
*/

import java.util.Scanner;

class InvalidException extends Exception
{
	InvalidException(String st)
	{
		super(st);
	}
}
class ShortStringException extends Exception
{
	ShortStringException(String st)
	{
		super(st);
	}
}


public class Palindrome_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the STring");
    String st = sc.nextLine();
    try {
    if(st.length()<=3)
    	throw new ShortStringException("less than 3");
    else
    {
    	if(!st.matches("[A-Za-z]+"))
    	{
    		throw new InvalidException("String has other characters too");
    	}
    	else
    	{
    		//convert all alphabets to lowercase (Uppercase also fine)
    		String lowercase = st.toLowerCase();
    		StringBuffer reversedSt	= new StringBuffer(lowercase);
    		reversedSt.reverse();
    		if(lowercase.equals(reversedSt.toString()))
    		{
    			System.out.println("Palindrome");
    		}
    		else
    			System.out.println("Not Palindrome");
    	}
    }
    }
    catch(Exception e)
    {
    	System.out.println(e.getMessage());
    }
    
    
	}

}
