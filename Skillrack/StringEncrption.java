/*

String Encryption

Input must be valid encryption string

input  :  baabbb    ooopppssss
output :  bab       oops

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum=0;
        for(int i=1;sum<str.length();i++)
        {
            System.out.print(str.charAt(sum));
            sum=sum+i;
        }
	  }
}
