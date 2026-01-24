
// import java.util.Collection;
import java.util.ArrayList;
import java.util.List;



public class Demo{

    public static void main(String [] args) {


// Collection<Integer> nums = new ArrayList<Integer>();
List<Integer> nums = new ArrayList<Integer>();

nums.add(6);
nums.add(5);
nums.add(8);
nums.add(2);
nums.add(6);


// ArrayList is a class which implements a list and list does have a method called get because list works with index values ,so if you want to work with index value ,sue List instead of Collection



//INTEGER,FLOAT CLASSES ,ALL THESE CLASSES EXTEND THE OBJECT CLASS

// AND BY DEFAULT

// Collection API WORK WITH OBJECTS

// 6,5,8,2 ARE NOT INTEGERS THEY ARE OBJECTS AND THAT'S WHY WE CANNOT STORE THEM INTO INTEGERS

// TO SOLVE THIS PROBLEM ,USE GENERICS

// Collection normally work with objects ,not with primitive values 

System.out.println(nums.get(2));
System.out.println(nums.indexOf(5));


  for(int n:nums)
    {
        System.out.println(n);
    }    

    }
}