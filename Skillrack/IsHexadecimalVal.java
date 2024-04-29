/* check valid hexadecimal value

input  : 7Cd , 12h
output : yes , no

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        int flag = 0;
        for(char ch : k.toCharArray())
        {
            if( ((ch >= 49) && (ch <= 58)) || (ch>96 && ch<=102) || (ch>64 && ch<71)) 
            {
                continue;
            }
            else 
            {
                flag = 1;
            }
        }
        
        if(flag==1) System.out.print("no");
        else System.out.print("yes");
	  }
}
