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
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)  arr[i] = n - sc.nextInt();
		for(int i=0;i<n;i++)
		{
		   
		    for(int j=0;j<n;j++)
		    {
		        if(i==arr[j])
		        {
		            System.out.print("*");
		            arr[j]++;
		        }
		        else{
		            System.out.print("-");
		        }
		    }
		    System.out.println();
		}
	}
}
