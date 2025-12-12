public class Dog {
    private String name;

    // no-arg constructor
    public Dog() {
        name = "";
    }

    // constructor with name
    public Dog(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }
}