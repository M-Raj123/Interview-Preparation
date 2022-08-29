
class Singleton 
{
    private static Singleton instance = null; 
    
    private Singleton()         // Make a constructor private
    {
        System.out.println("I am Constructor");
    }
    public static Singleton getInstance()
    {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
 
class Demo
{
    public static void main(String[] args) 
    {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        System.out.println(x.hashCode()+" "+y.hashCode());

        if(x==y)
        {
            System.out.println("Two objects points to the same memory location");
        }
        else 
        {
            System.out.println("Two objects points to the Different memory location");
        }
    }    
}
