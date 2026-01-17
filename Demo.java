//typecasting

class A
{
   public void show1()
   {
    System.out.println("in A show");
   }
}

class B extends A
{


    public void show2()
   {
    System.out.println("in B show");
   }
}



public class Demo{
    public static void main(String a[])
    {
        // double d=4.5;
        // int i =(int) d;


        A obj =(A) new B();
        obj.show1();  //upcasting

        B obj1 =(B) obj;  //downcasting
        obj1.show2();



    }
}