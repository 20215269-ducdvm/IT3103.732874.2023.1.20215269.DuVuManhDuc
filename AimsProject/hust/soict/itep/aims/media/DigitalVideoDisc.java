package AimsProject.hust.soict.itep.aims.media;

public class DigitalVideoDisc extends Disc{


    public static int nbDigitalVideoDiscs = 0;


    /**
     * Getters for DigitalVideoDisc
     */

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }

    /**
     * Constructor methods for DigitalVideoDisc
     */

    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }


    /**
     * Method to print out the information of a DigitalVideoDisc
     */
    public void print() {
        System.out.println(id + " - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + "$");
    }


}
