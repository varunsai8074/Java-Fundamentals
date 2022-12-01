import java.util.*;
public class Garden
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int T = sc.nextInt();
        if((T <= 1 && T >= R || C % T == 0 || T % C == 1))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("nO");
        }
    }
}
