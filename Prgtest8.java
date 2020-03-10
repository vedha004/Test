import java.util.Scanner;
class Prgtest8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i<=n/2)
			{
				for(int j=0;j<(n/2)-i;j++)
				System.out.print(" ");
					if(i!=0)
					System.out.print("*");
					for(int j=0;j<i;j++)
					System.out.print(" ");
					System.out.print("*");
					System.out.println();
			}
			else
			{
				for(int j=0;j<(i-(n/2));j++)
				System.out.print(" ");
					System.out.print("*");
					for(int j=0;j<i-n/2;j++)
					System.out.print(" ");
					if(i!=n-1)
					System.out.print("*");
					System.out.println();
			}
		}
		
		
	}
}