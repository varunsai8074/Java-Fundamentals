import java.util.*;
public class Basicmath
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int tot=0;
        float mean=0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            tot= tot+arr[i];
        }
        mean = tot/n;
        System.out.printf("%.1f",mean);
    }
}
