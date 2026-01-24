enum Laptop{

    // 4 objects will call constructor 4 times
    //one time default constructor will be called and 3 times parametarized constructor will be called


    Macbook(2000) ,XPS(2200),Surface,ThinkPad(1800);

//    that's how private constructor works where we can create the object in the same class



    private int price;

    private Laptop(){
        price=500;
    }

    private Laptop(int price){
        this.price=price;
        System.out.println(" in Laptop "+this.name());
    }


    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

}



public class Demo
{
    public static void main(String a[])
    {


        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " +lap.getPrice());


        //need all laptops price

        for(Laptop lap: Laptop.values())
        {
            System.out.println(lap + " : " +lap.getPrice());

        }



    }
}
