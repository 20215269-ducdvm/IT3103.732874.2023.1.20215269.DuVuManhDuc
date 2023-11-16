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
     * Add a list of discs to the cart if the cart is not full
     * @param dvdList list of discs to be added
     */
    /*
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        if(qtyOrdered + dvdList.length <= MAX_NUMBER_ORDERED) {
            for(int i = 0; i < dvdList.length; i++) {
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
            }
            System.out.println("The discs have been added");
        }
        else {
            System.out.println("The cart is almost full");
        }
    }
*/
    /**
     * Add a list of discs (arbitrary number) to the cart if the cart is not full
     * @param dvds discs to be added
     */

    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        if(qtyOrdered + dvds.length <= MAX_NUMBER_ORDERED) {
            for(int i = 0; i < dvds.length; i++) {
                itemsOrdered[qtyOrdered] = dvds[i];
                qtyOrdered++;
            }
            System.out.println("The discs have been added");
        }
        else {
            System.out.println("The cart is almost full");
        }
    }
    /**
     * Add two discs to the cart if the cart is not full
     * @param dvd1 the first disc to be added
     * @param dvd2 the second disc to be added
     */
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(qtyOrdered + 2 <= MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The discs have been added");
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
    public void printCart() {
        for(int i = 0; i < qtyOrdered; i++) {
           itemsOrdered[i].print();
        }
    }
}
