package Lab02.AimsProject;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;

    /**
     * The list of ordered DVDs in the cart
     */
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    /**
     * The number of DVDs in the cart
     */
    private int qtyOrdered = 0;
    /**
     * Add a disc to the cart if the cart is not full
     * @param disc the disc to be added
     */
    /**
     * Getters for Cart
     */
    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            System.out.println("The disc " + itemsOrdered[qtyOrdered].getTitle() + " has been added");
            qtyOrdered++;
        }
        else {
            System.out.println("The cart is almost full");
        }
    }
    /**
     * Remove a disk from the cart if the disk is found
     * @param disc the disk to be removed
     */

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        String title = disc.getTitle();
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                for(int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                System.out.println("The disc " + title + " has been removed");
                return;
            }
        }
        System.out.println("The disc is not in the cart");
    }
    /**
     * Calculate the total cost of the cart
     * @return the total cost
     */
    public float totalCost() {
        float total = 0;
        for(int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    /**
     * Print all ordered items in the cart, along with their prices
     * Print the total price
     */
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.println(i + 1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    /**
     * Method to search for a DigitalVideoDisc with a given ID
     * @param id the given ID
     * @return true if the DigitalVideoDisc has the same ID as the given ID, false otherwise
     */
    boolean isMatchId(String id) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getId().equals(id)) {
                //print out the information of the DigitalVideoDisc
                itemsOrdered[i].print();
                return true;
            }
        }
        return false;
    }
    /**
     * Method to check if a DigitalVideoDisc has the same title as a given string
     * @param title the given string
     * @return true if the DigitalVideoDisc has the same title as the given string, false otherwise
     */
    boolean isMatchTitle(String title) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getTitle().equals(title)) {
                //print out the information of the DigitalVideoDisc
                itemsOrdered[i].print();
                return true;
            }
        }
        return false;
    }
}
