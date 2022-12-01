import java.util.*;
public class Culture
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int stu = sc.nextInt();
        int team = sc.nextInt();
        
        int et = stu%team;
        int lo = stu / team;
        System.out.println(lo+"\n"+et);
    }
}
