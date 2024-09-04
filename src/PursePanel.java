import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class PursePanel extends JPanel {

    public Purse purse = new Purse();
    public JPanel resetDisplayPanel;
    //private JPanel pursePanel = new JPanel();

    public PursePanel() {
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.cyan);
        resetDisplayPanel = new JPanel();
        resetDisplayPanel.setBackground(Color.cyan);
        this.add(resetDisplayPanel);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        resetDisplayPanel = new JPanel();
        resetDisplayPanel.setBackground(Color.cyan);


        for (Map.Entry<Denomination, Integer> entry : purse.cash.entrySet()) {
            for (int i = 1; i <= entry.getValue(); i++) {
                JLabel purseLabel = new JLabel();
                ImageIcon img = new ImageIcon(entry.getKey().img());
                img.setImage(img.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)); // Image itself
                purseLabel.setIcon(img);
                purseLabel.setBounds(50, 50, 30, 30); // JPanel that contains image
                resetDisplayPanel.add(purseLabel);
                this.add(resetDisplayPanel);
            }
        }
    }
}
