package Lab02.AimsProject;

public class Aims {
    /**
     * Main method
     * @param args
     * Create a new Cart, create new DVDs and populate the cart with those DVDs.
     * Print the total cost of all items in the cart
     * Remove a DVD from the cart
     */
    public static void main(String args[]) {

        //Create a new cart
        Cart anOrder = new Cart();

        //Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);


        //Print all DVDs in the cart
        System.out.println("There are " + anOrder.getQtyOrdered() + " DVDs in the cart:");
        anOrder.printCart();

    }

}
