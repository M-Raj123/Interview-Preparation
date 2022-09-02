
/*

Horizontal and Vertical Zig - Zag

The program must accept an integer N as the input. The program must print the desired
pattern as shown in the Example Input/Output section.
Boundary Condition(s):
1 <= N <= 100
Input Format:
The first line contains the value of N.
Output Format:
The first N lines contain the desired pattern as shown in the Example Input/Output
section.

Example Input/Output 1:
Input:
5
Output:
1 2 3 4 5
2 9 8 7 6
3 8 10 11 12
4 7 11 14 13
5 6 12 13 15

Example Input/Output 2:
Input:
8
Output:
1 2 3 4 5 6 7 8
2 15 14 13 12 11 10 9
3 14 16 17 18 19 20 21
4 13 17 26 25 24 23 22
5 12 18 25 27 28 29 30
6 11 19 24 28 33 32 31
7 10 20 23 29 32 34 35
8 9 21 22 30 31 35 36



*/


import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[][] = new int[n][n];
	    int sum=0;
	    for(int i=0;i<n;i++)
	    {
	       if(i%2==0) 
	       {
	           arr[i][i] = sum+1;
	           sum = arr[i][i];
	       }
	       else 
	       {
	           sum = sum + (n-i)+((n-i));
	           arr[i][i] = sum;
	       }
	       
	       int val = arr[i][i];
	       if(i%2==0)
	       {
	            int v1 = arr[i][i];
	            int v2 = arr[i][i];
    	       for(int p=i;p<n;p++)
    	       {
    	            arr[i][p] = v1++;      
    	       }
    	       for(int q=i;q<n;q++)
    	       {
    	            arr[q][i] = v2++;   
    	       }
	       }
	       else 
	       {
	           int d1 = arr[i][i];
	           int d2 = arr[i][i];
	           for(int a = i;a<n;a++)
	           {
	               arr[i][a] = d1--;
	           }
	           for(int b=i;b<n;b++)
	           {
	                arr[b][i] = d2--;     
	           }
	       }
	    }
	    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
