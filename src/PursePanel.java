import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class PursePanel extends JPanel {

    public Purse purse = new Purse();
    //private JPanel pursePanel = new JPanel();

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        this.setPreferredSize(new Dimension(500, 450));

        for (Map.Entry<Denomination, Integer> entry : purse.cash.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                JLabel purseLabel = new JLabel();
                purseLabel.setIcon(new ImageIcon(entry.getKey().img()));
                this.add(purseLabel);
            }
        }
        repaint();
    }
}
