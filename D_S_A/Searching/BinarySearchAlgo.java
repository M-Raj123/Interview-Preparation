import java.util.*;
public class Main 
{
    public static int binarySearch(int arr[],int key)
    {
        int low = 0, high = arr.length-1;
        
        while(low<=high)
        {
            int mid  = (low+high)/2;
            
            if( arr[mid] == key )
            {
                return mid;
            }
            else if( arr[mid] > key )
            {
                high = mid-1;
            }
            else if( arr[mid] < key )
            {
                low = mid+1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) 
    {
	Scanner sc = new Scanner(System.in);
        
        int arr[] = {1,2,11,19,23,27,35,40,52,56};
        
        int key = sc.nextInt();
        
        int index = binarySearch(arr,key);
        
        if(index>-1)
        {
            System.out.println("Found at "+index+" Index");
        }
        else System.out.println("Not Found");
    }
}

// Time Complexity of Binary Search Algorithm is O(log n).
