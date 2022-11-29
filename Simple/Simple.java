import java.util.*;
public class Simple
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int y = sc.nextInt();
        float i = sc.nextFloat();
        
        float si = (p*y*i)/100;
        
        System.out.printf("%.2f",si);
    }
}
