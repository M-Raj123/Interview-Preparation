/*

link: https://www.codechef.com/problems/TABLET

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Tablet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0)
		{
		    int m = sc.nextInt();
		    int budget = sc.nextInt();
		    int max = 0;
		    
		    for(int i=0;i<m;i++)
		    {
		        int wt = sc.nextInt();
		        int ht = sc.nextInt();
		        int price = sc.nextInt();
		        int size = wt*ht;
		        
		        if(budget<price)
		        {
		            size = 0;    
		        }
		        else{
		            if(max<size)
		            {
		                max = size;
		            }
		        }    
		    }
		    if(max==0)
		    {
		        System.out.println("no tablet");
		    }else System.out.println(max);
		    
		}
	}
}
