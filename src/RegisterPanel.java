import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegisterPanel extends JPanel {

    private JTextField input;
    private JLabel inputLabel;
    private JPanel inputPanel;
    private Register register = new Register();
    private PursePanel pursePanel;

    public RegisterPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.black);

        inputPanel = new JPanel();
        inputPanel.setPreferredSize(new Dimension(400, 100));
        inputPanel.setBackground(Color.blue);

        inputLabel = new JLabel("Enter amount of money:");
        inputLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        inputLabel.setForeground(Color.white);
        inputPanel.add(inputLabel);

        input = new JTextField();
        input.setPreferredSize(new Dimension(100, 20));
        input.setFont(new Font("Arial", Font.PLAIN, 12));
        input.addActionListener(new InputListener());
        inputPanel.add(input);

        pursePanel = new PursePanel();

        this.add(inputPanel);
        this.add(pursePanel);

        //ImageIcon img = new ImageIcon("images/penny.png");
        //label.setIcon(img);
    }
    private class InputListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double amt = Double.parseDouble(input.getText());
            input.setText("");
            pursePanel.purse = register.makeChange(amt);
            revalidate();
            repaint();
            System.out.println(pursePanel.purse);
        }
    }

}
