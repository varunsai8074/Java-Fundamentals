import java.util.*;
public class Discount
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        float i1 = sc.nextFloat();
        float i2 = sc.nextFloat();
        float d = sc.nextFloat();
        float tot = i1+i2;
        float dis = (tot/100)*d;
        float sav = tot - dis;
        System.out.printf("%.2f\n%.2f\n%.2f",tot,sav,dis);
    }
}
