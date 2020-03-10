/*

*
**
***
****
*****
***
**
*

*/
import java.util.Scanner;
class Prg19
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int row,col,N;
		System.out.println("enter the value of n");
		N=in.nextInt();
		for(row=0;row<=2*N;row++)
		{	
			if(N>row)
			for(col=0;col<=row;col++)
			{
				System.out.print("*");
			}
			else
			for(col=1;col<((2*N)-(row+1));col++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}