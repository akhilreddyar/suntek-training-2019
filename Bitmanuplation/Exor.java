import java.util.*;
class Exor
{
	public static void main(String args[])
	{
		int n,q,i,f,l,x;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		a[i]=s.nextInt();
		q=s.nextInt();
		int[] b=new int[q];
		while(q>0)
		{
			x=0;
			f=s.nextInt();
			l=s.nextInt();
			for(i=f;i<=l;i++)
			x=x^a[i];
			System.out.print(x+" ");
			q--;
		}
	}
