package OtherProjects.hust.soict.itep.Lab01;
import javax.swing.JOptionPane;
public class SolveSecondDegreeEquation {
    public static void main(String args[]) {
        System.out.println("Du Vu Manh Duc - 20215269");
        String strNum1;
        String strNotification;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input a: ", "Input a",
                JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strNum1);

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input b: ", "Input b",
                JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(strNum1);

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input c: ", "Input c",
                JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(strNum1);

        if (a == 0) {
            if(b == 0) {
                if(c == 0)
                    JOptionPane.showMessageDialog(null,
                            "The equation has infinite solutions",
                            "Solving quadratic equation", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null,
                            "The equation has no solutions",
                            "Solving quadratic equation", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                strNotification = "The equation has one solution: x = " + (-c) / b;
                JOptionPane.showMessageDialog(null,
                        strNotification,
                        "Solving quadratic equation", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            double d = b * b - 4 * a * c;
            if(d < 0)
                JOptionPane.showMessageDialog(null,
                        "The equation has no solutions",
                        "Solving quadratic equation", JOptionPane.INFORMATION_MESSAGE);
            if(d == 0) {
                strNotification = "The equation has one solution: x = " + (-b) / (2 * a);
                JOptionPane.showMessageDialog(null,
                        strNotification,
                        "Solving quadratic equation", JOptionPane.INFORMATION_MESSAGE);
            }
            if(d > 0) {
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);

                strNotification = "The equation has two solutions: x1 = " + x1 + ", x2 = " + x2;
                JOptionPane.showMessageDialog(null,
                        strNotification,
                        "Solving quadratic equation", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        System.exit(0);
    }
}
