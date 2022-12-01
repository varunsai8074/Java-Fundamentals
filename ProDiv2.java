import java.util.*;
public class ProDiv2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        addsub  ab= new addsub(); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        ab.mul(a,b);
        ab.div(a,b);
        ab.rem(a,b);
        
    }
}
class addsub
{
    void mul(int a,int b)
    {
        System.out.println(""+(a*b));
    }
    void div(int a,int b)
    {
        System.out.println(""+(a/b));
    }
    void rem(int a,int b)
    {
        System.out.println(""+(a%b));
    }
}
