class selectionSort 
{
    public static int[] sort(int arr[]) 
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min = i ;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])                
                {
                    min=j;
                }
            }

            if(min!=i)
            {
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr={1,1,5,6,7,2,3,5,7,8};

        arr = sort(arr);

        for(int num:arr)
        {
            System.out.print(num+" ");   // output: 1 1 2 3 5 5 6 7 7 8 
        }
   
    }
}


