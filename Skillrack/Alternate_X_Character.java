/*
Accept a string S and a position X as input. 
The program must print the alternate X characters in the string by printing the first X characters and ignoring the next X characters. 
This process is repeated until the last character is reached.

input: 
        helloworld
        3
        
        environmentalpollution
        5
output:
        helorl
        envirtalpoon

*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            System.out.print(ch);
            if((i+1)%n==0)
            {
                i+=(n);
            }
            
        }
	}
}

