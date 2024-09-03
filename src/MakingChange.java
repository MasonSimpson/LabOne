import java.awt.*;
import javax.swing.*;

public class MakingChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new RegisterPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
