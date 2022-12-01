import java.util.*;
public class Count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n =  sc.nextInt();
        int arr[] = new int[n];
        
        int odd=0,even=0;
        for(int i = 0;i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n; i++)
        {
            if(arr[i]%2 == 0)
            {
                even +=1;
            }
            else if(arr[i]%2 !=0)
            {
                odd += 1;
            }
        }
        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);
    }
}
