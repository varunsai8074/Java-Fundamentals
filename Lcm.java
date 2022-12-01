import java.util.*;
public class Lcm
{
    public static void main(String[] args)
    {
        int lcm =0;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m>n)
        {
            lcm=m;
        }
        else if(n>m)
        {
            lcm = n;
        }
        while(true)
        {
            if(lcm % m == 0 && lcm % n == 0)
            {
                System.out.println("LCM of "+m+" and "+n+ " is "+lcm);
                break;
            }
            ++lcm;
        }
    }
}
