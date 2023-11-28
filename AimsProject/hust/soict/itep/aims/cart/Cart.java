package AimsProject.hust.soict.itep.aims.cart;

import AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;
import AimsProject.hust.soict.itep.aims.media.Media;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;

    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    /**
     * Add media to the cart
     */

    public void addMedia(Media media) {

        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            if (itemsOrdered.contains(media)) {
                System.out.println("The media is already in the cart");
                return;
            }
            itemsOrdered.add(media);
            System.out.println("The media has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    /**
     * Remove media from the cart
     */
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not in the cart");
        }
    }

    /**
     * Calculate the total cost of the cart
     *
     * @return the total cost
     */
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public int displayNumberOfDvds() {
        int dvdNumber = 0;
        for (Media media : itemsOrdered) {
            if (media instanceof DigitalVideoDisc)
                dvdNumber++;
        }
        return dvdNumber;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        for (Media media : itemsOrdered) {
            media.printInfo();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void emptyCart() {
        itemsOrdered.clear();
    }

    /**
     * Filter the medias in the cart by id
     */
    public List<Media> filterById(int id) {
        List<Media> filteredList = new ArrayList<>();
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                filteredList.add(media);
            }
        }
        return filteredList;
    }

    /**
     * Filter the medias in the cart by title
     */
    public List<Media> filterByTitle(String title) {
        List<Media> filteredList = new ArrayList<>();
        for (Media media : itemsOrdered) {
            if (media.getTitle() != null)
                if (media.getTitle().equals(title)) {
                    filteredList.add(media);
                }
        }
        return filteredList;
    }

    /**
     * Sort the medias in the cart by title
     */
    public List<Media> sortByTitle() {
        List<Media> sortedList = new ArrayList<>(itemsOrdered);
        sortedList.sort(Media.COMPARE_BY_TITLE_COST);
        return sortedList;
    }

    /**
     * Sort the medias in the cart by cost
     */
    public List<Media> sortByCost() {
        List<Media> sortedList = new ArrayList<>(itemsOrdered);
        sortedList.sort(Media.COMPARE_BY_COST_TITLE);
        return sortedList;
    }
}