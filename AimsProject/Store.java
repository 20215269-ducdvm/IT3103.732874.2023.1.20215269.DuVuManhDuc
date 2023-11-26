public class Store {
    DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    int qtyInStore = 0;
    /**
     * Add a disc to the store if the store is not full
     * @param disc the disc to be added
     */
    public void addDVD(DigitalVideoDisc disc) {
        if(qtyInStore < 100) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The disc has been added");
        }
        else {
            System.out.println("The store is almost full");
        }
    }
    /**
     * Remove a disk from the store if the disk is found
     * @param disc the disk to be removed
     */
    public void removeDVD(DigitalVideoDisc disc) {
        for(int i = 0; i < qtyInStore; i++) {
            if(itemsInStore[i].getTitle().equals(disc.getTitle())) {
                for(int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                qtyInStore--;
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("The disc is not in the store");
    }
}
