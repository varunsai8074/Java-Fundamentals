import java.util.*;
public class Play
{
    public static void main(String args[])
    {
        Scanner sc  =new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int x = (x1-x2) * (x1-x2);
        int y = (y1-y2) * (y1 - y2);
        int k = x-y;
        
        double xy = Math.sqrt(k);
        System.out.printf("%.1f",xy);
    }
}
