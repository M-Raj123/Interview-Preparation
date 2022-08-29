class Demo
{
    Demo()
    {
        System.out.println("Constructor");
    }
    static 
    {
        System.out.println("static 1");
    }
    {
        System.out.println("instance 1");
    }
    static
    {
        System.out.println("static 2");    
    }
    {
        System.out.println("instance 2");
    }

    public static void main(String[] args) 
    {
        new Demo();    
    }
}

output: 
    
    static 1
    static 2
    instance 1
    instance 2
    Constructor
