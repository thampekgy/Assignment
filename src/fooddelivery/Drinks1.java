/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Drinks1 extends JFrame implements ActionListener {

    private JButton jbtChoc1 = new JButton("Sirap : RM1.00");
    private JButton jbtChoc2 = new JButton("Bandung : RM1.70");
    private JButton jbtChoc3 = new JButton("Teh Tarik : RM1.20");
    private JButton jbtChoc4 = new JButton("Milo: RM1.90");
    private JButton jbtChoc5 = new JButton("Nescafe : RM1.70");
    private JButton jbtChoc6 = new JButton("Horlick : RM1.80");
    private JButton jbtBack = new JButton("Back");
    private JButton jbtExit = new JButton("Exit");
    private JLabel FoodLabelChoice = new JLabel("Choose your Foods : ");
    private ImageIcon Food1Image = new ImageIcon("src/mamak//sirap.jpeg");
    private ImageIcon Food2Image = new ImageIcon("src/mamak//bandung.jpeg");
    private ImageIcon Food3Image = new ImageIcon("src/mamak//tehtarik.jpeg");
    private ImageIcon Food4Image = new ImageIcon("src/mamak//milo.jpeg");
    private ImageIcon Food5Image = new ImageIcon("src/mamak//nescafe.jpeg");
    private ImageIcon Food6Image = new ImageIcon("src/mamak//horlick.jpeg");

    public Drinks1() {
        Container cont = getContentPane();
        cont.setLayout(new BorderLayout(5, 5));;
        cont.setBackground(Color.white);

        cont.add(FoodLabelChoice, BorderLayout.NORTH);

        JPanel pA = new JPanel(new GridLayout(2, 3, 5, 5));
        jbtChoc1.setIcon(Food1Image);
        pA.add(jbtChoc1);
        jbtChoc1.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbtChoc1.setHorizontalTextPosition(AbstractButton.CENTER);

        jbtChoc2.setIcon(Food2Image);
        pA.add(jbtChoc2);
        jbtChoc2.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbtChoc2.setHorizontalTextPosition(AbstractButton.CENTER);

        jbtChoc3.setIcon(Food3Image);
        pA.add(jbtChoc3);
        jbtChoc3.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbtChoc3.setHorizontalTextPosition(AbstractButton.CENTER);

        jbtChoc4.setIcon(Food4Image);
        pA.add(jbtChoc4);
        jbtChoc4.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbtChoc4.setHorizontalTextPosition(AbstractButton.CENTER);

        jbtChoc5.setIcon(Food5Image);
        pA.add(jbtChoc5);
        jbtChoc5.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbtChoc5.setHorizontalTextPosition(AbstractButton.CENTER);

        jbtChoc6.setIcon(Food6Image);
        pA.add(jbtChoc6);
        jbtChoc6.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbtChoc6.setHorizontalTextPosition(AbstractButton.CENTER);

        cont.add(pA, BorderLayout.CENTER);

        JPanel pB = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pB.setBackground(Color.white);
        pB.add(jbtBack);
        pB.add(jbtExit);
        cont.add(pB, BorderLayout.SOUTH);

        jbtChoc1.addActionListener(this);
        jbtChoc2.addActionListener(this);
        jbtChoc3.addActionListener(this);
        jbtChoc4.addActionListener(this);
        jbtChoc5.addActionListener(this);
        jbtChoc6.addActionListener(this);
        jbtBack.addActionListener(this);
        jbtExit.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jbtBack) {
            Open frame = new Open();
            frame.setTitle("Menu View");
            frame.setSize(600, 500);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setResizable(true);
            frame.setLocationRelativeTo(null);
            this.dispose();
        }
        if (e.getSource() == jbtExit) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to exit?", "Exit ", JOptionPane.YES_NO_OPTION);

            if (confirm == 0) {
                System.exit(0);
            }
        }

    }

    public static void main(String[] args) {
        Drinks1 frame = new Drinks1();
        frame.setTitle("Drinks");
        frame.setSize(550, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
