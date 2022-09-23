/*

Escape Speed

The program must accept three floating point values as G (gravitational constant),
M (mass) and R (radius) of a planet. The program must calculate and print the escape
speed of the object with precision up to 3 decimal places.
Formula:  /---
        |/  2GR/r
        
Example Input/Output 1:
Input:
1.567 2.4783 3.4671
Output:
1.497
Example Input/Output 2:
Input:
1.9038 2.7920 4.3937
Output:
1.555

*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g = sc.nextDouble(), m = sc.nextDouble(), r=sc.nextDouble();
        double val = (2*g*m)/r;
        double k = Math.sqrt(val);
        // System.out.println(k);
        System.out.printf("%.3f",k);
	}
}
