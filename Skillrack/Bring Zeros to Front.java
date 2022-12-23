/*

Bring Zeros to Front

The program must accept an integer array of size N containing only 0's and 1's as the
input. The program must bring all the zeros to the front and all the ones to the end of
the array. Then the program must print the modified array as the output.
Boundary Condition(s):
1 <= N <= 1000
0 <= Array Element Value <= 1
Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains N integers of the modified array separated by a space.

Example Input/Outupt 1:
Input:
7
0 1 1 0 1 0 0
Output:
0 0 0 0 1 1 1
Explanation:
There are 4 zeros and 3 ones in the input.
So print all the zeros at the beginning and all the ones at the end.
Hence the output is 0 0 0 0 1 1 1

Example Input/Outupt 2:
Input:
4
1 1 1 0
Output:
0 1 1 1

*/

import java.util.*;
public class Main 
{  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        
        for(int i=0;i<n;i++)
        {
            int k = sc.nextInt();
            if(k==0)
            {
                sum+=1;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(i<sum)
            {
                System.out.print(0+" ");
            }
            else System.out.print(1+" ");
        }
	  }
}

