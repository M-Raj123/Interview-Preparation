/*

Implementation of Queue using Stack 

Input  : {1,3,5,6,-1,54,-1}
output :

Enqueue Costly
 s1 : [54, 6, 5]
 s2 : []
Dequeue Costly
 s1 : [5, 6, 54]
 s2 : []
 
*/

import java.util.Arrays;
import java.util.Stack;

class QueueStack 
{
    
    public static void EnqueueCostly(int arr[])
    {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]!=-1)
            { 
                while(!s1.isEmpty())
                {
                    s2.push(s1.pop());
                }
                s1.push(arr[i]);

                while(!s2.isEmpty())
                {
                   s1.push(s2.pop());
                }
            }
            else
            {
                s1.pop();
            }

        }

        System.out.println("Enqueue Costly");
        System.out.println(" s1 : "+Arrays.toString(s1.toArray()));
        System.out.println(" s2 : "+Arrays.toString(s2.toArray()));
        
    }

    public static void DequeueCostly(int arr[])
    {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]!=-1)
            { 
                s1.push(arr[i]);
            }
            else
            {
              while(!s1.isEmpty())
                {
                    s2.push(s1.pop());
                }
                s2.pop();

                while(!s2.isEmpty())
                {
                   s1.push(s2.pop());
                }
            }

        }

        System.out.println("Dequeue Costly");
        System.out.println(" s1 : "+Arrays.toString(s1.toArray()));
        System.out.println(" s2 : "+Arrays.toString(s2.toArray()));
        
    }

    public static void main(String[] args) 
    {

        int arr[] =  {1,3,5,6,-1,54,-1};
        EnqueueCostly(arr);
        DequeueCostly(arr);
    }
}



/* 
 Algo: EnQueue Costly

enQueue(q, x)
  1) While stack1 is not empty, push everything from stack1 to stack2.
  2) Push x to stack1 (assuming size of stacks is unlimited).
  3) Push everything back to stack1.
Here time complexity will be O(n)

deQueue(q)
  1) If stack1 is empty then error
  2) Pop an item from stack1 and return it
Here time complexity will be O(1)



Algo: DeQueue Costly

enQueue(q,  x)
  1) Push x to stack1 (assuming size of stacks is unlimited).
Here time complexity will be O(1)

deQueue(q)
  1) If both stacks are empty then error.
  2) If stack2 is empty
       While stack1 is not empty, push everything from stack1 to stack2.
  3) Pop the element from stack2 and return it.
Here time complexity will be O(n)

*/
