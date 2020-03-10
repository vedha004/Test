/*

     *
   * * *
  * * * * *
 * * * * * * * 
* * * * * * * * * 

*/


import java.util.Scanner;
class Prg22
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int row,col,N,num;
		System.out.println("enter the value of n");
		N=in.nextInt();
		System.out.print(" ");
		for(row=1;row<=N;row++)
		{
			for(int i=1;i<=(N-row);i++)
			{
				System.out.print(" ");
			}
			for(col=1;col<=row+(row-1);col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}