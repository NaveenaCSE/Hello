package Logical1;

import java.util.Scanner;

public class Vowel_Or_Consonant
{
 public static void main(String[] args)
 {
	 Scanner s=new Scanner(System.in);
	 String ch=s.next();
	 char[] c=new char[]{'a','e','i','o','u','A','E','I','O','U'};
	 int n=0;
	 for(int i=0;i<c.length;i++)
	 {
		 char c1=ch.charAt(0);
		 if(c1==c[i])
		 {
			 n++;
		 }
	 }
	 if(n==1)
		 {
		 System.out.println("Vowel");
		 }
	 else
	 {
		 System.out.println("Consonant");
	 }
	 s.close();
 }
}
