package OtherProjects.hust.soict.itep.Lab01;
import javax.swing.JOptionPane;
public class CalculateOperations {
    public static void main(String args[]) {
        System.out.println("Du Vu Manh Duc - 20215269");
        String strNum1, strNum2;
        String strNotification = "";

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);


        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = Math.abs(num1 - num2);
        double product = num1 * num2;
        double quotient = num1 / num2;
        strNotification += "Sum: " + sum + ", Difference: " + difference + ", Product: " + product
                            + ", Quotient: " + quotient;
        JOptionPane.showMessageDialog(null, strNotification,
                "Calculate Operations", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
