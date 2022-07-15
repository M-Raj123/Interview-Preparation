/*
A series of N gold pot is found by a man. He starts picking the gold coins from the first pot. 
He moves forward by the unit digit value of the count of gold coins in the current pot and picks up the next pot. 
This is continued until there are no more pots at the unit digit position from the current pot.
The number of gold coins in each pot is given as input. The program must print the total gold coins collected.

input:		
        5
        91 42 72 194 32
output:
        327
        explanation:  order - 91 42 194 
		

*/

import  java.util.*;
public class Main
{
	public static void main(String[] args) 
  {  
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int i=0,sum=0;
        while(i<n)
        {
            sum+= arr[i];
            int rem = arr[i]%10;
            i+=rem;
        }
		 System.out.println(sum);
	}
}
