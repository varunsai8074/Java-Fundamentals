import java.util.*;
public class ProDiv
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       int pro = a*b;
       int quo = a/b;
       int rem = a%b;
       System.out.println(pro);
       System.out.println(quo);
       System.out.println(rem);
    }
}
