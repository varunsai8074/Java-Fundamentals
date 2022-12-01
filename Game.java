import java.util.*;
public class Game
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int lw = sc.nextInt();
        int bw = sc.nextInt();
        int lp = sc.nextInt();
        int bp = sc.nextInt();
        int lsp = sc.nextInt();
        int bsp = sc.nextInt();
        
        int fw = lp+lsp;
        int fp = bsp+bp;
        if(lw == fw && bw == fp )
        {
            System.out.println("Karthi can fix both painting");
        }
        else
        {
            System.out.println("Karthi cannot fix both painting");
        }
    }
}
