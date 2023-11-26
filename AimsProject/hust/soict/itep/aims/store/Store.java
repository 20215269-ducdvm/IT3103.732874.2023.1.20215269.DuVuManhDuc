package AimsProject.hust.soict.itep.aims.store;

import AimsProject.hust.soict.itep.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    int qtyInStore = 0;
    /**
     * Add a media to the store if the store is not full
     * @param media the media to be added
     */
    public void addMedia(Media media) {
        if(qtyInStore < 100) {
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
}
