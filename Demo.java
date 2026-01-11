// super method simply means -call the constructor of a superclass


// Every class in java extends Object class even if we don't mention (john cina meme-it's there but you can't see it meme)




// both below line works the same
// coz super in A  below it is also having some superclass called Object to which class A  is extending


// super() in A means calling a constructor of the Object class


// class A extends Object

// but B  class is stil lnot extending both A and Object class,cause java do not support multiple inheritence,it's still like multilevel inheritence, where class B extends A and A extends Object Class.




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

        // super();
        super(n);


           System.out.println("in B int");
     }


}





public class Demo
{
    public static void main(String args[])
    {
       B obj =new B(69); 
    //    B obj =new B(); 
       //WHENEVER YOU CREATE AN OBJECT IT WILL CALL THE CONSTRUCTOR OF A CLASS

       //it will print both 
    //    in A  & 
    //    in B  coz. whenever you create object of a calss ,it  will call the constructor of both subclass (B)
    //    as well as superclass(A).

    // Every constructor in java has a method(even if you don't mention there that method still exists)called super();


    //Every class in java extends the object class

    //Object is a class in java which has lots of methods
    }
}