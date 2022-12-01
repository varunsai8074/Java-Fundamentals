import java.util.*;
public class String10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for(int i = 0; i<str.length(); i++)
        {
            // String k = str.charAt(i);
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                 count = count+1;
            }
        }
        System.out.println(count);
    }
}
