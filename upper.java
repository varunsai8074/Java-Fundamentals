import java.util.*;
public class upper
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upper=0;
        int lower=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >='A' &&str.charAt(i) <='Z')
            {
                upper = upper+1;
            }
            else if(str.charAt(i) >='a' &&str.charAt(i) <='z')
            {
                lower = lower+1;
            }
        }
        System.out.println("UPPER CASE "+upper);
        System.out.println("LOWER CASE "+lower);
    }
}
