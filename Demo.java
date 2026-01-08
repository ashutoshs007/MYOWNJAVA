class A
{

    public A()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}

public class Demo
{
    public static void main(String a[])
    {

        int marks;
        marks =99;
        A obj =new A();
        obj.show();
    }
}