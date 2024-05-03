/* Step Number 1 to N 

print number which have absolute difference between each digit should be 1 

input  : 12     , 5
output : 10 12  , -1 

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if(k<10) System.out.print(-1);
		else 
		{
		    for(int i=10;i<=k;i++)
		    {
		        int v = i, flag = 0;
		        Stack<Integer> st = new Stack<>();
		        while(v>0)
		        {
		            int rem = v%10;
		            if(st.isEmpty())
		            {
		               st.push(rem);
		            }
		            else
		            {
		                if(st.peek()==rem+1 || st.peek()==rem-1)
		                {
		                    st.push(rem);
		                }
		                else
		                {
		                    flag=1;
		                    break;
		                }
		            }
		            v/=10;
		        }
		        if(flag==0)
		        {
		            System.out.print(i+" ");
		        }
		    }
		}
	}
}
