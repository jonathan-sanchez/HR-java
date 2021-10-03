// Class - A blueprint defining the characteristics of an object of that class type.

// Each class has two types of variables: class variables and instance variables

// Class variables point to the same (static) variable across all instances of a class.

// Instance variables have distinct values that vary from instance to instance.

public class Dog { // class name

    static String unnamed = "I need a name!"; // class variable
    int weight; // Instance Variable
    String name; // Instance Variable
    String coatColor; // Instance Variable

    // class constructor - Creates an instance of a class(i.e.: calling the Dog constructor creates an instance of Dog).

    // A class can have one or more constructors that build different versions of the same  type of object.

    // A constructor with no parameters is called a default constructor;  it creates an object with default initial values specified by the programmer.

    Dog() { // Default Constructor
        this.weight = 0;
        this.name = unnamed;
        this.coatColor = "none";
    }

    // A constructor that take sone or more parameters(i.e.: values in parenthesis) is called a parameterized constructor.

    Dog(int weight, String color) { // Parameterized constructor

        // Initialize Instance Variables
        this.weight = weight; // Assign parameter's value to instance variable
        this.name = unnamed;
        this.coatColor = color;
    }

    // Many languages allow you to have multiple constructors, provided that each constructor takes different types of parameters; these are called overloaded constructors.
    
    Dog(String dogName, String color) { //Overloaded parametized constructor
        // Initialize instance variables
        this.weight = 0;
        this.name = dogName;
        this.coatColor = color;

    }
}
