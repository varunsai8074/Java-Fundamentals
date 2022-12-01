import java.util.Scanner;
public class Triangle 
{
    public static void main(String args[])
    {
        int first,second,third;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for side1");
        first=sc.nextInt();
         System.out.println("Enter the value for side2");
        second=sc.nextInt();
         System.out.println("Enter the value for side3");
        third=sc.nextInt();
        if(((first+second)>third) && ((first+third)>second) && ((second+third)>first))
        {
            System.out.println("Sides form a triangle");
        }
        else if(first==0|| second==0||third==0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Sides does not form a Triangle");
        }
    }
}
