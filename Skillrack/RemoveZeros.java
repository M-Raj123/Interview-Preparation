/*

Removing - Leading Zeros

input  : 108004 , 1984 , 10000000000

output : 108004 , 1984 , 1000000
         8004     984    0
         8004     84     0
         4        4      0
         4               0
         4               0
                         0

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int st = 0, flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(st)!='0')
            {
                System.out.println(s.substring(st));
                st++;
                
            }
            else
            {
                int ct = 0 ;
                while(st<s.length() && s.charAt(st)=='0')
                {
                    if(st==s.length()-1 && s.charAt(st)=='0') flag=1;
                    st++;
                    ct+=1;
                }
                
                if(flag==1)
                {
                  for(int p=1;p<=ct;p++ ) 
                  {
                      System.out.println("0");
                  }
                }
                else
                {
                  for(int j=1;j<=ct;j++)
                  {
                      System.out.println(s.substring(st));
                  }
                }
                i=st-1;
                
            }
            
            // System.out.println("->");
        }
	  }
}
