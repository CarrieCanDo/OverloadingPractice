package org.example;

public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor with all parameters
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Overloaded constructor with only showName
    public TvShow(String showName) {
        this(showName, 0, "Unknown");
    }

    // Overloaded constructor with no parameters
    public TvShow() {
        this("Unknown", 0, "Unknown");
    }

    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + showName + " with " + numberOfEpisodes + " number of episodes. The genre is " + genre;
    }
}
