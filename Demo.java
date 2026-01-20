class A 
{
   
    int age;
    public void show()
    {

     System.out.println("in show");
    }

    static class B
    {

        public void config()
        {
            System.out.println("in config");
        }
    }
    
}




public class Demo 
{
    

    public static void main(String a[])
    {
     
        A obj =new A();
       obj.show();

       A.B obj 1 = obj.new B(); //if you want to create an object of B ,you need object of A first


        //    A.B obj 1 = new A.B(); //this will work only when inner class is static 

       obj1.config();

    //    show is a non -static method ,to call it you need object,in the same way if you want to create object of B ,you need object of A coz. that is a non-static method.

    //when we refer to a static class we do not need object
       

    }
}




// static can be used for only inner class

// outer modifier can be only public ,abstract and final are permitted
