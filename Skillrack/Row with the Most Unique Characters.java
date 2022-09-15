/*

Row with the Most Unique Characters

The program must accept a character matrix of size NxN as the input. The program must
print the position of the row which contains the most number of unique characters as
the output.
Note: If more than one row contains the most number of unique characters then print
the  position of the last occurring row with the most number of unique characters. 
Boundary Condition(s):
1 <= N <= 50
Input Format:
The first line contains the integer value of N.
The next N lines contain N characters each separated by a space.
Output Format:
The first line contains the position of the row with the most number of unique
characters. 

Example Input/Output 1:
Input:
5
a r g t e
e r t e w
o p p i o
l p k o k
q w e e w
Output:
1
Explanation:
The first row contains 5 unique characters.
The second row contains 3 unique characters.
The third row contains 3 unique characters.
The fourth row contains 3 unique characters.
The fifth row contains 1 unique character.
The first row contains the most number of unique characters.
Hence 1 is printed as the output

Example Input/Output 2:
3
& d f
a * c
@ d #
Output:
3
Explanation:
The first row contains 3 unique characters.
The second row also contains 3 unique characters.
The third row also contains 3 unique characters.
The third row is the last row with the most number of unique characters.
Hence 3 is printed as the output

*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),mx=0, ind=-1;
		for(int i=0;i<n;i++)
		{
		    int arr[] = new int[256];
		    int flag=0,uni=0;
		    for(int j=0;j<n;j++)
		    {
		        char ch = sc.next().charAt(0);
		        if(arr[ch]!=0)
		        {
		            arr[ch] += 1;
		        }
		        else
		        {
		            arr[ch] = 1;
		            uni+=1;
		        }
		    }
		    
		    if(mx<=uni)
		    {
		        ind=i;
		        mx = uni;
		    }
		    
		    
		}
		System.out.print(ind+1);
	}
}
