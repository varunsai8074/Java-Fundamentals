import  java.util.*;
public class transpose
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int  j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose matrix is :");
        for(int i=0;i<n;i++)
        {
            for(int  j=0;j<n;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
