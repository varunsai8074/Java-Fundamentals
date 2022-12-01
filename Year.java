import java.io.*;
import java.util.*;
public class Year
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        int leap=0;
        if(y%100==0 && y%400==0 && y%4==0)
        {
            leap= leap+1;
        }
         else if(leap == 0 && m ==  2 && y != 2013)
        {
            System.out.println("Number of days is 29");
        }
        else if(y == 2013 && m == 2)
        {
            System.out.println("Number of days is 28");
        }
        else if( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 )
        {
            System.out.println("Number of days is 31");
        }
         else if( m == 4 || m == 6 || m == 9 || m == 11)
        {
            System.out.println("Number of days is 30");
        }
        
    }
}
