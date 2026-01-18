public class Demo{
    public static void main(String a[]){
        int num =7;  //num here is primitive variable


         
        // Integer num1 = 8; 


        // Integer num1 = new Integer(8); //num1 is reference variable


        // Integer num1 = new Integer(num); // THIS IS CALLED BOXING(taking a primitive value and storing that in a class object )

        
         Integer num1 =num; //Auto-boxing


         int num2 =num1;  //auto -unboxing //unboxing (coz you are getting value from object type to primitive type)
        

        System.out.println(num1);



        String str ="12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);

    }


}