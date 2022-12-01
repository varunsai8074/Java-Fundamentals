import java.util.*;
public class String5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String stri = sc.nextLine();
        boolean k = str.equals(stri);
        
        if(k == false)
        {
            System.out.println("Strings are not same");
        }
        else
        {
            System.out.println("Strings are same");
        }
        
    }
}
