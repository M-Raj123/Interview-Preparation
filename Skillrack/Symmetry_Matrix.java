/*

Find Symmetry 
if symmetry in Horizontal  then print H
if symmetry in Vertical    then print V
if symmetry in both        then print S
if nothing                 then print -1

input:  3 3       4 3
        1 0 1     1 0 1
        0 1 0     0 0 1
        1 0 1     0 0 1
                  1 0 1

output:  S        H

explanation 1: matrix symmetry in both Horizontal and Vertical  

*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(), c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        arr[i][j] = sc.nextInt();
		    }
		}
		int f1=0,f2=0;
		int mid = r/2;
		for(int i=0;i<mid;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        if(arr[i][j]!=arr[r-i-1][j])
		        {
		            f1=1; // horizontal;
		        }
		    }
		}
		int vmid = c/2;
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<vmid;j++)
		    {
		        if(arr[i][j]!=arr[i][c-j-1])
		        {
		            f2=1;   // vertical
		        }
		    }
		}
		
		if(f1==0 && f2==0)
		{
		    System.out.print("S");
		}
		else if(f1==0) System.out.print("H");
        else if(f2==0) System.out.print("V");
        else System.out.print("-1");
	}
}
