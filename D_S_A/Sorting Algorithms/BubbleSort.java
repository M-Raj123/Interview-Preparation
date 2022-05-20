class BubbleSort 
{
    public static void bubblesort(int[] arr) 
    {
        int n = arr.length ;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
      
        int[] arr={ 3,4,6,5,2,1 };
        
        bubblesort(arr);
      
        for(int k:arr) System.out.print(k+" ");    // output -- 1 2 3 4 5 6 
         
    }
}
