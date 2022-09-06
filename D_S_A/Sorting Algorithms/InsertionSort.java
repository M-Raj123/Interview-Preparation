import java.util.Arrays;
class InsertionSort
{
    public static void insertionSort(int[] arr)
    {
        int n = arr.length;
        for(int i=1 ; i<n ; i++ )
        {
            int key = arr[i];
            int j = i-1 ;
            while( 0 <= j && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; 
        }
    }
    
	  public static void main(String[] args) 
	  {
		   int arr[] = {7,2,3,5,6,1};
		   sinsertionSort(arr);
		   System.out.print(Arrays.toString(arr));  // output - 1 2 3 5 6 7
	  }
}
