import java.util.*;
public class Harshard2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        harsha h = new harsha();
        h.number(n);
    }
}
class harsha
{
    void number(int n)
        {
            int sum =0,x;
            x=n;
            while(n > 0)
            {
                int rem = n % 10;
                n = n/10;
                sum = sum + rem;
            }
            if(x % sum == 0)
            {
                System.out.println("Harshad Number");
            }
            else
            {
            System.out.println("Not Harshad Number");
            }
        }
}

