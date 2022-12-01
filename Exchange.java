import java.util.*;

class Exchange
{
    public int a;
    public int b;
    public void var(int a ,int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    
}

public class Swap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Exchange e = new Exchange();
        int a = sc.nextInt();
        int b = sc.nextInt();
        e.var(a,b);
        // System.out.println(a+" "+b);
    }
}
