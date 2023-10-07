/*

Sum of inverted pow of 2

input  :  4  , 10 
output : -4  , 25

explanation : 1,2,3,4  -> (powOf2)1,2,4
              -1-2+3+-4 => Tot = -4

*/
import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
  		Scanner sc = new Scanner(System.in);
  		int n = sc.nextInt();
  		int Sum=0;
  		for(int i=1;i<=n;i++)
  		{
  		    if( (i&(i-1)) == 0)
  		    {
  		        Sum += (-1*i);
  		    }
  		    else Sum += i;
  		  
  		}
  		System.out.print(Sum);
	}
}
