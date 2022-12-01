import java.util.*;
public class Sum
{
     
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Varun v = new Varun();
        int n = sc.nextInt();
       
        System.out.println(v.Sum(n));
        
    }
}

class Varun
{
    public static int Sum(int n)
    {
        int tot = 0;
        while(n > 0)
        {
            int rem = n % 10;
            n = n/10;
            tot = tot + rem;
        }
        return tot;
    }
}
