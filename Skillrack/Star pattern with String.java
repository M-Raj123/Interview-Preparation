/*

Star pattern with String

The program must accept a string S as the input. The program must print the pattern as
shown in the Example Input/Output section.
Boundary Condition:
3 <= Length of S <= 101

Input Format:
The first line contains the string S.
Output Format:
The list of lines contain the pattern as shown in the Example Input/Output section.

Example Input/Output 1:
Input:
omega
Output:
a*o*a
*gmg*
omega
*mgm*
o*a*o

Example Input/Output 2:
Input:
killer
Output:
r**k*r
*e*ie*
**ll**
killer
*i*ei*
k**r*k

*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String k = sc.next();
	    int n = k.length(),mid = n/2;
	    int r=n-1,p=0;
	    
	    char arr[][] = new char[n][n];
	    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++) arr[i][j]='*';
	    }
	    
	    System.out.println(mid);
	    for(int i=0;i<n;i++)
	    {
	        arr[mid][i] =  k.charAt(p);
	        arr[i][mid] =  k.charAt(p);
	        p++;
	    }
	    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(i==j || j==n-i-1)
	            {
	                arr[i][j] = k.charAt(r);
	            }
	        }
	        r--;
	    }
	    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            System.out.print(arr[i][j]);
	        }
	        System.out.println();
	    }
	}
}
