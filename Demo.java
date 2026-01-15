class Computer
{
  
}

  class Laptop extends Computer
  {

  }




class A
{
 public void show(){
  System.out.println("in A show");
 }

}

class B extends A 
{
   public void show(){
  System.out.println("in B show");
 }
    
}




public class Demo{
    public static void main(String a[])
    {


        // B obj = new B();

        A obj = new B(); //here reference is of type A  //yes,it is possible to create a reference of a superclass(A) and an object of a subclass(B)
 //THE obj variable type is A here but the implementation is B


        //we can mention the type as parent but  the object can be of  child
        // A obj =new A();
        obj= new C();
        obj.show();

        // Laptop obj1 = new Laptop();
        Computer obj1 = new Laptop();
        


    }
}