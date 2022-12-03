import java.util.Scanner;
class Play1
{
	public static void main(String args[])
	
	{
 int x1,x2,y1,y2;
double dis;
Scanner sc=new Scanner(System.in);
x1=sc.nextInt();
y1=sc.nextInt();
x2=sc.nextInt();
y2=sc.nextInt();  
dis=calDis(x1,y1,x2,y2);
System.out.println(dis);
}
static double calDis(int x1,int y1,int x2,int y2)
{
	    int x = (x1-x2) * (x1-x2);
        int y = (y1-y2) * (y1 - y2);
        int k = x-y;
        double xy = Math.sqrt(k);
        return xy;
}

}

/*import java.util.*;
public class Play
{
    public static void main(String args[])
    {
        Scanner sc  =new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int x = (x1-x2) * (x1-x2);
        int y = (y1-y2) * (y1 - y2);
        int k = x-y;
        
        double xy = Math.sqrt(k);
        System.out.printf("%.1f",xy);
    }
}*/
