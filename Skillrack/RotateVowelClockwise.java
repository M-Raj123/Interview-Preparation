/*

Rotate Vowel in Clockwise

input  : national
output : natainol

*/

import java.util.*;
public class Hello 
{

    public static boolean check(char ch)
    {
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        char lt = '@';
        
        for(int i=0;i<k.length();i++)
        {
            if(check(k.charAt(i))==true)
            {
                lt=k.charAt(i);
            }
        }
        
        for(int i=0;i<k.length();i++)
        {
            if(check(k.charAt(i)))
            {
                System.out.print(lt);
                lt=k.charAt(i);
            }
            else
            {
                System.out.print(k.charAt(i));
            }
        }
	  }
}
