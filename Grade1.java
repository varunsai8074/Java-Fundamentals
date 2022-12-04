import java.util.*;
public class Grade1 extends grade
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       grade g = new grade();
       System.out.println("Enter student's basic information:");
       System.out.println("Name: ");
       String name = sc.next();
       System.out.println("Age: ");
       int age  = sc.nextInt();
       System.out.println("Gender");
       char gen = sc.next().charAt(0);
       System.out.println("Enter student's result information: ");
       System.out.println("Total Marks : ");
       int tm = sc.nextInt();
       System.out.println("Grade: ");
       char gra = sc.next().charAt(0);
       per =96;
       g.varun(name,age,gen,tm,per,gra);
       
       
    }
}
class grade
{
    public static void varun(String name,int age,char gen,int tm,int per,char gra)
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gen);
        System.out.println("Total Marks: "+tm);
        System.out.println("Percentage: "+per);
        System.out.println("Grade: "+gra);
    }
}
