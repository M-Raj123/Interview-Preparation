/*
Problem Statement link:
https://www.codechef.com/problems/CNDY
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Candies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		long m = sc.nextLong();
		while(m-- > 0)
		{
		    int n = sc.nextInt();
		    int flag=0;
		    int arr[] = new int[2*n];
		    for(int i=0;i<2*n;i++) arr[i] = sc.nextInt();
		    HashMap<Integer,Integer> hp = new HashMap<>();
		    for(int i=0;i<(2*n);i++) 
		    {
		        if(hp.containsKey(arr[i])==true)
		        {
		            hp.put(arr[i],hp.get(arr[i])+1);
		            if(hp.get(arr[i])>2)
		            {
		                flag=1;
		                break;
		            }
		        }
		        else hp.put(arr[i],1);
		    }
		    if(flag==1) System.out.println("No");
		    else System.out.println("Yes");
		    
		}
	}
}
