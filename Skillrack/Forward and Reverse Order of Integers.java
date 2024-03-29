/*

Forward and Reverse Order of Integers

The program must accept three integers X, Y and Z, where Y is the largest number. The
program must print the integers from the smallest integer to the second smallest integer
and from Y to the second smallest integer as the output.

Boundary Condition(s):
1 <= X, Y, Z <= 999
Input Format:
The first line contains the values of X, Y and Z separated by space(s).
Output Format:
The first line contains the integers separated by space(s).

Example Input/Output 1:
Input:
10 25 20
Output:
10 11 12 13 14 15 16 17 18 19 20 25 24 23 22 21 20
Explanation:
The smallest integer is 10, the second smallest integer is 20 and the largest integer is 25.
So the integers from 10 to 20 are printed (10 11 12 13 14 15 16 17 18 19 20).
Then the integers from 25 to 20 are printed (25 24 23 22 21 20).
Hence the output is 10 11 12 13 14 15 16 17 18 19 20 25 24 23 22 21 20

Example Input/Output 2:
Input:
20 25 10
Output:
10 11 12 13 14 15 16 17 18 19 20 25 24 23 22 21 20

*/
import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		if(x>z)
		{
		    int temp = x;  //   a = a+b;
		    x = z;         //   b = a-b;
		    z = temp;      //   a = a-b;
		}
		
		for(int i=x;i<=z;i++)
		{
		    System.out.print(i+" ");
		}
		for(int i=y;i>=z;i--)
		{
		    System.out.print(i+" ");
		}
		
	}
}
