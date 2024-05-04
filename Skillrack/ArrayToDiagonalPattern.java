/*
Array To Diagonals Pattern

input : 5
125 5 10 788 99

output : 

125******99
***5**788**
****10*****
***5**788**
125******99

*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        String pat[] = new String[n];
        
        for(int i=0;i<n;i++)
        {
            int k = sc.nextInt(), count = 0;
            arr[i] = k;
            String star = "";
            while(k>0)
            {
                star +="*";
                k/=10;
            }
            
            pat[i] = star;
        }
        
        System.out.println(Arrays.toString(pat));
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || j==n-i-1)
                {
                    System.out.print(arr[j]);
                }
                else
                {
                    System.out.print(pat[j]);
                }
            }
            System.out.println();
        }
	}
}
