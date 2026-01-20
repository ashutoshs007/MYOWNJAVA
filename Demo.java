//Anonymous inner class


class A 
{
    public void show()
    {
        System.out.println("in a Show");
    }
}

class B extends A
{
    public void show()
    {
         System.out.println("in B show");
    }
}


public class Demo
{
    public static void main(String a[])
    {

        A obj =new A(){
            
                public void show(){

                    System.out.println("in new show");
                }
            
        };

        obj.show();
    }
}


//Demo$1.java is anoymous inner class ,we can change the definition of class during object creation ,and that class is called anonymous class which has no name.
