/*

Anagram

Given two strings S1 and S2 as input containing only alphabets, the program must print
YES if S1 is an anagram of S2. Else the program must print NO.
Note: Two words are anagram of one another if their letters can be rearranged to form
the other word.
Boundary Condition(s):
1 <= Length of S1 <= 1000
1 <= Length of S2 <= 1000
Input Format:
The first line contains the string S1.
The second line contains the string S2.
Output Format:
The first line contains the string YES or NO.

Example Input/Output 1:

Input:
stool
tools

Output:
YES
Explanation :
All the characters in the string S1 are present in the string S2.

Example Input/Output 2:

Input:
state
tasty

Output:
NO
Explanation : The character 'e' in string

*/
import java.util.*;
public class Hello {
    public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
        int arr[] = new int[26], flag=0;
        String s1 = sc.next(), s2 = sc.next();
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            arr[c-'a']++;
        }
        
        for(int i=0;i<s2.length();i++)
        {
            char c = s2.charAt(i);
            arr[c-'a']--;
        }
        
        for(int k:arr)
        {
            if(k!=0) 
            {
                flag=1;
                System.out.print("NO");
                break;
            }
        }
        if(flag!=1) System.out.print("YES");
	}
}
