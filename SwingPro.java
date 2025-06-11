import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingPro {

    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Button not clicked");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        panel.add(button);
        panel.add(label);
        frame.add(panel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}