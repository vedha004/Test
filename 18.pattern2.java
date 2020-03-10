/*

A
AA
AAA
AAAA
AAAAA

*/





import java.util.Scanner;
class Prg18
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int row,col,N;
		System.out.println("enter the value of n");
		N=in.nextInt();
		char ch='A';
		for(row=1;row<=N;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}