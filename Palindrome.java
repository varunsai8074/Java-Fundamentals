import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();
        int res=0,t;
        t = p;
        while(p > 0)
        {
            int rem = p % 10;
            res = (res * 10) + res;
            p = p/10;
        }
        if(t == res)
        {
            System.out.println("Palindrome");
        }
        else if(t != res)
        {
           System.out.println("Not a Palindrome");
        }
    }
}
