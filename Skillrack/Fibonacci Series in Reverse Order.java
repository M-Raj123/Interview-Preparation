/*

Fibonacci Series in Reverse Order

The program must accept an integer N as the input. The program must print the
fibonacci series in the reverse order as the output.
Boundary Condition(s):
5 <= N <= 85
Input Format:
The first line contains the value of N.
Output Format:
The first line contains the fibonacci series separated by a space.

Example Input/Output 1:
Input:
5
Output:
3 2 1 1 0

Example Input/Output 2:
Input:
12
Output:
89 55 34 21 13 8 5 3 2 1 1 0


*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		arr[n-1]=0;
		arr[n-2]=1;
		int q=n-1;
		for(int i=n-3;i>=0;i--)
		{
		    arr[i] = arr[q-1]+arr[q];
		    q--;
		}
		
		for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
	}
}
