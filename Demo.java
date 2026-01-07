//how to differentiate between instance variable and local variable

//this is a keyword which represents current object(the object which is calling the method , this refers to the current object which is calling setAge )

// ->by passing the object itself

 class Human{

private int age ;  //this is accessible in the same class
private String name ;
public  int getAge(){
    return age;
}

// public void setAge( int a){
//     age= a;
// }

// public void setAge( int age){
// public void setAge( int age,Human obj){

public void setAge( int age){
    // Human obj1=new Human(); 
    // obj1.age =age;


//     Human obj1 = obj;
//    obj1. age= age;

this.age=age;
}


public String getName(){
    return name;
}

public void setName(String name){
     this.name=name;
    
}

}


public class Demo
{
   public static void main(String a[]) 
   {
      Human obj = new Human();
   
    // obj.setAge(23);
    // obj.setAge(23,obj);
    obj.setAge(23);
    obj.setName("Ashutosh");


  
      System.out.println(obj.getName()+ " : " + obj.getAge());


   }
}