class Mobile
{
    //INSTANCE VARIABLES
   String brand;
   int price;
   //STATIC VARIABLES
   static String name;


   //irrespective of how many objects we will create, it will call the static block only once
   static {
    name ="Phone";
    System.out.println("inside static block");
   }

   public Mobile()
   {
      brand ="";
      price = 200;
      System.out.println("Inside constructor");
    //   name="Phone";   //we can initialize a static variable inside a constructor but it will be called everytime we will create an object ,so to deal with this ,we will intialize it inside static block ,same as what we did inside static block above.

   }

   public void show()
   {
    System.out.println(brand+ " : "+price+ " : "+name);
   }


    
}


public class Demo {
public static void main(String [] args){
    Mobile obj1 =new Mobile();
    obj1.brand ="Apple";
    obj1.price = 1500;
    Mobile.name = "SmartPhone";

     Mobile obj2 =new Mobile();

    

	
}
}



