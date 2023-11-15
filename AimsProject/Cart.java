package AimsProject;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 2;

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
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
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
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                for(int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                System.out.println("The disc has been removed");
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
    public void printCart() {
        for(int i = 0; i < qtyOrdered; i++) {
           itemsOrdered[i].print();
        }
    }
}
