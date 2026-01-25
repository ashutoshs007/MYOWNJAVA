// Functional interface is a interface which only has one method

//Lambda expression works only with a functional interface(with single methods coz multiple method will confuse lambda expression whether which method to implement)


@FunctionalInterface
interface A
{
 int add( int i,int j);
}




public class Demo
{
    public static void main(String a[])
    {

// A obj =new A()
// {
//    public int add(int i,int j)
//    {
//     return i+j;
//    }
// };   //this same thing can be written as below using lambda expression

A obj = (i, j) ->  i+j;
   


int result =obj.add(5,4);
System.out.println(result);

   
    }
}