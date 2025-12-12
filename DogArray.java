public class DogArray {
    public static void main(String[] args) {

        // Step 19: Declare (but do not initialize) arrays
        // Dog[] myDogs;
        // Dog[] neighborsDogs;
        // If you tried to print these now, you'd get a "might not have been initialized" error.

        // Step 20: Initialize arrays (known dogs vs unknown dogs)
        Dog[] myDogs = {
            new Dog("Lady"),
            new Dog("Tramp"),
            new Dog("Trusty")
        };
        Dog[] neighborsDogs = new Dog[2]; // elements start as null

        // Step 21: Print names of your dogs using a Dog method
        System.out.println("My dogs...");
        System.out.println(myDogs[0].getName());
        System.out.println(myDogs[1].getName());
        System.out.println(myDogs[2].getName());

        // Step 20/Check: What is in each element of neighborsDogs?
        System.out.println("\nNeighbor dogs (before naming)...");
        System.out.println(neighborsDogs[0]); // null
        System.out.println(neighborsDogs[1]); // null

        // Step 22: Create neighbor Dog objects WITHOUT changing the array declaration
        neighborsDogs[0] = new Dog();
        neighborsDogs[0].setName("Cinnamon");

        neighborsDogs[1] = new Dog();
        neighborsDogs[1].setName("Mocha");

        System.out.println("\nNeighbor dogs (after naming)...");
        System.out.println(neighborsDogs[0].getName());
        System.out.println(neighborsDogs[1].getName());

        // Step 23: EXPECT AN ERROR (type mismatch). Uncomment ONLY for the screenshot.
        /*
        Dog[] friendsDogs = {new Dog("Lady"), new String("Tramp")};
        System.out.println(friendsDogs[0] + " and " + friendsDogs[1]);
        */

        // Step 24 fix (if you need it after the screenshot): change String to Dog
        // Dog[] friendsDogs = {new Dog("Lady"), new Dog("Tramp")};

        // Step 25–26: EXPECT AN ERROR (initializer list reassignment). Add comment + comment it out.
        // Error: Initializer lists can only be used when declaring an array.
        // You cannot use an initializer list to reassign an existing array reference.
        // neighborsDogs = {new Dog("Cinnamon"), new Dog("Mocha")}; // error

        // Step 27–28: EXPECT AN ERROR (index out of bounds). Uncomment ONLY for the screenshot.
        /*
        neighborsDogs[2] = new Dog("Cocoa"); // error: index 2 out of bounds for length 2
        */

        // Step 29–30: EXPECT AN ERROR (NullPointerException after resizing). Uncomment ONLY for screenshot.
        /*
        neighborsDogs = new Dog[3];
        System.out.println(neighborsDogs[0].getName()); // error: neighborsDogs[0] is null
        */

        // Step 31: Assign null to indicate removal (example)
        myDogs[2] = null;
        System.out.println("\nAfter giving away puppy, myDogs[2] = " + myDogs[2]);
    }
}