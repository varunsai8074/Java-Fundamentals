import java.util.*;
public class SumDiff2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        addsub  ab= new addsub(); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        ab.add(a,b);
        ab.sub(a,b);
        
    }
}
class addsub
{
    void add(int a,int b)
    {
        System.out.println(""+(a+b));
    }
    void sub(int a,int b)
    {
        System.out.println(""+(a-b));
    }
}
