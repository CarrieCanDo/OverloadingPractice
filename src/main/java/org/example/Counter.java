package org.example;

public class Counter {
    private int value;

    // Constructor with start value
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Constructor with no parameters, start value is 0
    public Counter() {
        this(0);
    }

    // Method to get the current value
    public int value() {
        return value;
    }

    // Method to increase value by 1
    public void increase() {
        value++;
    }

    // Method to decrease value by 1
    public void decrease() {
        value--;
    }

    // Overloaded method to increase value by a specified amount
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    // Overloaded method to decrease value by a specified amount
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }

    @Override
    public String toString() {
        return "Counter value is: " + value;
    }
}

