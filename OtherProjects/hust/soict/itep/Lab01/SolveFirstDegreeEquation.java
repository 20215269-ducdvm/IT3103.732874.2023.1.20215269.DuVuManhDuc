package OtherProjects.hust.soict.itep.Lab01;
import javax.swing.JOptionPane;
public class SolveFirstDegreeEquation {
    public static void main(String args[]) {
        System.out.println("Du Vu Manh Duc - 20215269");
        String strNum1, strNum2;
        String strNotification = "";

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input a: ", "Input a",
                JOptionPane.INFORMATION_MESSAGE);


        strNum2 = JOptionPane.showInputDialog(null,
                "Please input b: ", "Input b",
                JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);
        if(a == 0) {
            if(b == 0) JOptionPane.showMessageDialog(null,"The equation has " +
                    "infinite solutions.", "Solving first degree equation", JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(null, "The equation has no solutions."
                    ,"Solving first degree equation", JOptionPane.INFORMATION_MESSAGE);
        } else {
            strNotification = "The equation has 1 solution: " + (double)((-b) / a);
            JOptionPane.showMessageDialog(null, strNotification, "Solving first degree equation",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
