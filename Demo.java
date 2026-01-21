

// abstract class Computer
// {

//     abstract public void code();
    
// }

interface Computer
{

     void code();
    
}





// class Laptop extends Computer
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code,compile,run");
    }
}


// class Desktop extends Computer
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code,compile,run:Final");
    }
}






//we are doing tight coupling here by saying that developer is dependent on laptop only and if he got desktop someday ,he cannot work ,but no developer is depended on a Computer ,a Computer can be a Laptop ,it can be a Desktop as well

class Developer
{
    // public void devApp(Laptop lap)

    public void devApp(Computer lap)
    {
        // System.out.println("coding..");
        lap.code();
    }
}



public class Demo
{
    public static void main(String a[])
    {

        // Laptop lap =new Laptop();

        Computer  lap =new Laptop();   //interface reference not class reference

        // Desktop desk =new Desktop();

        Computer desk =new Desktop();

        Developer navin = new Developer();

        // navin.devApp(lap);
        navin.devApp(lap);
        navin.devApp(desk);


    }
}



//so that's how you design application to make it loosly coupled where your developer object is not dependent on Laptop or Desktop ,it is depended on Computer