import java.util.*;
public class Friendly
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        
        int i,d=0,e=0;
        for(i = 1; i <= f; i++)
        {
             if(f % i == 0)
            {
                d += i;
            }
        }
         for(i = 1; i <= s; i++)
        {
            if(s % i == 0)
            {
                e += i;
            }
            
        }
        int sum = d/f;
        int tot = e/s;
        
        if(sum == tot)
        {
            System.out.println("Friendly Pair");
        }
        else
        {
            System.out.println("Not Friendly Pair");
        }
        
        
    }
}
