package org.example;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor with both parameters
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Overloaded constructor with only name; isDog defaults to false
    public Animal(String name) {
        this(name, false);
    }

    // Overloaded constructor with no parameters; default values
    public Animal() {
        this("Unknown", false);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for isDog
    public boolean isDog() {
        return isDog;
    }

    // toString method
    @Override
    public String toString() {
        return "Animal{name='" + name + "', isDog=" + isDog + "}";
    }
}
