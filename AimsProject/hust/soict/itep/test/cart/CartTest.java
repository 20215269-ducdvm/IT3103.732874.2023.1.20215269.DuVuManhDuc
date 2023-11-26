package AimsProject.hust.soict.itep.test.cart;

import AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;
import AimsProject.hust.soict.itep.aims.cart.Cart;
public class CartTest {
    public static void main (String[] args) {

        //Create a new cart
        Cart cart = new Cart();

        //Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        //Test the print method
        cart.printCart();
        //To-do: test the search methods here
        //Search for a DVD with the ID "DVD1"
        System.out.println("Search for a DVD with the ID \"DVD1\":");
        if (!cart.isMatchId("DVD1"))
            System.out.println("Not found");


        //Search for a DVD with the title "The Lion King"
        System.out.println("Search for a DVD with the title \"The Lion King\":");
        if (!cart.isMatchTitle("The Lion King"))
            System.out.println("Not found");

        //Search for a DVD with the title "Aladi"
        System.out.println("Search for a DVD with the title \"Aladi\":");
        if (!cart.isMatchTitle("Aladi"))
            System.out.println("Not found");
    }

}