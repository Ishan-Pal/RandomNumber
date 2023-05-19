import java.awt.event.*;
import javax.swing.*;
public class RandomNumber extends JFrame implements ActionListener {
    private JLabel numberLabel;
    public RandomNumber() {
        setTitle("Random Number Label");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        JPanel panel = new JPanel();
        add(panel);
        numberLabel = new JLabel();
        updateNumber();
        panel.add(numberLabel);
        JButton button = new JButton("Generate Another Num");
        button.addActionListener(this);
        panel.add(button);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        updateNumber();
    }
    private void updateNumber() {
        int randomNumber = (int)(Math.random() * 10) + 1;
        numberLabel.setText(Integer.toString(randomNumber));
    }
    public static void main(String[] args) {
        new RandomNumber();
    }
}
