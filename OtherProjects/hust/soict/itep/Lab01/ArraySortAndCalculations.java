package OtherProjects.hust.soict.itep.Lab01;

import java.util.Arrays;

public class ArraySortAndCalculations {
    public static void main(String[] args) {
        double []arr = new double[]{1, 654, 123, 9, 324687, 456, 2};

        double sum = 0;
        for (double number: arr) {
            sum += number;
        }

        double average = sum / arr.length;

        Arrays.sort(arr);
        System.out.print("Array after sorting: ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Array's sum: ");
        System.out.println(sum);

        System.out.print("Array's Average: ");
        System.out.println(average);
    }
}
