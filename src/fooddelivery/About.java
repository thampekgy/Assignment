/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.*;

public class About extends JFrame implements ActionListener {

    private JTextArea jtaIntro2 = new JTextArea("\n\t\tFastest Delivery Service" + "\n\t\t(A SUBSIDARY OF CKK SDN BHD)\n");

    private JTextArea jtaIntro = new JTextArea("\t\t\tFastest Delivery SDN BHD,\n"
            + "\t\tFastest Delivery is most convenient online food ordering site.\n"
            + "\t\tIt connects people with the best restaurants around\n"
            + "\t\tthem.Fastest Delivery has the widest reach in Malaysia\n"
            + "\t\tWe believe food is pleasure and food ordering should be\n"
            + "\t\tfast and definitely a fun experience.\n");

    private JButton jbBack = new JButton("Back");
    private JButton jbExit = new JButton("Exit");
    private JMenuItem jmiExit, jmiAbout;

    public About() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout(2, 1));
        container.setBackground(Color.LIGHT_GRAY);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 1));

        jtaIntro2.setEditable(false);
        jtaIntro2.setFont(new Font("Serif", Font.BOLD, 17));

        jtaIntro.setEditable(false);
        jtaIntro.setFont(new Font("Serif", Font.BOLD, 16));

        p1.add(jtaIntro2);
        p1.add(jtaIntro);

        container.add(p1, BorderLayout.CENTER);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 4));
        p2.add(new JLabel());
        p2.add(jbBack);
        p2.add(jbExit);
        p2.add(new JLabel());
        p2.setBackground(Color.PINK);

        container.add(p2, BorderLayout.SOUTH);

        JMenuBar jmb = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        jmb.add(fileMenu);
        fileMenu.add(jmiExit = new JMenuItem("Exit"));

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic('H');
        jmb.add(helpMenu);
        helpMenu.add(jmiAbout = new JMenuItem("About Us"));

        container.add(jmb, BorderLayout.NORTH);

        jbBack.addActionListener(this);
        jbExit.addActionListener(this);
        jmiExit.addActionListener(this);
        jmiAbout.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jbBack) {
            FoodDelivery frame = new FoodDelivery();
            frame.setTitle("MAIN ");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setVisible(true);
            frame.setResizable(true);
            frame.setLocationRelativeTo(null);
            this.dispose();
        }

        if (e.getSource() == jmiExit) {

            int exit = JOptionPane.showConfirmDialog(null, "Confirm Exit?", "EXIT", JOptionPane.YES_NO_OPTION);

            if (exit == 0) {
                System.exit(0);
            } else {
            }

        }
        if (e.getSource() == jmiAbout) {

            JOptionPane.showMessageDialog(null, "Fastest Delivery"
                    + "\n\nAddress: PV15," + "\n Lt L3-18A(P),Level 3," + "\n Setapak Central,"
                    + "\n Jalan Danau, Setapak City" + "\n 43300 Genting Klang, Selangor." + "\n 03-89386655"
                    + "", "About Us", JOptionPane.INFORMATION_MESSAGE);

        }

        if (e.getSource() == jbExit) {
            int exit = JOptionPane.showConfirmDialog(null, "Confirm Exit?", "EXIT", JOptionPane.YES_NO_OPTION);

            if (exit == 0) {
                System.exit(0);
            } else {
            }
        }

    }

    public static void main(String[] args) {
        About frame = new About();
        frame.setTitle("About");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
