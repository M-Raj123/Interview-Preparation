/*

input:
1) 5
   959646672 544814198 526566015 71285331 598788243
2) 10
   123456789 234567890 134567890 124567890 123567890 123467890 123457890 123456890 123456790 123456780

output: 
1)  1  5 is common digit 

2)  0  no common digit

*/

import java.util.*;
public class Hello {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] arr = new String[n];
    for(int i=0;i<n;i++)  arr[i]=sc.next();

    int[] a = new int[10];
    for(int i=0;i<n;i++)
    {
        int len = arr[i].length();
        int flag[] = new int[10];
        for(int j=0;j<len;j++)
        {
            int k = arr[i].charAt(j)-'0';
            if(a[k]==i+1 )
            {
                continue;
            }
            else{
                if(flag[k]==0)
                {
                    a[k]++;
                    flag[k]=1;
                }
            }
        }
    }

    // System.out.println(Arrays.toString(a));
    
    int ct=0;
    for(int i=0;i<10;i++)
    {
        if(a[i]==n) ct++;
    }
    
    System.out.print(ct);

    }
}
