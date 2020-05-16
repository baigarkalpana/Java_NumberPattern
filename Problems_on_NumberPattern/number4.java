/* 
 * Author:Kalpana Baigar
 * 
 *Program to printing following Number Pattern using Method
 *
 * 11111
 * 10001
 * 10001
 * 10001
 * 11111
 * 
 * */

import java.util.Scanner;
import java.util.*;



class Number 
{
	public static void main(String args[])
	{
	 
		System.out.println("Enter size");
		Scanner sobj=new Scanner(System.in);
		int size=sobj.nextInt();
		
		display(size);
		
	}	
	
	static void display(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(i==1 || j==1 || i==5 ||j==5)
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