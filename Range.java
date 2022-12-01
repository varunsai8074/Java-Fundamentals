import java.util.*;
public class Range
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int i,j;
        for (i=n ; i<=m; i++)
        {
            for(j=2 ; j<=i; j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)
            {
                System.out.println(i);
            }
        }
            
    }
}
