package Logical1;

import java.util.Scanner;

public class PosNeg 
{
  public static void main(String[] args)
  {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	if(n>0)
	{
		System.out.println("Postive");
	}
	else if(n<0)
	{
		System.out.println("Negative");
	}
	else
	{
		System.out.println("Zero");
	}
  }
}
