

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
class C extends A 
{
   public void show(){
  System.out.println("in C show");
 }
    
}




public class Demo{
    public static void main(String a[])
    {


        //runtimee polymorphism - coz obj.show() will print whaat is decided on runtime.
        // and all this concept is called dynamic method dispatch

        
A obj =new A();
obj.show();

obj =new B();
obj.show();

obj=new C();
obj.show();
        
    }
}