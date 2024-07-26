package org.example;

public class CounterTest {
    public static void main(String[] args) {
        // Create Counter objects using different constructors
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        // Display initial values
        System.out.println("Initial value of counter1: " + counter1.value());
        System.out.println("Initial value of counter2: " + counter2.value());

        // Use increase and decrease methods
        counter1.increase();
        counter2.decrease();

        // Display values after incrementing and decrementing
        System.out.println("Value of counter1 after increase: " + counter1.value());
        System.out.println("Value of counter2 after decrease: " + counter2.value());

        // Use overloaded increase and decrease methods
        counter1.increase(5);
        counter2.decrease(2);

        // Display values after increasing and decreasing by specific amounts
        System.out.println("Value of counter1 after increasing by 5: " + counter1.value());
        System.out.println("Value of counter2 after decreasing by 2: " + counter2.value());

        // Test with negative values for increase and decrease
        counter1.increase(-3); // should not change the value
        counter2.decrease(-4); // should not change the value

        // Display values after attempting to increase/decrease by negative values
        System.out.println("Value of counter1 after attempting to increase by -3: " + counter1.value());
        System.out.println("Value of counter2 after attempting to decrease by -4: " + counter2.value());
    }
}
