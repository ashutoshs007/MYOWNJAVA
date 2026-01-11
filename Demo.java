// super method simply means -call the constructor of a superclass




class A
{
   public A()
     {

        super();
        System.out.println("in A");
     }  


     public A(int n){

          super();
           System.out.println("in A int");
     }
    


}


class B extends A
{
     public B()
     {

        super();
        System.out.println("in B");
     }


     //parameterized constructor
     public B(int n){

        super();
        

           System.out.println("in B int");
     }


}





public class Demo
{
    public static void main(String args[])
    {
       B obj =new B(69); 
       //WHENEVER YOU CREATE AN OBJECT IT WILL CALL THE CONSTRUCTOR OF A CLASS

       //it will print both 
    //    in A  & 
    //    in B  coz. whenever you create object of a calss ,it  will call the constructor of both subclass (B)
    //    as well as superclass(A).

    // Every constructor in java has a method(even if you don't mention there that method still exists)called super();
    }
}