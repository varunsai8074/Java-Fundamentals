import java.util.*;
public class Sumofnum
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = n ;i<=n;i++)
        {
            for(int j = 0 ;j<=m;j++)
            {
                sum = sum+j;
            }
            
        }
        System.out.println(sum);
    }
}
