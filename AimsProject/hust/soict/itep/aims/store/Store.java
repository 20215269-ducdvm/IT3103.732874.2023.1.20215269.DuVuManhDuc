package AimsProject.hust.soict.itep.aims.store;

import AimsProject.hust.soict.itep.aims.media.Media;

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
    public void showMediaInfo(Media media) {
        System.out.println("Title: " + media.getTitle());
        System.out.println("Category: " + media.getCategory());
        System.out.println("Cost: " + media.getCost());
        System.out.println("ID: " + media.getId());
    }
    /**
     * Show the information of all the medias in the store
     */
    public void showAllMediaInfo() {
        for (Media media : itemsInStore) {
            showMediaInfo(media);
        }
    }
    /**
     * Filter the medias in the store by id
     */
    public List<Media> filterById(int id) {
        List<Media> filteredList = new ArrayList<>();
        for (Media media : itemsInStore) {
            if (media.getId() == id) {
                filteredList.add(media);
            }
        }
        return filteredList;
    }
    /**
     * Filter the medias in the store by title
     */
    public List<Media> filterByTitle(String title) {
        List<Media> filteredList = new ArrayList<>();
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                filteredList.add(media);
            }
        }
        return filteredList;
    }
    /**
     * Sort the medias in the store by title
     */
    public List<Media> sortByTitle() {
        List<Media> sortedList = new ArrayList<>(itemsInStore);
        sortedList.sort(Media.COMPARE_BY_TITLE_COST);
        return sortedList;
    }
    /**
     * Sort the medias in the store by cost
     */
    public List<Media> sortByCost() {
        List<Media> sortedList = new ArrayList<>(itemsInStore);
        sortedList.sort(Media.COMPARE_BY_COST_TITLE);
        return sortedList;
    }
}
