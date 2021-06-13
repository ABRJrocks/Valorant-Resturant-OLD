import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI()
    {
        frame = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("Click Here");
        button.addActionListener(this);
        label = new JLabel("Number of Clicks:  0");


        panel.setBorder(BorderFactory.createEmptyBorder(75 ,150,75,150));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        System.out.println("Lined added");
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks:  " +count);
    }
}
