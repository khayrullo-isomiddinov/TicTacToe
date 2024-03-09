package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Settings extends JFrame implements ActionListener {
    private JButton chooseColorButton;
    private JPanel colorPanel;
    private Color selectedColor;

    public Settings() {
        setTitle("Settings");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        chooseColorButton = new JButton("Choose color");
        chooseColorButton.setBackground(Color.WHITE);

        panel.add(chooseColorButton);
        panel.add(colorPanel);

        add(panel);
        setVisible(true);
    }

    @Override
        public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseColorButton) {
            selectedColor = JColorChooser.showDialog(this, "Choose Color", selectedColor);
            if (selectedColor != null) {
                colorPanel.setBackground(selectedColor);
            }
        }
    }


    public static void main(String[] args) {
        new Settings();
    }
}