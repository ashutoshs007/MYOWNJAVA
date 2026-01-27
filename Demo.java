public class Demo{
    public static void main(String a[]){

int i=0;
// int i=4;

//int j=18/i;  //ArithmeticException: / by zero


//try throws the error as an object
//you have to catch as an object

int j=0;

try{
    j=18/i;
}
catch(Exception e)
{
    System.out.println("Something went wrong");
}

System.out.println(j);
System.out.println("Bye");


    }
}


//catch block will be executed only in case of Exception