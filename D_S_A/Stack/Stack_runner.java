public class Stack_runner {
    public static void main(String args[]) {
        
        Stack obj = new Stack(10);
        
        obj.isEmpty();    // true

        obj.push(11);     // 11 - inserted
        obj.push(12);     // 12 - inserted
        obj.push(13);     // 13 - inserted

        obj.size();       // 3

        obj.display();    // 11 12 13 

        obj.pop();        // 13 - pop
        
        obj.display();    // 11 12 

        obj.peek();       // 12 

        obj.isFull();     // false
        
    }
}


class Stack {
    
    int arr[];
    int barr; 
    int top = -1;

    Stack(int setSize)
    {
        arr = new int[setSize];
        barr = setSize;
    }

    void push(int val)
    {
        if(!isFull())
        {
            top++;
            arr[top]=val;
            System.out.println("data inserted");
        }
        else
        {
            System.out.println("Stack overflow");
        }
    }

    void pop()
    {
        if(!isEmpty())
        {
            arr[top]=0;
            top--;
        }
        else{
            System.out.println("Stack underflow");
        }
    }

    int peek()            
    { 
        if(top>-1)
        {
            return arr[top];    
        }
        else return -1;
    }

    int size()
    {
        return top+1;
    }

    boolean isFull()
    {
        if(top==barr-1)
        {
            return true;
        }
        return false;
    }

    boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }

    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
