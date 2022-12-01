import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
        int rem,res=0;
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n > 0)
        {
            rem = n%10;
            n = n/10;
            res = (res*10)+rem;
        }
        System.out.println(res);

    }
}
