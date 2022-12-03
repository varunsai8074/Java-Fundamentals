import java.util.Scanner;
class Removefirstandlast{
	public static String removeFirstandLast(String str)
	{
	    String k="";
		for(int i=0;i<str.length();i++)
		{
		    
		    if(i ==0 || i==str.length()-1)
		    {
		       continue;
		    }
		    else
		    {
		         k = k+str.charAt(i);
		    }
		}
		return k;
	}

public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
	    String str = sc.nextLine();
		System.out.print(removeFirstandLast(str));
	}
}
