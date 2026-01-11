//Inheritence


// THIS MULTIPLE INHERITENCE WORKS IN C++ BUT DO NOT WORK IN JAVA
// BUT WHY?

// class A{

// }

// class B{


// }

// class C extends A,B{


// }







public class Demo
{
    public static void main(String[] args)
    {
     
        VeryAdvCalc obj =new VeryAdvCalc();
        int r1=obj.add(4,5);
        int r2=obj.sub(8,3);
        int r3=obj.multi(5,3);
        int r4=obj.div(15,4);
        double r5=obj.power(4,2);

        System.out.println(r1+ " "+r2+" "+r3+" "+r4+" "+r5);
    }
}