import java.util.Set;
// import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {

        //  Set<Integer> nums = new HashSet<Integer>();

        //   Collection<Integer> nums = new HashSet<Integer>();   //infact this also works coz TreeSet implements Set and Set extends Colleection


         Set<Integer> nums = new TreeSet<Integer>(); //TreeSet is used for sorted values

        // HashSet implements the Set interface
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6); // duplicate, will be ignored

        // for (int n : nums) {
        //     System.out.println(n);
        // }



        Iterator<Integer> values = nums.iterator();

        
        while(values.hasNext()) //hasNext tell you whether do you have next element or not

        System.out.println(values.next());



    }
}

// Set cannot have duplicate values 

// Set do not follows the sequence

// Set will not give values in sorted format

// Set doesn't support index values

// instead of HashSet we can use TreeSet for getting sorted values

//TreeSet extends AbstractSet and implements
// Navigational Set and 
// Navigational Set inteface extends Sorted Set









