/*
 FIRST AND LAST ODD DIGITS
 
 input : 4
         15 63 33 26
         
 output: 15 33
 */
import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k = sc.nextInt(),fst=k;
            int end = k%10;
            while(fst>9)
            {
                fst/=10;
            }
            if(fst%2==1 && end%2==1 ) 
            {
                System.out.print(k+" ");
            }
        }
	}
}
