import java.util.*;
class Varun
{
    
    public static int marks(int rno)
    {
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int tot = sub1+sub2;
        System.out.println("Roll Number Is:"+rno);
        System.out.println("Subject 1:"+sub1);
        System.out.println("Subject 1:"+sub2);
        return tot;
    }
    
}

public class Student extends Varun
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Varun v = new Varun();
        int rno = sc.nextInt();
        System. out.println("Total:"+v.marks(rno));
    }
}
