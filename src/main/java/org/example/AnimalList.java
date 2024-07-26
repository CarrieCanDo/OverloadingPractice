package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalList {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Please enter a name (or press Enter to use default): ");
            String animalName = scanner.nextLine();

            if (animalName.isEmpty()) {
                animals.add(new Animal());
                break;
            }

            System.out.print("Is it a dog? Yes or no: ");
            String isDogInput = scanner.nextLine();
            boolean isDog = isDogInput.equalsIgnoreCase("yes");

            Animal animal;
            if (animalName.equalsIgnoreCase("unknown")) {
                animal = new Animal();
            } else {
                animal = new Animal(animalName, isDog);
            }
            animals.add(animal);
        }

        System.out.println();
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Example usage of Counter class
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);

        counter1.increase();
        counter2.decrease(3);

        System.out.println(counter1);
        System.out.println(counter2);

        scanner.close();
    }
}
