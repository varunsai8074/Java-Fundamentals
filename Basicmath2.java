import java.util.*;
public class Basicmath2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        opera p = new opera();
        String op = sc.next();
        float a = sc.nextInt();
        float b = sc.nextInt();
        p.operator(op,a,b);
        
    }
}
class opera
{
    void operator(String op,float a,float b)
    {
        if(op.equals("-"))
        {
            System.out.printf("%.0f",a-b);
        }
        else if(op.equals("+"))
        {
            System.out.printf("%.0f",a+b);
        }
        if(op.equals("*"))
        {
            System.out.printf("%.1f",a*b);
        }
        else if(op.equals("/"))
        {
            System.out.printf("%.1f",a/b);
        }
    }
}
