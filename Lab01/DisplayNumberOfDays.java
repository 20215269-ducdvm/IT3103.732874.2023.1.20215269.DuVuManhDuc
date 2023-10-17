package Lab01;
import java.util.Scanner;
import java.lang.String;
public class DisplayNumberOfDays {
    public static int getNumberOfMonth(String month) {
        return switch (month) {
            case "January", "Jan", "Jan.", "1" -> 1;
            case "February", "Feb", "Feb.", "2" -> 2;
            case "March", "Mar", "Mar.", "3" -> 3;
            case "April", "Apr", "Apr.", "4" -> 4;
            case "May", "5" -> 5;
            case "June", "Jun", "Jun.", "6" -> 6;
            case "July", "Jul", "Jul.", "7" -> 7;
            case "August", "Aug", "Aug.", "8" -> 8;
            case "September", "Sep", "Sep.", "9" -> 9;
            case "October", "Oct", "Oct.", "10" -> 10;
            case "November", "Nov", "Nov.", "11" -> 11;
            case "December", "Dec", "Dec.", "12" -> 12;
            default -> -1;
        };
    }
    public static boolean checkValidMonth(String month) {
        String[] monthStr = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        for(String i : monthStr) {
            if(i.equals(month) || i.substring(0, 3).equals(month) || i.valueOf(getNumberOfMonth(month)).equals(month)) {
                return true;
            }
        }
        return false;
    }
    public static int checkLeapYear(int year) {
        if((year % 4 == 0) && !(year % 100 == 0 && year % 400 != 0)) {
            return 1;
        }
        return 0;
    }
    public static int getNumberOfDays(int month, int year) {
        int []days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(checkLeapYear(year) == 0 && month == 2) {
            return 28;
        }
        return days[month - 1];
    }
    public static void main(String[] args) {
        System.out.println("Du Vu Manh Duc - 20215269");
        Scanner sc = new Scanner(System.in);
        int day, year;
        String month;
        // Input MONTH
        do {
            System.out.println("Enter month: ");
            month = sc.nextLine();
        } while (!checkValidMonth(month));
        // Input Year
        do {
            System.out.println("Enter year: ");
            year = sc.nextInt();
        } while (year <= 0);
        System.out.println("Number of days of month " + month + " in year " + year + " is: " + getNumberOfDays(getNumberOfMonth(month), year));


    }
}
