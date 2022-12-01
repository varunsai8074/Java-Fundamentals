import java.util.*;
public class Lab
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();
        System.out.println("Enter z");
        int z = sc.nextInt();
        if(x < y && x < z)
        {
            System.out.println("L1 has the minimal seating capacity");
        }
        if(y < x && y < z)
        {
            System.out.println("L2 has the minimal seating capacity");
        }
        if(z < x && z < y)
        {
            System.out.println("L3 has the minimal seating capacity");
        }
    }
}
