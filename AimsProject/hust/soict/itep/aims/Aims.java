package AimsProject.hust.soict.itep.aims;

import AimsProject.hust.soict.itep.aims.media.Book;
import AimsProject.hust.soict.itep.aims.media.CompactDisc;
import AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;
import AimsProject.hust.soict.itep.aims.media.Media;
import AimsProject.hust.soict.itep.aims.store.Store;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
    public static void showMenu() {

        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static void main(String args[]) {
        Store store = new Store();
        while (true) {
            int option;
            showMenu();
            option = new Scanner(System.in).nextInt();
            if (option == 1) {
                while (true) {
                    System.out.println("List of medias in store: ");
                    store.showAllMediaInfo();
                    storeMenu();
                    int option1;
                    option1 = new Scanner(System.in).nextInt();
                    if (option1 == 1) {
                        System.out.println("Enter the title of the media: ");
                        String title = new Scanner(System.in).nextLine();
                        Media media = store.searchMedia(title);
                        if (media != null) {
                            store.showMediaInfo(media);
                        }
                        mediaDetailsMenu();
                        int option2;
                        option2 = new Scanner(System.in).nextInt();
                        if (option2 == 1) {
                            store.addMedia(media);
                        }
                        if (option2 == 2) {
                            if (media instanceof DigitalVideoDisc) {
                                DigitalVideoDisc dvd = (DigitalVideoDisc) media;
                                dvd.play();
                            } else if (media instanceof CompactDisc) {
                                CompactDisc cd = (CompactDisc) media;
                                cd.play();
                            }
                        }
                        if (option2 == 0) {
                            break;
                        }
                    }
                    if (option1 == 2) {
                        System.out.println("List of medias in store: ");
                        store.showAllMediaInfo();
                        System.out.println("Enter the title of the media: ");
                        String title1 = new Scanner(System.in).nextLine();
                        Media media1 = store.searchMedia(title1);
                        if (media1 != null) {
                            store.addMedia(media1);
                            if (media1 instanceof DigitalVideoDisc) {
                                DigitalVideoDisc dvd = (DigitalVideoDisc) media1;
                                dvd.play();
                            } else if (media1 instanceof CompactDisc) {
                                CompactDisc cd = (CompactDisc) media1;
                                cd.play();
                            }
                        }
                    }

                    if (option1 == 3) {
                        System.out.println("List of medias in store: ");
                        store.showAllMediaInfo();
                        System.out.println("Enter the title of the media: ");
                        String title2 = new Scanner(System.in).nextLine();
                        Media media2 = store.searchMedia(title2);
                        if (media2 != null) {
                            if (media2 instanceof DigitalVideoDisc) {
                                DigitalVideoDisc dvd = (DigitalVideoDisc) media2;
                                dvd.play();
                            } else if (media2 instanceof CompactDisc) {
                                CompactDisc cd = (CompactDisc) media2;
                                cd.play();
                            }
                        }
                    }
                    if (option1 == 4) {
                        System.out.println("List of medias in store: ");
                        store.showAllMediaInfo();
                    }
                    if (option1 == 0)
                        break;
                }
            }
            if (option == 2) {
                System.out.println("List of medias in store: ");
                store.showAllMediaInfo();
                // Asks if user wants to add or remove media
                System.out.println("Do you want to add or remove a media? (1 for add, 2 for remove)");
                int option2 = new Scanner(System.in).nextInt();
                if (option2 == 1) {
                    System.out.println("Enter the title of the media: ");
                    String title = new Scanner(System.in).nextLine();
                    Media media = store.searchMedia(title);
                    if (media != null) {
                        store.addMedia(media);
                    }
                }
                if (option2 == 2) {
                    System.out.println("Enter the title of the media: ");
                    String title = new Scanner(System.in).nextLine();
                    Media media = store.searchMedia(title);
                    if (media != null) {
                        store.removeMedia(media);
                    }
                }
            }

            if(option == 3)
                while (true) {
                    cartMenu();
                    int option3 = new Scanner(System.in).nextInt();
                    //filter by id and by title
                    if (option3 == 1) {
                        System.out.println("Do you want to filter by id or by title? (1 for id, 2 for title)");
                        int option4 = new Scanner(System.in).nextInt();
                        if (option4 == 1) {
                            System.out.println("Enter the id: ");
                            int id = new Scanner(System.in).nextInt();
                            List<Media> filteredList = store.filterById(id);
                            for (Media media : filteredList) {
                                store.showMediaInfo(media);
                            }
                        }
                        if (option4 == 2) {
                            System.out.println("Enter the title: ");
                            String title = new Scanner(System.in).nextLine();
                            List<Media> filteredList = store.filterByTitle(title);
                            for (Media media : filteredList) {
                                store.showMediaInfo(media);
                            }
                        }
                    }
                    //sort by title and by cost
                    if (option3 == 2) {
                        System.out.println("Do you want to sort by title or by cost? (1 for title, 2 for cost)");
                        int option5 = new Scanner(System.in).nextInt();
                        if (option5 == 1) {
                            List<Media> sortedList = store.sortByTitle();
                            for (Media media : sortedList) {
                                store.showMediaInfo(media);
                            }
                        }
                        if (option5 == 2) {
                            List<Media> sortedList = store.sortByCost();
                            for (Media media : sortedList) {
                                store.showMediaInfo(media);
                            }
                        }
                    }
                    //remove media from cart
                    if (option3 == 3) {
                        System.out.println("Enter the title of the media: ");
                        String title = new Scanner(System.in).nextLine();
                        Media media = store.searchMedia(title);
                        if (media != null) {
                            store.removeMedia(media);
                        }
                    }
                    //play a media
                    if (option3 == 4) {
                        System.out.println("Enter the title of the media: ");
                        String title = new Scanner(System.in).nextLine();
                        Media media = store.searchMedia(title);
                        if (media != null) {
                            if (media instanceof DigitalVideoDisc) {
                                DigitalVideoDisc dvd = (DigitalVideoDisc) media;
                                dvd.play();
                            } else if (media instanceof CompactDisc) {
                                CompactDisc cd = (CompactDisc) media;
                                cd.play();
                            }
                        }
                    }
                    //place order
                    if (option3 == 5) {
                        System.out.println("Order created");

                    }
                    if (option3 == 0) {
                        break;
                    }
                }
            if (option == 0) {
                break;
            }
        }
    }
}
