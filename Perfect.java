import java.util.*;
public class Perfect
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n > 0)
        {
            if(n % 6 == 0)
            {
                System.out.println("perfect Number");
                break;
            }
            else if(n % 6 != 0)
            {
                System.out.println("Not a Perfect Number");
            }
            break;
        }
    }
}
