import java.util.*;
public class Budget
{
    public static void main(String args[])
    {
        float tb;
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
    
        tb = ((a*350)+(b*230)+(c*190)+(d*125)+(e*180));
        //System.out.println(f);
        if(tb <= 15000)
        {
            System.out.println("yes");
        }
        else if(tb > 15000)
        {
            System.out.println("no");
        }
        
        
    }
}
