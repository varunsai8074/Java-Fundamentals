import java.util.*;
public class String4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev ="";
        for(int i=str.length();i>0; i--)
        {
            rev = rev+str.charAt(i-1);
            
        }
        System.out.println(rev);
    }
}
