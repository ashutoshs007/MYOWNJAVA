// Functional interface is a interface which only has one method


@FunctionalInterface
interface A
{
 void show( int i);
}




public class Demo
{
    public static void main(String a[])
    {


      //Below trying to instantiate the class which implements the interface

    //  A obj = new A()  
    //  {
    //     public void show()

    // another way of writing above thign is using lambda expression which has been written below

    //  A obj =  i -> System.out.println("in show "+i);//this also works fine


     A obj = (int i) -> System.out.println("in show "+i);
    obj.show(5);
    }
}