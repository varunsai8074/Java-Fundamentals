import java.util.*;
public class String9
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
        if(rev.equals(str))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
        
    }
}
