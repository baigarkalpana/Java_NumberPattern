/* 
 * Author:Kalpana Baigar
 * 
 *Program to printing following Number Pattern using Method
 *
 * 12345
 * 12345
 * 12345
 * 12345
 * 12345
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
				
					System.out.print(j);
				
			}
			System.out.println();
		}
	}
}