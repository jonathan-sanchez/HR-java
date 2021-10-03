public class Dog { // class name

    static String unnamed = "I need a name!"; // class variable
    int weight; // Instance Variable
    String name; // Instance Variable
    String coatColor; // Instance Variable

    Dog() { // Default Constructor
        this.weight = 0;
        this.name = unnamed;
        this.coatColor = "none";
    }

    Dog(int weight, String color) { // Parameterized constructor

        // Initialize Instance Variables
        this.weight = weight; // Assign parameter's value to instance variable
        this.name = unnamed;
        this.coatColor = color;
    }
}
