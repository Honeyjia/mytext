package com.company;

import javax.swing.*;
import java.awt.*;

//public class mytext {
//    public static void main(String[] args){
//        JFrame jf = new JFrame("我的窗体");
//        Container container = jf.getContentPane();
//        JLabel li = new JLabel("This is my window");
//        li.setHorizontalAlignment(SwingConstants.CENTER);//
   /* public class mytext extends JFrame {
        public mytext(){
            getContentPane().setLayout( new BorderLayout());//创建BorderLayout布局管理器;
            Button b1 = new Button("north");
            b1.setBackground(Color.BLACK);
            Button b2 = new Button("north");
            b2.setBackground(Color.yellow);
            Button b3 = new Button("north");
            b3.setBackground(Color.blue);
            Button b4 = new Button("north");
            b4.setBackground(Color.cyan);
            Button b5 = new Button("north");
            b5.setBackground(Color.gray);
            getContentPane().add(b1 ,BorderLayout.NORTH);//添加按钮+布局
            add(b2,BorderLayout.SOUTH);
            add(b3,BorderLayout.EAST);
            add(b4,BorderLayout.WEST);
            add(b5,BorderLayout.CENTER);
//        add(new Button("another"),BorderLayout.CENTER);
            setSize(300,400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
        public static void main(String[] args) {
            new mytext().setVisible(true);
        }
    }*/

/*public class mytext extends JFrame {
    JButton[] buttons = new JButton[20];
    public mytext(){
        for( int i=0;i<buttons.length;i++){
            buttons[i] = new JButton(""+(i+1));
        }
        getContentPane().setLayout( new GridLayout(4,5));
        for( int i=0;i<buttons.length;i++){
            getContentPane().add(buttons[i]);
        }
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new mytext().setVisible(true);
    }
}*/
import java.awt.*;
class Layout extends Frame{
    public Layout(String title){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        this.setLayout(layout);
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        this.addComponent1("btn1",layout,c);
        this.addComponent("btn2",layout,c);
        this.addComponent("btn3",layout,c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        this.addComponent("btn4",layout,c);
        c.weightx = 0;
        c.weighty = 0;
        this.addComponent("btn5",layout,c);
        c.gridwidth = 1;
        this.addComponent("btn6",layout,c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        this.addComponent("btn7",layout,c);
        c.gridheight = 2;
        c.gridwidth = 1;
        c.weightx = 2;
        c.weighty = 2;
        this.addComponent("btn8",layout,c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridheight = 1;
        this.addComponent("btn9",layout,c);
        this.addComponent1("btn10",layout,c);
        this.pack();
        this.setVisible(true);

    }

    private void addComponent(String btn1, GridBagLayout layout, GridBagConstraints c) {
        Button bt = new Button(btn1);
        layout.setConstraints(bt, c);
        this.add(bt);
    }
    private void addComponent1(String btn1, GridBagLayout layout, GridBagConstraints c) {
        Button bt = new Button(btn1);
        bt.setBackground(Color.pink);
        layout.setConstraints(bt, c);
        this.add(bt);
    }
}
public class mytext {
    public static void main(String[] args) {
        new Layout("GridBagLayout");


    }
}