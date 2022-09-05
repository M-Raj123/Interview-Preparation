/*

Maximum Sum Value

The program must accept an array of positive integers of size N as the input. The
program must print the maximum sum of the increasing order of the integers in the
given array as the output.
Boundary Condition(s):
3 <= N <= 999

Input Format:
The first line contains the value of N.
The second line contains the N integers separated by space(s).
Output Format:
The first line contains the maximum sum of the increasing order of the integers.

Example Input/Output 1:
Input:
7
1 2 1 7 10 9 5
Output:
18
Explanation:
The increasing order of integers in the array are
1 2 (sum is 3)
1 7 10 (sum is 18)
18 is the maximum sum between the two sum values.
Hence, 18 is printed as the output.

Example Input/Output 2:
Input:
5
1 5 6 8 9
Outp


*/
import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  tmx=0,mx=0,sum=0;
		
		for(int i=0;i<n;i++)
		{
		
		    int k = sc.nextInt();
		    if(mx<k)
		    {
		        sum+=k;
		        mx=k;
		    }
		    else 
		    {
		        mx=k;
		        sum=k;
		    }
	
		    if(tmx<sum) tmx=sum;
		}

		System.out.print(tmx);
	}
}
