import java.util.*;
public class Add
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int k =0,l=0,t=0;
        for(int  i= 0; i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int  j= 0; j<n;j++)
        {
            b[j] = sc.nextInt();
        }
        for(int  i= 0; i<n;i++)
        {
            for(int  j= 0; j<=i;j++)
            {
                k = a[i];
                l = b[j];
            }
            t = k + l;
            System.out.print(t+" ");
        }
    }
}
