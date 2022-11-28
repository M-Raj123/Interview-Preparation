/*

Vowel - Palindrome
remove consonants 
check remaining String Palindrome or Not
if remaining String not formed then Print -1

*/

import java.util.Scanner;
public class Main {

    public static String check(String k)
    {
        int i = 0, j = k.length()-1;
        while(i<j)
        {
            if(k.charAt(i)!=k.charAt(j))
            {
                return "NO";
            }
            i++;
            j--;
        }
        return "YES";
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String  k = sc.next();
        String temp = "";
        for(int i = 0 ; i<k.length();i++)
        {
            char ch = k.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                temp+=ch;
            }
        }
        
        if(temp.length()==0)
        {
            System.out.print(-1);
        }
        else 
        {
            System.out.print(check(temp));
        }
	}
}
