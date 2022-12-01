import java.util.*;
import java.io.*;
public class Assessment1
{
    public static void main(String args[])
    {
        int t,tt,ttt,W,A=75,C=50,k,m;
        Scanner sc = new Scanner(System.in);
        W = sc.nextInt();
        k = sc.nextInt();
        m = sc.nextInt();
        t = k*A ;
        tt = C*m;
        ttt = tt + t;
        if(W==125)
        {
            System.out.println("Boat is stable");
        }
        else if(W <= ttt)
        {
            System.out.println("Boat is unstable");
        }
        else if(W > ttt)
        {
            System.out.println("Boat is stable");
        }
        else if(W==125)
        {
            System.out.println("Boat is stable");
        }
    }
}
