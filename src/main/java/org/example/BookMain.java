package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Enter the title of the book: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                books.add(new Book());
                break;
            }

            System.out.print("Enter the number of pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        if (choice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
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
