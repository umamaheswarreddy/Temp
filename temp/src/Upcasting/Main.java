package Upcasting;

public class Main {
 
    // Driver code
    public static void main(String[] args)
    {
        // Upcasting
        Parent p = new Child();
        p.name = "GeeksforGeeks";


 
        //Printing the parentclass name
        System.out.println(p.name);
        //parent class method is overriden method hence this will be executed
        p.method();
        p.method2();
 
        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error
 
        // Downcasting Explicitly
        Child c = (Child)p;
 
        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
    }
}