/*

Rotation Count in Anti clockwise

input: 5 
       30 40 50 10 15
output: 3


input: 8 
       20 10 11 12 13 14 14 15
output: 1

*/


public class Main
{
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), ind=0; 
		int arr[] = new int[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		
		for(int i=0;i<n-1;i++)
		{
		    if(arr[i]>arr[i+1]) ind = i;
		}
		
		System.out.println(ind);
	}
}
