abstract class Car
{
public void drive(); //declaring a method like this will give your error (you cannot create object of this ),to declare a method ,use abstract keyword or the above thing will give error 


public  abstract void drive();
public  abstract void fly();



// public void drive(){

    //defining a method
// }


     
public void playMusic()
{
System.out.println("play music");

}

}


//if you have a class which extends abstract class then it should must implement all the abstract methods of that abstract class otherwise it will give an error ,

// If in case it is not able to immplement all abstract method of superclass then make that subclass as abstract as well


// class WagonR extends Car
// {

   abstract class WagonR extends Car
{
     
    public void drive()
    {
       System.out.println("Driving"); 
    }


    // public void fly(){
    //     System.out.println("Flying");
    // }
    
}



// now if above class WagonR is abostract class ,we cannot create object of it as well
// so we need to create a new class


class UpdatedWagonR extends WagonR    //CONCRETE CLASS
{     
    @Override
    public void fly(){
        System.out.println("Flying");
    }

} 






public class Demo
{
    public static void main(String a[])
    {
    //    Car obj = new Car();
    //    obj.drive();
    //    obj.playMusic();

    //    Car obj = new WagonR();
    //    obj.drive();  //CALLS DRIVE OF WagonR
    //    obj.playMusic();


    //    Car obj = new UpdatedWagonR();
    //    obj.drive();
    //    obj.playMusic();


    }
}