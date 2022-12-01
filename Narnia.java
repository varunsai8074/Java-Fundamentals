import java.util.Scanner;
public class Narnia
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,p;
        m=sc.nextInt();
        n=m%10;
        p=m/10;
        System.out.println(n+p);
    }
}
