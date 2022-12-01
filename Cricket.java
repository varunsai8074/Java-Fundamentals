import java.util.*;
public class Cricket
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of matches played");
        int mp = sc.nextInt();
        System.out.println("enter the number innings batted");
        int ib = sc.nextInt();
        System.out.println("enter number of times notout");
        int no = sc.nextInt();
        System.out.println("enter runs scored");
        int rs = sc.nextInt();
        
        int t = ib - no;
        
        float avg = rs/t;
        System.out.printf("batting average=%.1f",avg);
    }
}
