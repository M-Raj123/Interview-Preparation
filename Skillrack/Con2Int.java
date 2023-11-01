/* 

Largest Possible - concatenate Two Integers 

input  : 100  5  10
output : 10100

*/


import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[3];
        for(int i=0;i<3;i++)
        {
            arr[i] = sc.next();
        }
        
        String k1 = "", k2 ="";
        Stack<Long> st = new Stack<>();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i!=j)
                {
                     k1 = arr[i]+arr[j];
                     k2 = arr[j]+arr[i];
                    long s1 = Long.parseLong(k1);
                    long s2 = Long.parseLong(k2);
                    // System.out.println(s1+" "+s2);
                    st.push(s1);
                    st.push(s2);
                }
            }
        }
         
        long max = 0;
        while(!st.isEmpty())
        {
            // System.out.println(st.peek());
            if(st.peek()>max)
            {
                max = st.peek();
            }
            st.pop();
        }
        
        System.out.print(max);
	  }
}
