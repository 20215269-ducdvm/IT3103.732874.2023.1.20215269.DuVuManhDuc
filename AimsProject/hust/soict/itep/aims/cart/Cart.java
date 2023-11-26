package AimsProject.hust.soict.itep.aims.cart;

import AimsProject.hust.soict.itep.aims.media.Media;

import java.util.ArrayList;


public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;

    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    /**
     * Add media to the cart
     */

    public void addMedia(Media media) {

        if(itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            if(itemsOrdered.contains(media)) {
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
        if(itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not in the cart");
        }
    }
    /**
     * Calculate the total cost of the cart
     * @return the total cost
     */
    public float totalCost() {
      float total = 0;
      for(Media media : itemsOrdered) {
        total += media.getCost();
      }
      return total;
    }
//    public void printCart() {
//        System.out.println("***********************CART***********************");
//        for(Media media : itemsOrdered) {
//            media.print();
//        }
//        System.out.println("Total cost: " + totalCost());
//        System.out.println("***************************************************");
//    }
//
//    public boolean isMatchId(int id) {
//        for(int i = 0; i < qtyOrdered; i++) {
//            if(itemsOrdered[i].getId() == id) {
//                itemsOrdered[i].print();
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean isMatchTitle(String theLionKing) {
//        for(int i = 0; i < qtyOrdered; i++) {
//            if(itemsOrdered[i].getTitle().equals(theLionKing)) {
//                itemsOrdered[i].print();
//                return true;
//            }
//        }
//        return false;
//    }
}
