/*
link: https://www.codechef.com/problems/JERRYCHASE
Problem:
In a classic chase, Tom is running after Jerry as Jerry has eaten Tom's favourite food.
Jerry is running at a speed of X metres per second while Tom is chasing him at a speed of 
Y metres per second. Determine whether Tom will be able to catch Jerry.
Note that initially Jerry is not at the same position as Tom.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Chasing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
    		int jerry = sc.nextInt();
    		int tom   = sc.nextInt();
    		if(jerry<tom) System.out.println("YES");
    		else System.out.println("NO");
		}
	}
}
