/*

Maximum Sum - Same Unit Digit

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            int k = num%10;
            if(mp.containsKey(k))
            {
                mp.put(k,mp.get(k)+num);
            }
            else mp.put(k,num);
        }
        
        // System.out.print(mp);
        
        int max =0;
        for(int l:mp.values())
        {
            if(max<l)
            {
                max = l;
            }
        }
        System.out.print(max);
	}
	
}
