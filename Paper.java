import java.util.*;
public class Paper
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int tot = (w*x)-((w*y)+100);
        System.out.println(tot);
    }
}
