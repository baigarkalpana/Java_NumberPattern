/* 
 * Author:Kalpana Baigar
 * 
 *Program to printing following Number Pattern using interface
 *
 * 11111
 * 00000
 * 11111
 * 00000
 * 11111
 * 
 * */

import java.util.Scanner;

interface pattern
{
  void display();	
}

public class Number implements pattern 
{
	void display(int num)
	{
		int i,j;
		for(i=0;i<num;i++)
		{
			for(j=0;j<num;j++)
			{
				if(i%2==0)
				{
				 System.out.print("0");
				} 
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Enter size");
		Scanner sobj=new Scanner(System.in);
		int num=sobj.nextInt();
		
		Number nobj=new Number();
		nobj.display(num);
		
		
		
		
		
	}
	
	

}
