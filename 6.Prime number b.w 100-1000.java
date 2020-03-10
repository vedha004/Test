class Prg6
{
	public static void main(String args[])
	{
		notprime:
		for(int i=100;i<=1000;i++)
		{
		 	for(int j=2;j<i/2;j++)
			{	
				if(i%j==0)
				{
					continue notprime;
				}
			}
		System.out.println("prime= "+i);
		}
	}
}