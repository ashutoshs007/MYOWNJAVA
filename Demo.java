//final keyword -can be used with variable,method,class



// making a variable as final means making it constant
//making a class as final means stopping inheritence

//if you made your method final,no method can override it

// final class Calc
class Calc
{
    public final void show()
    {
        System.out.println("By Navin");
    }


    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc
{


    public void show()
    {
        System.out.println("By John");
    }
}


public class Demo
{
    public static void main(String a[])
    {

   AdvCalc obj = new AdvCalc();
   obj.show();
   obj.add(4,5);

    }
}