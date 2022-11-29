import java.util.*;
public class Alice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int r = n%10;
        int res = (n/10)+r;
        
        System.out.println(res);
    }
}
