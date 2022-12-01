import java.util.*;
public class Lights
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float S = sc.nextFloat();
        float D = sc.nextFloat();
        float T = sc.nextFloat();
        
        if(S/D<T)
        {
            System.out.println("no");
        }    
        else if(S/D>T)
        {
            System.out.println("yes");
        }
    }
}
