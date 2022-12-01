import java.util.*;
public class Type
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n =  sc.nextInt();
        int arr[] = new int[n];
        
        int odd=0,even=0,mixed=0;
        for(int i = 0;i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n; i++)
        {
            if(arr[i]%2 == 0 && arr[i]%2 !=0 )
            {
                mixed+=1;
            }
            if(arr[i]%2 == 0)
            {
                even +=1;
            }
            else if(arr[i]%2 !=0)
            {
                odd += 1;
            }
        }
        if(even !=0 && odd != 0)
        {
            System.out.println("Mixed");
        }
        else if(even > 0)
        {
            System.out.println("Even");
        }
        else if(odd > 0)
        {
            System.out.println("Odd");
        }
    }
}
