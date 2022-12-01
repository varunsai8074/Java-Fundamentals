import java.util.*;
public class Series8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b=4;
        for(int i=0;i<n;i++)
        {
            b = b+i*i;
             System.out.printf(b+" ");
        }
        
    }
}
