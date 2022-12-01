import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        
        for(int i=2; i<n; i++)
        {
            if(n % i == 0)
            {
                System.out.println("Not a Prime");
                t++;
                break;
            }
        }
        if(t == 0)
        {
            System.out.println("Prime Number");
        }
     
        
    }
}
