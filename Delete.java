import java.util.*;
public class Delete
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int arr[] = new int[100];
        int count = 0;
        for(int i = 1;i<=n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        
        int del = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(del!=arr[i])
            {
                count++;
            }
        }
        if(count == n)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            for(int i = 1;i<=n;i++)
            {
           
                if(arr[i] != del)
                {
                    System.out.println(arr[i]);
                }
                else if(arr[i] == del)
                {
                    continue;
                }
                    
            }   
        }
    }
}
