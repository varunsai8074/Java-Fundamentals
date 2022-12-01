import java.util.*;
public class Flash
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int w = sc.nextInt();
        int y = sc.nextInt();
        int x = sc.nextInt();
        int z = sc.nextInt();
        float d = (w+x)/2;
        float e = y+z;
        System.out.printf("%.1f\n%.1f",d,e/2);
    }
}
