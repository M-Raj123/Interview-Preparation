/*

Repeat First Last X

input: 10 5
input: 10 -5

output : 1 1 2 2 3 3 4 4 5 5 6 7 8 9 10
output : 1 2 3 4 5 6 6 7 7 8 8 9 9 10 10

*/

import java.util.*;
public class Hello 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        if(x>0)
        {
            
            for(int i=1;i<=x;i++)
            {
                System.out.print(i+" "+i+" ");
            }
            for(int i=x+1;i<=n;i++)
            {
                System.out.print(i+" ");
            }
        }
        else
        {
            for(int i=1;i<=n-(-1*x);i++)
            {
                System.out.print(i+" ");
            }
            for(int i=n-(-1*x)+1;i<=n;i++)
            {
                System.out.print(i+" "+i+" ");
            }
        }
	  }
}
