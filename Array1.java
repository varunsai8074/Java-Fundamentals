import java.util.Scanner;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        System.out.println("Enter 10 numbers");
         System.out.println("List of even numbers");
        for(int i=0;i<10;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

}
