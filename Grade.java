import java.util.*;
public class Grade
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 100)
        {
            System.out.println("S");
        }
        else if(n >= 90 && n <= 100)
        {
            System.out.println("A");
        }
        else if(n >= 80 && n <= 90)
        {
            System.out.println("B");
        }
        else if(n >= 70 && n <= 80)
        {
            System.out.println("C");
        }
        else if(n >= 60 && n <= 70)
        {
            System.out.println("D");
        }
        else if(n >= 50 && n <= 60)
        {
            System.out.println("E");
        }
        else if(n < 50)
        {
            System.out.println("F");
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}
