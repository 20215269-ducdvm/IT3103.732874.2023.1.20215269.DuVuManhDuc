package AimsProject.hust.soict.itep.aims.store;

import AimsProject.hust.soict.itep.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    int qtyInStore = 0;
    /**
     * Add a media to the store if the store is not full
     * @param media the media to be added
     */
    public void addMedia(Media media) {
        if(qtyInStore < 100) {
            if (media instanceof CompactDisc) {

            }
            itemsInStore.add(media);
            qtyInStore++;
            System.out.println("The media has been added");
        } else {
            System.out.println("The store is almost full");
        }
    }
    /**
     * Remove a media from the store
     * @param media the media to be removed
     */
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            qtyInStore--;
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not in the store");
        }
    }
    /**
     * Search for a media in the store
     */
    public Media searchMedia(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle() != null)
            if (media.getTitle().equals(title)) {
                System.out.println("The media is in the store");
                return media;
            }
        }
        System.out.println("The media is not in the store");
        return null;
    }
    /**
     * Show the information of a media
     */
    public String showMediaInfo(Media media) {
       if (media instanceof Book) {
           return ((Book) media).toString();
       }
       else if (media instanceof CompactDisc) {
              return ((CompactDisc) media).toString();
       } else if(media instanceof DigitalVideoDisc) {
              return ((DigitalVideoDisc) media).toString();
       } else {
              return "The media is not in the store";
       }
    }
    /**
     * Show the information of all the medias in the store
     */
    public void showAllMediaInfo() {
        for (Media media : itemsInStore) {
            System.out.println(showMediaInfo(media));
        }
    }

}
