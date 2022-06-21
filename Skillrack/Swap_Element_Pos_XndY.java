/*

SWAP ELEMENT AT POSITION X AND Y 

input : 4  2  4 
        35 46 57 68 
        
output: 35 68 57 46

*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) arr[i]= sc.nextInt();
		
		int temp = arr[x-1];
		arr[x-1] = arr[y-1];
		arr[y-1] = temp;
		
		for(int k:arr) System.out.print(k+" ");
		
	}
}
