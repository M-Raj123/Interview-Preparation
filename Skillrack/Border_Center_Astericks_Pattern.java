/*
input:3

output:

***
***
***

input:5

output:

*****
*123*
*4*6*
*789*
*****

*/
class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n = sc.nextInt();
		int mid = n/2,val=1;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if( (i>0 && j>0) && (j<n-1 && i<n-1) )
		        {
		            if( mid==i && mid==j)
		            {
		                System.out.print("*");
		                val++;
		            }
		            else
		            {
		                System.out.print(val++);
		            }
		        }
		        else
		        {
		            System.out.print("*");    
		        }
		        
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
