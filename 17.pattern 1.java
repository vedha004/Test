/*

*****
****
***
**
*

*/





import java.util.Scanner;
class Prg17
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int row,col,N;
		System.out.println("enter the value of n");
		N=in.nextInt();
		for(row=N;row>0;row--)
		{
			for(col=row;col>0;col--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}