/*
Odd and Even Integers

The program must accept three integers X, Y and Z as the input. The program must print
the output based on the following conditions.
- If X is less than Y, then print all the odd integers from X to Y (inclusive). Else print all the
even integers from Y to X (inclusive).
- If Y is less than Z, then print all the odd integers from Y to Z (inclusive). Else print all the
even integers from Z to Y (inclusive).
Boundary Condition(s):
2 <= X, Y, Z <= 999
Input Format:
The first line contains the values of X, Y and Z each separated by a space.
Output Format:
The first line contains the odd and even integers separated by space(s).

Example Input/Output 1:
Input:
20 25 10
Output:
21 23 25 10 12 14 16 18 20 22 24
Explanation:
For the first and the second integer 20 < 25. Hence all the odd integers from 20 to 25 (21
23 25) are printed as the output.
Then for the second and the third integer 25 > 10. Hence all the even integers from 10
to 25 (10 12 14 16 18 20 22 24) are printed as the output.

Example Input/Output 2:
Input:
10 15 20
Output:
11 13 15 15 17 19

*/

import java.util.*;
public class Hello {
    public static void odd(int x,int y)
    {
        for(int i=x;i<=y;i++)
        {
            if(i%2!=0)  System.out.print(i+" ");
        }
    }
    public static void even(int x,int y)
    {
        for(int i=x;i<=y;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt(), z=sc.nextInt();
		
		if(x<y)
		{
		       odd(x,y);
		       if(y<z) odd(y,z);
		       else even(z,y);
		}
		else
		{
		    even(y,x);
		    if(y<z) odd(y,z);
		    else even(z,y);
		}
		
    }
}
