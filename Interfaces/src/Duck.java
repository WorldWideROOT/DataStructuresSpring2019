// since Duck is an Animal, it must have
// all methods declared in the Animal interface

public class Duck implements Animal {
    // default constructor (no parameters)
    // don't have to write it, but can if we want
    public Duck() {

    }

    public String getName() {
        return "duck";
    }

    public String getSound() {
        return "quack";
    }
}

