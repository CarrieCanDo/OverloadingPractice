package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TvShowList {

    public static void main(String[] args) {
        List<TvShow> tvShows = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name of the show: ");
            String showName = scanner.nextLine();

            if (showName.isEmpty()) {
                tvShows.add(new TvShow());
                break;
            }

            System.out.println("How many episodes? ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.println("What is the genre? ");
            String genre = scanner.nextLine();

            TvShow tvShow = new TvShow(showName, numberOfEpisodes, genre);
            tvShows.add(tvShow);
        }

        System.out.println();
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
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
