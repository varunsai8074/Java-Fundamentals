import java.util.Scanner;
public class Furniture
{
public static void main(String arg[])	
	{
long amount,deppercent,year,afterdep,temp;
Scanner sc=new Scanner(System.in);
amount=sc.nextLong();
deppercent=sc.nextLong();
year=sc.nextLong();
temp=depreciationCal(amount,deppercent,year);
System.out.println(temp);
	}
static long depreciationCal(long amount,long deppercent, long year )
	{
	    long temp;
	    temp=amount;
	    for(int i=0;i<year;i++)
	    {
	        temp=((100-deppercent)*temp)/100;
	    }
	    
	    return temp;
	}
}
