class Prg9
{
	public static void main(String args[])
	{
		int a,temp,sum=0,count=0,numsize=0,armsmul=1,digit,i=0,j=0;
		for(i=2;i<=1000000;i++)
		{
		count=i;
		while(count!=0)
		{
			numsize++;
			count=count/10;
		}
		temp=i;
		
		while(temp!=0)
		{
			digit=temp%10;
			while(j<numsize)
			{
				armsmul*=digit;
				j++;
			}
			sum+=armsmul;
			temp=temp/10;
			armsmul=1;
			j=0;
		}
		
		if(i==sum)
		System.out.println(i);
		sum=0;
		armsmul=1;
		numsize=0;
		}
	}
}