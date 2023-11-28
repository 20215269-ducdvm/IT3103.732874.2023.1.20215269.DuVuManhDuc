package AimsProject.hust.soict.itep.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{


    public static int nbDigitalVideoDiscs = 0;

    /**
     * Getters for DigitalVideoDisc
     */

    public String getDirector() {
        return director;
    }
    public int getId() {
        return id;
    }
    public int getLength() {
        return length;
    }

    /**
     * Constructor methods for DigitalVideoDisc
     */

    public DigitalVideoDisc(String title) {
        super(title);
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }


    /**
     * Method to print out the information of a DigitalVideoDisc
     */
//    public void print() {
//        System.out.println(id + " - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + "$");
//    }
    @Override
    public void printInfo() {
        System.out.println("----------DVD----------");
        super.printInfo();
        System.out.println("Director: " + director);
        System.out.println("Length: " + length);
        System.out.println("----------------------");
    }
    public void play() {

        System.out.println("Playing DVD: " + this.getTitle());

        System.out.println("DVD length: " + this.getLength());

    }

}
