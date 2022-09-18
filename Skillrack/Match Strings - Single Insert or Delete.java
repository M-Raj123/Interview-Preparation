/*

Match Strings - Single Insert or Delete

Two string values S1 and S2 (without any space) which are passed as the input. The
program must print YES if S1 can be formed from S2 by inserting or deleting a single
character or vice versa. Else the program must print NO as the output.
Boundary Condition(s):
2 <= Length of S1, S2 <= 100
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains YES or NO

Example Input/Output 1:
Input:
apple
aple
Output:
YES
Explanation:
- S2 can be formed by deleting a single character p from S1 or
- S1 can be formed by inserting a single character p to S1.

Example Input/Output 2:
Input:
mango
amngo
Output:
NO


*/
public class Main
{
	public static void main(String[] args) {
	    Scanner sc  = new Scanner(System.in);
	    String p = sc.next(), q = sc.next();
	    if( (p.length()-1 == q.length()) || (p.length()==q.length()-1) )
	    {
	        System.out.println("YES");
	    }
	    else  System.out.println("NO");
	}
}
