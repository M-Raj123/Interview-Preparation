/*    

Equal number of 1's Binary Representation

       x  y  n
input: 2 10 3  

output:3 5 6 9 10 
explanation : 3 --> 011    1's count --> 2   

*/


import java.util.*;
public class Main {
    public static int fun(int k )
    {
        int count=0;
        while(k>0)
        {
            int rem = k%2;
            if(rem==1)
            {
                count++;
            }
            k/=2;
        }
        return count;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
		
		int fix = fun(n), flag=0 ;
		for(int i=x;i<=y;i++)
		{
		    if(fix==fun(i))
		    {
		        flag=1;
		        System.out.print(i+" ");
		    }
		}
		if(flag==0) System.out.print("-1");
	}
}
