package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Cardlayout extends Frame implements ActionListener {
    Panel cardPanel = new Panel();
    Panel ControlpaPanel = new Panel();
    Button nextbutton, preButton;
    CardLayout cardLayout = new CardLayout();

    public Cardlayout() {
        setSize(400, 300);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Cardlayout.this.dispose();
            }
        });
        cardPanel.setLayout(cardLayout);
        cardPanel.add(new Label("第一个界面", Label.CENTER));
        cardPanel.add(new Label("第二个界面", Label.CENTER));
        cardPanel.add(new Label("第三个界面", Label.CENTER));

        nextbutton = new Button("下一张卡片");
        preButton = new Button("上一张卡片");


        nextbutton.addActionListener(this);
        nextbutton.addActionListener(this);

        ControlpaPanel.add(preButton);
        ControlpaPanel.add(nextbutton);
        this.add(cardPanel, BorderLayout.CENTER);
        this.add(ControlpaPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextbutton) {
            cardLayout.next(cardPanel);
        }
        if (e.getSource() == preButton) {
            cardLayout.previous(cardPanel);
        }
    }
}

public class text {
    public static void main(String[] args){
        new Cardlayout();

    }
}
