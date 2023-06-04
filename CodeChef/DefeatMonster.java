/*
Problem Statement Link:
https://www.codechef.com/DSAPREP_01/problems/MONSTER1
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0)
		{
		    int h=0,x=0,y=0,ctl=0;
		    h=sc.nextInt();
		    x=sc.nextInt();
		    y=sc.nextInt();
		    if(x<=y) 
		    {
		        ctl = 0;
		    }
		    else{
    		    ctl = 1;
		    }
		    if(ctl == 1) System.out.println("1");
		    else System.out.println("0");
		}
	}
}
