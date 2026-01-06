class Mobile
{
    //INSTANCE VARIABLES
   String brand;
   int price;
   //STATIC VARIABLES
   static String name;

   public void show()
   {
    System.out.println(brand+ " : "+price+ " : "+name);
   }

public static void show1()
{
    System.out.println("in static method");
}
    
}


public class Demo {
public static void main(String [] args){
    Mobile obj1 =new Mobile();
    obj1.brand ="Apple";
    obj1.price = 1500;
    Mobile.name = "SmartPhone";

    Mobile obj2 =new Mobile();
    obj2.brand ="Samsung";
    obj2.price = 1800;
    Mobile.name = "SmartPhone";

    Mobile.name ="Phone";
    obj1.show();
    obj2.show();

    Mobile.show();  // "Cannot make a static reference to the non-static method show() from the type Mobile"

    Mobile.show1();
	
}
}

//you cannot call a non-static method with the help of  a classname
// ,that's why you ned object

// you can call a static method directly with the help of a classname 


//you cannot use a non-static variable inside a static method,why?


