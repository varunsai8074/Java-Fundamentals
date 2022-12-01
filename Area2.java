import java.util.*;
public class Area
{
    public static void main(String args[])
    {
        double pi=3.14;
        Scanner sc = new Scanner(System.in);
        calc c = new calc();
        int squ = sc.nextInt();
        int len = sc.nextInt();
        int bre = sc.nextInt();
        float rad = sc.nextFloat();
        c.culate(squ,len,bre,rad,pi);
    }
}

class calc
{
    void culate(int squ,int len,int bre,float rad,double pi)
    {
        int square = squ * squ;
        int Arearec = len * bre;
        
        System.out.println(square);
        System.out.println(Arearec);
        System.out.printf("%.2f",(pi * rad * rad));
    }
}

