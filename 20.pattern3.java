/*

1
01
1010
01010
1010101
01010101

*/
import java.util.Scanner;
class Prg20
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int row,col,N,num=0;
		System.out.println("enter the value of n");
		N=in.nextInt();
		for(row=1;row<=N;row++)
		{
			if(row%2==0)
			num=0;
			else
			num=1;
			for(col=1;col<=row;col++)
			{
				System.out.print(num);
				if(num==0)
				num=1;
				else
				num=0;
				
			}
			System.out.println();
		}
	}
}