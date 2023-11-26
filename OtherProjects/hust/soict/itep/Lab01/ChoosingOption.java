package Lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String args[]) {
        System.out.println("Du Vu Manh Duc - 20215269");
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null,
                "You have chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));

        String[] options = {"Yes", "No"};
        option = JOptionPane.showOptionDialog(null, "Do you want to continue?",
                "Confirmation",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        JOptionPane.showMessageDialog(null,
                "You have chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }

}
