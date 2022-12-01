import java.util.*;
public class Factorial
{
    public static void main(String[] args)
    {
        int x=1,fact=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(fact < n)
        {
            x = x + 1;
            fact = fact * x;
        }
        if(fact  == n)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
