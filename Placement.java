import java.util.*;
public class Placement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int cse = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ece = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int mech = sc.nextInt();
        System.out.println("Highest placement");
        if(cse >ece && cse>mech)
        {
            System.out.println("CSE");
        }
        else if(ece >cse && ece>mech)
        {
            System.out.println("ECE");
        }
        else if(mech >ece && mech>cse)
        {
            System.out.println("MECH");
        }
    }
}
