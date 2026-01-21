
// abstract class A
// {


//     // In abstract class we can create abstract methods as well as normal methods

//     public abstract void show();
//     public abstracrt void config();
// }




//interface is not a class
//every method in the interface is public abstract

interface A
{

// all the variables inside interface are by default final and static


    int age =44 ; 
    String area="Mumbai";

    void show();
    void config();
}


//whenever you say implements ,it become compulsary for you to define both the methods,if you failed to define both the methods by default the class B also becomes abstract




//you only get methods in implements not variables


//interface do not have their own memory in the heap,so if you do not have your own memory how you can have  a  non-final variable,that's why you only get methods in implements not variables


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
    //  obj =new A(); // A is abstract; cannot be instantiated

    //  you cannot create object of A but you can create object of B


    obj =new B();
    obj.show();
    obj.config();

    //Since age and area are static ,we can directly use the interface name  ,when we use static varaible ,we don't have to use the object

    // A.area="Bangalore";   cannot assign a value to static final variable area


    System.out.println(A.area);//we can directly do this without creating an object
    }
}