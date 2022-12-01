import java.util.*;
public class Football
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int l = sc.nextInt();
        int bg = sc.nextInt();
        
        int tl = 2 *(l+bg);
        int qc = l * bg;
        System.out.println(tl);
        System.out.println(qc);
    }
}
// System.out.println("");
