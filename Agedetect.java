import java.util.*;
public class Agedetect
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Year of Birth");
        int YB = sc.nextInt();
        System.out.println("Enter Current year");
        int CY = sc.nextInt();
        if(YB < CY)
        {
            int age = CY - YB;
            System.out.println("Your age is "+age);
        }
        if(YB > CY)
        {
             CY = CY+100;
            int age = CY - YB;
            System.out.println("Your age is "+age);
            
        }
        
    }
}
