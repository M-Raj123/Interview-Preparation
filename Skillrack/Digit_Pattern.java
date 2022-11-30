/*

Digit pattern

input: 43105

output:

|****
|***
|*
|
|*****


*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        for(int i=0;i<k.length();i++)
        {
            int j = k.charAt(i)-'0';
            System.out.print("|");
            for(int p=0;p<j;p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
