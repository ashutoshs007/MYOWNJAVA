//final keyword -can be used with variable,method,class

class Calc
{
    public void show()
    {
        System.out.println("in Calc Show");
    }


    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}





public class Demo
{
    public static void main(String a[])
    {

        final int num =8;  //for constant value eg;22/7 (pi)

         num=9;

         System.out.println(num);



    }
}