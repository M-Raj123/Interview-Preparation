/* Parenthesis Checker 

input  : (A*B{D+G}) , (32{15/3}-1[2/4]
output : Valid      , Invalid 
 
*/

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisCheck 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        Stack<Character> store = new Stack<Character>();
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch=='[' || ch=='{' || ch=='(')
            {
                store.push(ch);
            }
            else
            {
                if( ')'==ch && store.peek()=='(' )
                {
                    store.pop();
                }
                else if( '}'==ch && store.peek()=='{' )
                {
                    store.pop();
                }
                else if( ']'==ch && store.peek()=='[' )
                {
                    store.pop();
                }
            }    
        }

        if(store.isEmpty()==true)
        {
            System.out.println("valid");
        }
        else System.out.println("Invalid");

    }
}
