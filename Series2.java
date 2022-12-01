import java.util.*;
public class Series2
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int  n = sc.nextInt();
        int sum = 6;
        for(int i = 1 ; i<=n; i++)
        {
            System.out.print(sum+" ");
            sum  += 5 * i;
            
        }
    }
}
