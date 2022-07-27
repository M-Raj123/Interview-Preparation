/*

// same Character in zigzag matrix

input: 5
a b c d e
f g h i j
k l m n o
j i h g f
e d c b a

output:
a c h m  if(no char) print -1 ;


*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char arr[][] = new char[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++) arr[i][j] = sc.next().charAt(0);
		}
		
		String t1="",t2="";
		for(int i=0;i<n;i++)
		{
		    if(i%2==0)
		    {
    		    for(int j=0;j<n;j++)
    		    {
    		        t1+=arr[i][j];
    		        t2+=arr[n-i-1][n-j-1];
    		    }
		    }
    		else
    		{
    		    for(int j=n-1;j>=0;j--)
    		    {
    		        t1+=arr[i][j];
    		        t2+=arr[n-i-1][n-j-1];
    		    }
    		}
		    
		}
		
		System.out.println(t1);
		System.out.println(t2);
		
		int count=0, k = n*n;
		if(k%2!=0) k = (k/2)+1;
		else k = k/2;
		
		for(int i=0;i<k;i++)
		{
		    if(t1.charAt(i)==t2.charAt(i))
		    {
		        count++;
		        System.out.print((t1.charAt(i))+" ");
		    }
		}
		if(count==0) System.out.print(-1);
		
    }
}
