import javax.swing.JOptionPane;
import java.util.Scanner;
public class try6 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("name pls");
        JOptionPane.showMessageDialog(null,"hello " +name);

    int age = Integer.parseInt(JOptionPane.showInputDialog("your age pls"));
    JOptionPane.showMessageDialog(null, "you are "+age+" years old");
    }
}
