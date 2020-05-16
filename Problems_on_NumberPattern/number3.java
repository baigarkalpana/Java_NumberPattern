/* 
 * Author:Kalpana Baigar
 * 
 *Program to printing following Number Pattern using Inheritance
 *
 * 01010
 * 01010
 * 01010
 * 01010
 * 01010
 * 
 * */

import java.util.Scanner;
import java.util.*;
import java.util.Timer;

class pattern
{
	
	
	void display()
	{	
		System.out.println("enter Size");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
			for(int i=1;i<=size;i++)
			{
			   for(int j=1;j<=size;j++)
			   {
				   if(j%2==0)
				   {
					   System.out.print("1");
				   }
				   else
				   {
					   System.out.print("0");
				   }
			   }
			   System.out.println();
			}
	
	}
}



class Number extends pattern
{
	public static void main(String args[])
	{
	 
		
		Number n=new Number();
		n.display();
		
	}	
}