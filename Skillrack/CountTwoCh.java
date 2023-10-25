/*

Count of Last Two Character

input  : hiabchi ,  MOOONOO
output : 2       ,  3

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
  		Scanner sc = new Scanner(System.in);
  		
  		String str = sc.next();
  		int len = str.length();
  		char c1 = str.charAt(len-2), c2 = str.charAt(len-1);
  		int ct =1;
          for(int i=0;i<len-2;i++)
          {
              if(c1 ==str.charAt(i) && c2==str.charAt(i+1))
              {
                  ct+=1;
              }
          }
          
       System.out.print(ct);
	  }
}
