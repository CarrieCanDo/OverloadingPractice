package org.example;

public class CounterTest {
    public static void main(String[] args) {
        // Test default constructor
        Counter counter1 = new Counter();
        System.out.println("Default constructor: " + counter1);

        // Test constructor with start value
        Counter counter2 = new Counter(10);
        System.out.println("Constructor with start value 10: " + counter2);

        // Test increase and decrease methods
        counter1.increase();
        counter1.increase(5);
        counter1.decrease();
        counter1.decrease(2);
        System.out.println("Counter1 after increments and decrements: " + counter1);

        // Test edge case
        counter2.increase(-5); // Should not change
        counter2.decrease(-10); // Should not change
        System.out.println("Counter2 after invalid increase/decrease: " + counter2);
    }
}
