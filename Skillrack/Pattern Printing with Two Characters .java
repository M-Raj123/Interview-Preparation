/*
Pattern Printing with Two Characters

The program must accept an integer N and two characters as input. The program must
print the desired pattern as shown in the Example Input/Output section.

Boundary Condition(s):
1 <= N <= 50
Input Format:
The first line contains the value of N followed by a space and then the two
characters(without any space between the two characters).
Output Format:
The first N lines contain the desired pattern as shown in the Example Input/Output
section.

Example Input/Output 1:
Input:
5 $#
Output:
    $
   #$#
  $#$#$
 #$#$#$#
$#$#$#$#$

Example Input/Output 2:
Input:
6 @%
Output:
     @
    %@%
   @%@%@
  %@%@%@%
 @%@%@%@%@
%@%@%@%@%@%

*/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    String k = sc.next(), temp="";
    char c1 = k.charAt(0);
    char c2 = k.charAt(1);
    temp+=c1;
    int p = 0;
    for(int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i-1; j++)
	    {
	        System.out.print(" ");
	    }
	    System.out.println(temp);
	    if ((i + 1) % 2 == 0)
	    {
	        temp = c1 + temp;
	        temp += c1;
	    }
	    else
	    {
	        temp = c2 + temp;
	        temp += c2;
	    }
    }
  }
}
