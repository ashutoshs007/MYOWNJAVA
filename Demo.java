//Anonymous inner class


abstract class A 
{
    public  abstract void show();
   
}



class B extends A{

    public void show(){
    System.out.println("in B show");
    }

}





public class Demo
{
    public static void main(String a[])
    {

    //    A obj =new A();    //won't work coz. you cannot instantiate 
        // the abstract class so just extend A using B then provide implementation there 
    


    //    A obj =new B(); 
    //    obj.show(); 

       A obj = new A()  //here we can do this coz. we are creating the object of anonymous ineer class
       {

         public void show()
         {
    System.out.println("in new show");
    }
       };

       obj.show();
    }
}


