class Mobile
{
    //INSTANCE VARIABLES
   String brand;
   int price;
   //STATIC VARIABLES
   static String name;


   static {
    name ="Phone";
    System.out.println("inside static block");
   }

   public Mobile()
   {
      brand ="";
      price = 200;
      System.out.println("Inside constructor");
  

   }

   public void show()
   {
    System.out.println(brand+ " : "+price+ " : "+name);
   }


    
}


public class Demo {
public static void main(String [] args) throws ClassNotFoundException
{ 
   Class.forName("Mobile");  //this will load class even if object is not created,it not not create the object ,it just instantiate it
	

   //we will use this feature when we will learn jdbc
}
}



