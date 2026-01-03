
// 🧱 Step 1: What is made private?
// private String name;


// Meaning:

// ❌ Other classes cannot touch name directly
// ✅ Only Person class itself can use it

// 🧱 Step 2: How does Person allow access then?
// public void setName(String name) {
//     this.name = name;
// }

// public String getName() {
//     return name;
// }


// Meaning:

// setName() → puts value inside

// getName() → takes value out

// These are controlled doors 🚪

// 🧱 Step 3: What happens in main()?
// Person p = new Person();
// p.setName("Alice");   // ✅ allowed


// ✔ Because setName() is public

// 🧱 Step 4: Why this line is commented?
// // System.out.println(p.name);


// Because:

// ❌ name is private
// ❌ Geeks class is outside Person
// ❌ Direct access is NOT allowed

// If you uncomment it → compile-time error

// 🧱 Step 5: Correct way (WORKS)
// System.out.println(p.getName());


// ✔ Accessing through method
// ✔ Data is still protected
// 🔒 Data should be hidden and accessed only through methods
// This is called ENCAPSULATION



class Person {

    // private variable
    private String name;

    public void setName(String name)  {

        this.name = name; // accessible within class
    }

    public String getName() { 
      return name;
    }
}

public class Geeks {
    public static void main(String[] args)
    {

        Person p = new Person();
        p.setName("Alice");

        // System.out.println(p.name); // Error: 'name'
        // has private access
        System.out.println(p.getName());
    }
}
