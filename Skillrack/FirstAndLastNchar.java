/*

First And Last N Character

input : madoma
        2
output: yes

input : aadbdgfdabc
        3
output: no

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt(), count=0, len = str.length(), flag=0;
        while(count<n)
        {
            
            if(str.charAt(len-n+count)==str.charAt(count))
            {
                flag = 0;
            }
            else flag=1;
            count++;
        }
        
        if(flag==1) System.out.print("no");
        else System.out.print("yes");
	  }
}
