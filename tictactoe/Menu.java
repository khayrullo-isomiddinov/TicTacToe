package tictactoe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Menu extends JFrame implements ActionListener {
    private JButton startButton;
    private JButton settingsButton;
    private JButton quitButton;

    public Menu() {
        setTitle("Menu");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        startButton = new JButton("Start");
        settingsButton = new JButton("Settings");
        quitButton = new JButton("Quit");

        startButton.addActionListener(this);
        settingsButton.addActionListener(this);
        quitButton.addActionListener(this);

        panel.add(startButton);
        panel.add(settingsButton);
        panel.add(quitButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            new TicTacToe();
            dispose(); // Close the menu window
        } else if (e.getSource() == settingsButton) {
            // Handle Settings button action
            new Settings();
        } else if (e.getSource() == quitButton) {
            // Handle Quit button action
            System.exit(0); // Exit the application
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
    }
}
