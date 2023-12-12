/*

Sum Of N Modified Integer

input  : 4
         5 2 8 7 
output : 68
explanation : if n odd *4 and n even*2 then total sum

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
  		Scanner sc = new Scanner(System.in);
  		int n = sc.nextInt(), sum = 0;
  		for(int i=0;i<n;i++)
  		{
  		    int k = sc.nextInt();
  		    
  		    if( (k&1) == 0)
  		    {
  		        sum += k*2;
  		    }
  		    else sum += k*4;
  		}
  		System.out.print(sum);
	  }
}
