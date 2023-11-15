package OtherProjects.hust.soict.itep.Lab01;
import javax.swing.JOptionPane;
public class SolveTwoVariableLinearSystem {
    public static void main(String args[]) {
        System.out.println("Du Vu Manh Duc - 20215269");
        String strNum1;
        String strNotification = "";

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input a11: ", "Input a11",
                JOptionPane.INFORMATION_MESSAGE);
        double a11 = Double.parseDouble(strNum1);

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input a12: ", "Input a12",
                JOptionPane.INFORMATION_MESSAGE);
        double a12 = Double.parseDouble(strNum1);

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input b1: ", "Input b1",
                JOptionPane.INFORMATION_MESSAGE);
        double b1 = Double.parseDouble(strNum1);

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input a21: ", "Input a21",
                JOptionPane.INFORMATION_MESSAGE);
        double a21 = Double.parseDouble(strNum1);

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input a22: ", "Input a22",
                JOptionPane.INFORMATION_MESSAGE);
        double a22 = Double.parseDouble(strNum1);

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input b2: ", "Input b2",
                JOptionPane.INFORMATION_MESSAGE);
        double b2 = Double.parseDouble(strNum1);

        double D = a11 * a22 - a21 * a12,
                D1 = b1 * a22 - b2 * a12,
                D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0)
                JOptionPane.showMessageDialog(null,"Infinite Solutions", "Solving linear" +
                        " system of equations", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "No Solutions", "Solving linear system of" +
                        "equations", JOptionPane.INFORMATION_MESSAGE);
        }   else {
            strNotification += "The system has one solution : (x, y) = (" + D1 / D + ", " + D2 / D + ")";
            JOptionPane.showMessageDialog(null, strNotification, "Solving linear system of equations",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
