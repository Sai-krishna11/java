public class Ineuron {

	public static void main(String[] args) {
		int n=7;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==(n-1) || j == n/2)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1) || i==1&&j==1 || i==2&&j==2 ||i==3&&j==3 || i==4&&j==4 || i==5&&j==5)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==(n-1) || i==n/2 || j==0) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0|| i==(n-1) || j==n-1 ) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0|| i==0 || i==n/2 || i<n/2&&j==n-1 || i==(n-1)&&j==(n-1) || i==6&&j==6 || i==5&&j==5 || i==4&&j==4 ) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0|| i==0 || i==(n-1) || j==(n-1) ) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1) || i==1&&j==1 || i==2&&j==2 ||i==3&&j==3 || i==4&&j==4 || i==5&&j==5)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}
}