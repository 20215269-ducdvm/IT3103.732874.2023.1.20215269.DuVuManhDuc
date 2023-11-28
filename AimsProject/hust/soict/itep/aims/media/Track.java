package AimsProject.hust.soict.itep.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title) {
        this.title = title;
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public void play() {

        System.out.println("Playing Track: " + this.getTitle());

        System.out.println("Track length: " + this.getLength());

    }
    public void printTrackInfo() {
        System.out.println("Track: ");
        System.out.println("Title: " + title);
        System.out.println("Length: " + length);
    }
    @Override
    public boolean equals(Object o) {
        Track track = (Track) o;
        return track.getTitle().equals(this.getTitle()) && track.getLength() == this.getLength();
    }
}
