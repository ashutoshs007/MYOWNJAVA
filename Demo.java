class Human
{
private int age =11;  //this is accessible in the same class
private String name ="Navin";

public  int getAge()
{
    return age;
}

public void setAge( int a){
    age= a;
}


public String getName()
{
    return name;
}

public void setName(String n)
{
    name = n;
}

}


public class Demo
{
   public static void main(String a[]) 
   {
      Human obj = new Human();
    //   obj.age = 11;
    //   obj.name="Navin";
    obj.setAge(23);
    obj.setName("Ashutosh");

 
    //   System.out.println(obj.name);   //won't work coz name is private so to access it you need to access via method which we made inside that class
  
      System.out.println(obj.getName()+ " : " + obj.getAge());


   }
}