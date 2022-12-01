import java.util.*;
public class complexequation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c=50,h=30;
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();
        double k = Math.sqrt((2*c*m)/h);
        double l = Math.sqrt((2*c*n)/h);
        double o = Math.sqrt((2*c*p)/h);
        System.out.printf("%.0f ",k);
        System.out.printf("%.0f ",l);
        System.out.printf("%.0f",o);
        
        
       
    }
}
