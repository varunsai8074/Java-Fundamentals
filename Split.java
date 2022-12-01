import java.util.*;
public class Split
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int team  = s%t;
        int left = s/t;
        
        System.out.println("The number of students in each team is "+left+" and left out is "+team);
    }
}
