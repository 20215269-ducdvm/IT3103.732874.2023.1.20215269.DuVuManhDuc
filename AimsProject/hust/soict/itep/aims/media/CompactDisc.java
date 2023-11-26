package AimsProject.hust.soict.itep.aims.media;

import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }
    public CompactDisc() {
        super();
    }
    public CompactDisc(String artist) {
        super();
        this.artist = artist;
    }
    public CompactDisc(String artist, List<Track> tracks) {
        this(artist);
        this.tracks = tracks;
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



}
