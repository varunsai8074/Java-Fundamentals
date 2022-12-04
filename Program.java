import java.util.Scanner;
public class Program
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        char str1 = sc.next().charAt(0);
        int n = sc.nextInt();
        char str2 = sc.next().charAt(0);
        int m = sc.nextInt();
        char str3 = sc.next().charAt(0);
        int o = sc.nextInt();
        if(str1 == 'a' && n  == 1 )
        {
            System.out.print("a");
        }
        if(str2 == 'b')
        {
            for(int i=0;i<m;i++)
            {
                 System.out.print("b");   
            }
        }
         if(str3 == 'c'|| str3 == 'f')
        {
            for(int i=0;i<o;i++)
            {
                 System.out.print(str3);   
            }
        }
    }
}
