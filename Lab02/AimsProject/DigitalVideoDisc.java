package Lab02.AimsProject;

public class DigitalVideoDisc {
    private final String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    /**
     * Getters for DigitalVideoDisc
     */
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }

    /**
     * Constructor methods for DigitalVideoDisc
     */

    public DigitalVideoDisc(String title) {
        this.title = title;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    /**
     * Method to print out the information of a DigitalVideoDisc
     */
    public void print() {
        System.out.println("DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + "$");
    }



}
