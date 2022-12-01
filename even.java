import java.util.*;
public class even
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        if(n >= 1 && m <= 5000)
        {
            for(int i=n;i<=m;i++)
            {
                if(i%2==0)
                {
                    int rem = i%10;
                    n = i/10;
                    if(rem % 2 == 0 && n%2==0 &&i!=100)
                    {
                        System.out.print(i+" ");
                    }
                }
            }
        }
        if(m>5000)
        {
            System.out.println("Invalid Input");
        }
    }
}
