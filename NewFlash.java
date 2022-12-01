import java.util.*;
public class NewFlash
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        
        float g = x1+x2+x3;
        float h = y1+y2+y3;
        System.out.printf("%.1f\n%.1f",g/3,h/3);
    }
}
