import java.util.*;
public class Isomorphic_Strings
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        if(s1.length()!=s2.length())
        {
            System.out.println("NO");
        }
        else
        {
            int flag=0;
            for(int i=0;i<s1.length();i++)
            {
                int c1 = s1.charAt(i);
                int c2 = s2.charAt(i);
                arr1[c1]++;
                arr2[c2]++;
                if(arr1[c1]!=arr2[c2])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)  System.out.println("NO");
            else  System.out.println("YES");
        }
    }
}
// sample1:
// input:  s1=paper ; s2=title
// output: YES
