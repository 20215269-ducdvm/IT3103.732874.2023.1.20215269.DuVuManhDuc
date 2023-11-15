package Lab02.AimsProject.hust.soict.itep.test.disc;

import Lab02.AimsProject.hust.soict.itep.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    // TODO auto-generated method stub
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        /*
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());

        changeTitle(cinderellaDVD, jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        */
    }

    /**
     * Swap the two dvds
     * @param dvd1 the first dvd
     * @param dvd2 the second dvd
     */
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String oldTitle = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(oldTitle);
    }
    /*
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    */

}
