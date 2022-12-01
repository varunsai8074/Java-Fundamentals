import java.util.*;
public class singletomulti
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int j;
        System.out.print("[");
        for(int i=0 ; i<x ;i++)
        {
            System.out.print("[");
            for(j=0;j<y;j++)
            {
                System.out.printf("%d ",j*i);
            }
            {
                    if(j < y-1 && j !=y)
                    {
                        System.out.print("],");
                    }
                }
            
        }
        System.out.print("]]");
    }
}
