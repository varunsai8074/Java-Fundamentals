import java.util.Scanner;
public class Pow
{
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    double e=Math.pow(x,y);
    System.out.printf("%.0f",e);
    }
}
