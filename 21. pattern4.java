/*

5 5 5 5 5 
 4 4 4 4
  3 3 3 
   2 2
    1

*/



import java.util.Scanner;
class Prg21
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int row,col,N,num;
		System.out.println("enter the value of n");
		N=in.nextInt();
		num=N;
		for(row=N;row>0;row--)
		{
			for(int i=1;i<=N-row;i++)
			{
				System.out.print(" ");
			}
			for(col=row;col>0;col--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
			num--;
		}
	}
}