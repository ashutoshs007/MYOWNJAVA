

// When you have a class which has only abstract methods ,the other alternative  for that is to create an interface(we use mostly in project development) 

// Interface is not a class

// by default every method in a interface 
// is public abstract by default




// abstract class A
// {

//     public abstract void show();  //public abstract is there by default
//     public abstract void config();
// }



interface A
{


    //Every variable in the interface are bydefault dinal and static

    int age=44 ;
    String area ="Mumbai";
    
    void show();
    void config();
}

// implements means by default it is compulsary for you to define both the methods ,if you failed to do so then this class is also becomes abstract by default

//interface do not have their own memory in the heap

class B implements A
{

    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
         System.out.println("in config");
    } 
    }








public class Demo
{
    public static void main(String a[])
    {

       A obj ;
    //    obj = new A();  //A is abstract; cannot be instantiated

       obj =new B();
       obj.show();
       obj.config();

    }
}