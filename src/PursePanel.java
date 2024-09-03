import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class PursePanel extends JPanel {

    public Purse purse = new Purse();
    private JPanel pursePanel = new JPanel();
    private JLabel purseLabel = new JLabel();

    public void paintComponent(Graphics g) {
        ImageIcon penny = new ImageIcon("images/penny.png");
        ImageIcon nickel = new ImageIcon("images/nickel.png");
        ImageIcon dime = new ImageIcon("images/dime.png");
        ImageIcon quarter = new ImageIcon("images/quarter.png");
        ImageIcon oneNote = new ImageIcon("images/one_note.png");
        ImageIcon fiveNote = new ImageIcon("images/five_note.png");
        ImageIcon tenNote = new ImageIcon("images/ten_note.png");
        ImageIcon twentyNote = new ImageIcon("images/twenty_note.png");
        ImageIcon fiftyNote = new ImageIcon("images/fifty_note.png");
        ImageIcon hundredNote = new ImageIcon("images/hundred_note.png");

        pursePanel.setPreferredSize(new Dimension(500, 450));

        for (Map.Entry<Denomination, Integer> entry : purse.cash.entrySet()) {
            for (int i = 1; i <= entry.getValue(); i++) {
                if (entry.getKey() == Denomination.hundredNote) {

                }
            }
        }
    }
}
