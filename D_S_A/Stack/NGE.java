/* Next Greater Element in the given Array */

// Efficient Approach 
  
Time Complexity: O(N)

import java.util.*;
import java.util.Stack;

class NGE {
    public static void main(String[] args) {
        int arr[] = {600,400,5,32,5,801} ;
        int fin[] = new int[arr.length];
        Stack<Integer> stk= new Stack<>(); 
        stk.push(0);
        fin[arr.length-1] = -1;
        for(int i=1;i<arr.length;i++)
        {

            if(stk.isEmpty()==false && arr[stk.peek()]>=arr[i])
            {
                stk.push(i);
            }
            else{
                while(stk.isEmpty()!=true &&  arr[stk.peek()]<arr[i])
                {
                    int ind = stk.pop();
                    fin[ind] = arr[i];
                }
                stk.push(i);
            }
        }
        System.out.println(Arrays.toString(fin));
    }    
}

/* 

Naive Approach 
Time Complexity: O(N^2)

import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
		  boolean flag = false;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					System.out.println(arr[i] +" "+ arr[j]);
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
			    System.out.println(arr[i]+" "+ -1);
			}
		}
		System.out.print(arr[n-1] +" "+-1);
	}
}

*/
