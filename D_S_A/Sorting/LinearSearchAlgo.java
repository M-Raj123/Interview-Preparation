public class LinearSearchAlgo
{
	 public static int Linearsearch(int arr[],int k)
	 {
      int index=-1;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]==k)
          {
            index = i;
          }
      }

      if(index>-1)
      {
        return index;			
      }	
      return -1;
	 }

	 public static void main(String args[])
	 {

      int arr[] = {2,3,4,6,12,35,78};
      int key = 20;	

      int position = Linearsearch(arr,key);
      if(position > -1)
      {
        System.out.println("Element "+key+" Found in "+position+" Index");
      }
      else
      {
        System.out.print("Element "+key+" not Found");	
      }	

	 }
}
