      Polymorphism:-many behaviour

same person Many          Behaviour at office ,at office ,with friends


the same object or reference will have different behaviour
based on how you create the instance of it

Types of polymorphism:-
1.Compile time Polymorphism
(Early binding)

-behaviour is defined at compiled time

Method Overloading(which method to execute will be decided at compield time )

add(int,int)
add(int,int,int)



2.Run time Polymorphism
(Late binding)
--behaviour is defined at run time

Method Overriding
{
    2 CLASS, A AND B

    B extends A 

    add(int,int)
    add(int,int)

    out of these two merhods ,wich one will get executed ,it will be decided at runtime 
}



Java is not purely object oriented coz.Everyting is not an object


int,float - primitive types(not object types) so they do not extend object class.



In array ,we can have primitive type but in
Collection framework  -we need to have object type


All about abstract:-


Abstract method can only belong to abstract class


We cannot create object of abstract class

But we can create a reference of abstract class

Car obj = new WagonR();



We  can create object of a concrete class ,not an abstract class

If you have any abstract methoed ,then make that class as abstract/



