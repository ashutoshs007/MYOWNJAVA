//in constructor- (a special method having same name as class name) ,we do not specift return type

//a constructor never returns anything

//whenever an object is created ,a constructor will be called
 class Human{

private int age ; 
private String name ;

public Human(){  //default constructor
    // System.out.println("in constructor");
    age=12;
    name="John";
}

public Human(String name){
    this.age=12;
    this.name=name;
}
public Human(int age,String name)  //parameterized constructor
{
    this.age =age;
    this.name = name;

}



public  int getAge(){
    return age;
}


public void setAge( int age){
    this.age =age;
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
      Human obj1= new Human("Navin"); //create an object with the help of values
      
      System.out.println(obj.getName()+ " : " + obj.getAge());
        
      System.out.println(obj1.getName()+ " : " + obj1.getAge());
   
   
    // obj.setAge(23);
    // obj.setName("Ashutosh");


  
    //   System.out.println(obj.getName()+ " : " + obj.getAge());

    //bydefault the value for string is null.
    //default value for int is 0.


   }
}