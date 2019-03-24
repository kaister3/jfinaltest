package com.company;
import java.awt.*;
import java.awt.event.ActionListener;
import java.math.*;
import java.io.*;
import javax.swing.*;

///
public class Game extends JPanel {

    public static void main(String[] args){
        Game sudoku = new Game();
        sudoku.createGUI();
    }

    public void createGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("Hello swing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu menu1 = new JMenu("Game");
        JMenu menu2 = new JMenu("Help");
        menuBar.add(menu1);
        menuBar.add(menu2);
        JMenuItem item11 = new JMenuItem("new game");
        JMenuItem item12 = new JMenuItem("save game");
        JMenuItem item13 = new JMenuItem("load game");
        JMenuItem item14 = new JMenuItem("Exit");
        menu1.add(item11);
        menu1.add(item12);
        menu1.add(item13);
        menu1.addSeparator();
        menu1.add(item14);
        JMenuItem item21 = new JMenuItem("About");
        menu2.add(item21);

        ActionListener menuListener = e -> {
            String cmd = e.getActionCommand();
            //obtain the menuitem's text
            if (cmd.equals("Exit")){
                System.exit(0);
            }

        };

        frame.setVisible(true);
    }
}
