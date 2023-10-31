/*

Replace Last with First

input  : Nice to meet you
output : Nict tm meey yoN

input  : tit for tat
output : tif fot tat

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = 0, flag = 0;
        char c1 = s.charAt(0);
        while(k<s.length())
        {
           if( k+1<s.length() && s.charAt(k)!=' ' && s.charAt(k+1)==' ')
           {
               System.out.print(s.charAt(k+2));
               // System.out.print(" ");
               flag=1;
           }
           else
           {
               if(k==s.length()-1 && flag==1)
               {
                   System.out.print(c1);
               }
               else System.out.print(s.charAt(k));
           }
           
           k++;
        }    
	  }
}
