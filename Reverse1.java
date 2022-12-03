import java.io.*;
import java.util.Scanner;

class Reverse {
public static void main (String[] args) {
Scanner sc= new Scanner(System.in);
String str = sc.nextLine();
String nstr="";
char ch;
for (int i=str.length()-1;i>=0;i--)
{
	nstr = nstr+str.charAt(i);
}
System.out.println(nstr);
}
}


