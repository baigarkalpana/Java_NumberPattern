/* 
 * Author:Kalpana Baigar
 * 
 *Program to printing following Number Pattern
 *
 * 11111
 * 11111
 * 11111
 * 11111
 * 11111
 * 
 * */

import java.util.Scanner;

public class number
{
	
	public static void main(String args[])
	{
		System.out.println("Enter size");
		Scanner sobj=new Scanner(System.in);
		int num=sobj.nextInt();
		
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print("1");
				
			}
			System.out.println();
			//System.out.println("\n");
			//System.out.print("\n");
			//System.out.println(System.lineSeparator());
		}
		
		
		
		
		
	}
	
	

}
