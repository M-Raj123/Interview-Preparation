/*  BAR GRAPH PATTERN

input : 3
        2 1 3
output: 
        --*
        *-*
        ***

*/


import java.util.*;
public class Hello {
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),mx=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		       arr[i] = sc.nextInt();
		       if(mx<arr[i]) mx = arr[i];
		}
		System.out.println(mx);
		for(int i=0;i<n;i++) arr[i] = mx - arr[i] ;
		for(int i=0;i<mx;i++)
		{

		    for(int j=0;j<n;j++)
		    {
			if(i>=arr[j])
			{
			    System.out.print("*");
			}
			else{
			    System.out.print("-");
			}
		    }
		    System.out.println();
		}

     }
}
