/*
Problem Statement 
Link : https://www.codechef.com/problems/TODOLIST 
*/

import java.util.*;
import java.lang.*;
class Todolist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int k = sc.nextInt();
		    int ct = 0;
		    for(int j=0;j<k;j++) 
		    {
		        if(sc.nextInt()>=1000) ct++; 
		    }
		    System.out.println(ct);
		}
	}
}
