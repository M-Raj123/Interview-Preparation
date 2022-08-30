/*
Street Numbers with Most Houses

N streets in a city are represented in N lines. A hyphen '-' represents a house and an
asterisk '*' represents an empty ground. The streets are numbered from 1 to N from top
to bottom. The program must print the street number having the most number of
houses. If more than one street has the same number of maximum houses then the
program must print the street numbers which has the maximum number of houses in
ascending order.

Boundary Condition(s):
1 <= N <= 1000
1 <= Length of each line <= 1000
Input Format:
The first line contains the value of N.
The next N lines contain one string in each line.
Output Format:
The first line contains the street numbers which has the maximum number of houses
separated by a space.

Example Input/Output 1:
Input:
6
-
--
----
--*-*
---*-
---
Output:
3 5

Explanation:
The street (line) numbers 3 and 5 has the maximum number of houses that is 4.

Example Input/Output 2:
Input:
5
----
--**
**-
-*--
****
Output:
1

*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m=n;
		int mx=0,ptr=0;
		int arr[] = new int[n];
		while(m-->0)
		{
		    String s =sc.next();
		    int ct=0;
		    for(int i=0;i<s.length();i++)
		    {
		        char ch = s.charAt(i);
		        if(ch=='-')
		        {
		            ct++;
		        }
		    }
		    
		    arr[ptr++] = ct;
		}
		
		for(int i=0;i<n;i++)
		{
		    if(mx<arr[i])
		    {
		        mx=arr[i];
		    }
		}
		
		for(int i=0;i<n;i++)
		{
		    if(mx==arr[i])
		    {
		        System.out.print((i+1)+" ");
		    }
		}
	}
}
