/* String Alphabet position sum
String containing lowercase only 
a-1, b-2, c-3, and so on... till z-26
input - abca  output- sum: 7
input - azd   output- sum: 31
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();  
        int sum=0;             
        for(int i=0;i<k.length();i++)
        {
            sum+= k.charAt(i)-'a'+1;
        }
        System.out.print("sum:"+sum);
	}
}
