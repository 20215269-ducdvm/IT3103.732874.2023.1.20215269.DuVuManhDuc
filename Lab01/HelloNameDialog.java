package Lab01;
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String args[]) {
        System.out.println("Du Vu Manh Duc - 20215269");
        String result;
        result = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
        System.exit(0);
    }
}
