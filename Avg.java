import java.util.*;
public class Avg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float t = a+b+c+d+e;
        float result = t/5;
        System.out.printf("%.2f",result);
        
    }
}
