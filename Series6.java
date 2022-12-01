import java.util.*;
public class Series6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int f=0,f1=0;
        for(int i = 1;i<=n; i++)
        {
            if(i % 2 == 0)
            {
                f = (i * i)-2;
                System.out.print(f+" ");
            }
            else
            {
                f1 = (i * i ) - 1;
                System.out.print(f1+" ");
            }
        }
        
    }
}
