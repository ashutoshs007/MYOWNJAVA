//class-class-->extends
//class-interface-->implements
//-inteface-interface-->extends




interface A 
{
   
    void show();
    void config();
}


interface X{
    void run();
}




interface Y extends X
{



}







//  B is not abstract and does not override abstract method run() in X


// one class can implement multiple interfaces but this is not the case with abstract class
// coz. an abstract class can extend only one class



class B implements A,X
{
    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
        System.out.println("in config");
    }

    public void run(){
    System.out.println("running");
    }
}



public class Demo
{
    public static void main(String a[])
    {
         A obj ;
         obj = new B();
         obj.show();
         obj.config();

         obj.run();//do not work coz obj is for B which has no run method ,that is in X

         X obj1 = new B();
         obj1.run();//NOW IT WORKS 

         //HERE IS ALSO SAME CASE,WE CANNOT CALL OTHER TWO METHODS IN A  WITH THE HELP OF OBJ1 COZ OBJ1 IS OBJECT OF X


         System.out.println(A.area);
    }
}