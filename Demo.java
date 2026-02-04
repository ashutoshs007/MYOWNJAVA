public class Demo{
    public static void main(String a[]){

int i=20 ;
int j=0 ;






try
{
    j=18/i;
    if(j==0)
        throw new ArithmeticException("I do not want to print zero"); //calling catch block using throw 

    //throw keyword is used to throw the exceptino and catch is used to catch it.

   
}
catch( ArithmeticException e){
// System.out.println("Cannot divide by  zero ");   //  ArithmeticException  
j=18/1;
System.out.println("that's the default output"+e);
}


catch(Exception e){
    System.out.println("Stay in your limit."+e);
}

System.out.println(j);
System.out.println("Bye");


    }
}
