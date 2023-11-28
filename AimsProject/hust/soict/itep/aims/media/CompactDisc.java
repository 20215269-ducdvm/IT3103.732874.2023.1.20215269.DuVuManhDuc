package AimsProject.hust.soict.itep.aims.media;

import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String artist) {
        super();
        this.artist = artist;
    }
    public CompactDisc(String title, String category, String artist, String director, int length, float cost) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }
    public void addTrack(Track track) {
        if(tracks.contains(track))
            System.out.println("Track already exists.");
        else {
            tracks.add(track);
            System.out.println("Track added");
        }
    }

    public void removeTrack(Track track) {
        if(tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed");
        }
        else
            System.out.println("Track not found");
    }

    public int getLength() {
        int totalLength = 0;
        for(Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    public void printAllTracks() {
        for (Track track: tracks) {
            track.printTrackInfo();
        }
    }
    public void play() {
        System.out.println("There are " + tracks.size() + " tracks in this CD");
        for(Track track : tracks) {
            track.play();
        }
    }
    @Override
    public void printInfo() {
        System.out.println("----------CD----------");
        super.printInfo();
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Director: " + this.getDirector());
        System.out.println("Length: " + this.getLength());
        System.out.println("Cost: " + this.getCost());
        System.out.println("All CD's tracks: ");
        this.printAllTracks();
        System.out.println("----------------------");
    }
}
