import java.util.*;
public class Series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        for(int i = 1; i<=a; i++)
        {
            if(i % 2 == 0)
            {
                b = i*i-2;
                System.out.print(b+" ");
            }
            else
            {
                b = i * i +2;
                System.out.print(b+" ");
            }
        }
    }
}
        
