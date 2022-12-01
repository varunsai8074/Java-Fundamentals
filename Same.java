import java.util.*;
public class Same
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int eq = 0;
        int ar[] = new int[n];
        int arr[] = new int[m];
        if(n != m)
        {
            System.out.println("Not Same");
        }
        for(int i = 0 ;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }
        for(int j = 0 ; j<m; j++)
        {
            arr[j] = sc.nextInt();
        }
        for(int i = 0 ;i<n;i++)
        {
           for(int j = 0 ; j<m;j++)
           {
               if(ar[i] == arr[j])
               {
                   eq +=1;
               }
           }
        }
        if(eq == 0 )
        {
            System.out.println("Not Same");
        }
        else if(eq < n && eq < m)
        {
            System.out.println("Not Same");
        }
        else if(eq == n && eq !=0 )
        {
            System.out.println("Same");
        }
        
    }
}

