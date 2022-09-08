/*

Transport Network Company

The program must accept an uppercase alphabet CH (only either O or U) and a number
N as the input. The program must print the output based on the following conditions.
If CH is O, it represents Ola. When O is chosen, it must check for the following options,
- If N is 1, then print Auto.
- If N is 2, then print Mini.
- If N is 3, then print Micro.
- If N is 4, then print Prime.
If any of the input values is not in the list mentioned above, then the program must print
Invalid.
If CH is U, it represents Uber. When U is chosen, it must check for the following options,
- If N is 1, then print Auto.
- If N is 2, then print Cab.
If any of the input values is not in the list mentioned above, then the program must print
Invalid.

Example Input/Output 1:
Input:
O 2
Output:
Ola Mini

Example Input/Output 2:
Input:
U 2
Output:
Uber Cab

*/

import java.util.*;
public class Hello {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int     ch = sc.nextInt();
        
        if(str.charAt(0)=='U')
        {
            switch(ch)
            {
                case 1: System.out.print("Uber Auto");
                        break;
                case 2: System.out.print("Uber Cab");
                        break;
                default: System.out.print("Invalid");
            }
        }
        else
        {
            switch(ch)
            {
                case 1: System.out.print("Ola Auto");
                        break;
                case 2: System.out.print("Ola Mini");
                        break;
                case 3: System.out.print("Ola Micro");
                        break;
                case 4: System.out.print("Ola Prime");
                        break;
                default: System.out.print("Invalid");
            }
        }
	}
}
