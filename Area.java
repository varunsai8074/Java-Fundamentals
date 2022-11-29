import java.util.*;
public class Area
{
    public static void main(String args[])
    {
        double pi=3.14;
        Scanner sc = new Scanner(System.in);
        int squ = sc.nextInt();
        int len = sc.nextInt();
        int bre = sc.nextInt();
        float rad = sc.nextFloat();
        
        int square = squ * squ;
        int Arearec = len * bre;
        
        System.out.println(square);
        System.out.println(Arearec);
        System.out.printf("%.2f",(pi * rad * rad));
}
}
