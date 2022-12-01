import java.util.*;
public class Series4
{
    public static void main(String[] args)
    {
        double a=0.5,d;
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        for(int i =0; i<n; i++)
        {
            System.out.printf("%.1f ",a);
             d = a*3;
             a = d;
           
        }
    }
}
