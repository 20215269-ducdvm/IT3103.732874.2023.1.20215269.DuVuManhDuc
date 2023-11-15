package AimsProject.hust.soict.itep.test.store;
import AimsProject.hust.soict.itep.aims.disc.DigitalVideoDisc;
import AimsProject.hust.soict.itep.aims.store.Store;
public class StoreTest {
    public static void main(String args[]) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);;
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);;
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);;

        Store store = new Store();
        store.addDVD(dvd1); // The disc has been added
        store.addDVD(dvd2); // The disc has been added
        store.addDVD(dvd3); // The disc has been added
        store.removeDVD(dvd2); // The disc has been removed
        store.removeDVD(dvd2); // The disc is not in the store
    }
}
