/*

Odd One Out

The program must accept an array of size N as input and it must print the position as the
output in which the value differs from the other values in the evenness in the array.
Boundary Condition(s):
3 <= N <= 100
Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).

Example Input/Output 1:
Input:
5
1 4 3 7 11
Output:
2
Explanation:
Here 1, 3, 7 and 11 are odd numbers. Whereas 4 is an even number. So, it is the odd one
among the array elements and the position of 4 is 2. Hence, 2 is printed as the output.

Example Input/Output 2:
Input:
3
4 6 9
Output:
3

*/

import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id1=-1, id2=-1, evencount=0, oddcount=0;
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            if(k%2==0)
            {
                id1=i;
                evencount++;
            }
            else 
            {
                id2=i;
                oddcount++;
            }
        }
        
        if(evencount==1) System.out.print(id1+1);
        else System.out.print(id2+1);
    }
}
