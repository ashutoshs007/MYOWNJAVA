
class A{
    public void show() throws ClassNotFoundException
    {
    //   try{

        Class.forName("Demo");


        // }
        // catch(ClassNotFoundException e){
            // System.out.println("Not able to find the class");
        // }

    }
}

public class Demo{
 static{
    System.out.println("Class Loaded");
 }


    public static void main(String a[])
    { 


        A obj =new A();
        try{
            obj.show();
        }
        catch( ClassNotFoundException e){
            e.printStackTrace();  //prints entire method call stack
        }
    }
}
