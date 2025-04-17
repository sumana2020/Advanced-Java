
public class SubStringP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainS="This is the main Strisg";
		String search = "is";
		String sub = "to";
		String result = "";
		int i;
		do
		{
			i = mainS.indexOf(search);
			if(i!=-1)
			{
				result = mainS.substring(0,i); //copy the substring from 0 to ith position
				result= result+sub; //append it with sub
				result +=mainS.substring(i+search.length());//copy the remaining part of the string
				mainS = result;
			}
			
		}while(i!=-1);
		System.out.println("Revised string is "+mainS);

	}

}
