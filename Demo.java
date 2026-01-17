//Every class in java extends the object class

class Laptop
{
 int price;
 String model;


 public String toString()
 {
  return model + " : "+price;
 }
 
}

public class Demo
{
    public static void main(String [] args){

Laptop obj = new Laptop();
  obj.model ="Lenovo Yoga";
  obj.price=1000;


  System.out.println(obj);
  System.out.println(obj.toString());//Everytime you try to print the object ,it will call toString method even if you don't mention.

   System.out.println(obj); //toString getting called by default
 
}

}