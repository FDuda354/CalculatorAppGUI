package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
   private double wynik=0;
    private double a;
    private double b;
    private char op;



    MyFrame()
    {



        setTitle("Kalkulator Filipka");

        this.setTitle("Calculator");
        this.setSize(413,660);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);//wyłączenie layoutu
        this.setVisible(true);
        this.setResizable(false);// nie mozna zmienic rozmiaru okna




         JLabel label = new JLabel();
         label.setText("0");
         label.setBounds(0,0,375,120);
         label.setForeground(Color.WHITE);
         label.setFont(new Font("Arial",Font.BOLD,50));
         label.setHorizontalAlignment(JLabel.RIGHT);
         label.setVerticalAlignment(JLabel.BOTTOM);
         label.setFocusable(false);




        this.add(label);
        JButton btn1 = new JButton("1");
        btn1.setBounds(0,425,100,100);
        btn1.addActionListener(e ->
        {
            a=1;
            label.setText("1");
        });
        btn1.setFocusable(false);
        JButton btn2 = new JButton("2");
        btn2.setBounds(100,425,100,100);
        btn2.addActionListener(e ->
        {
            a=2;
            label.setText("2");
        });
        btn2.setFocusable(false);
        JButton btn3 = new JButton("3");
        btn3.setBounds(200,425,100,100);
        btn3.addActionListener(e ->
        {
            a=3;
            label.setText("3");
        });
        btn3.setFocusable(false);
        JButton btn4 = new JButton("4");
        btn4.setBounds(0,325,100,100);
        btn4.addActionListener(e ->
        {
            a=4;
            label.setText("4");
        });
        btn4.setFocusable(false);
        JButton btn5 = new JButton("5");
        btn5.setBounds(100,325,100,100);
        btn5.addActionListener(e ->
        {
            a=5;
            label.setText("5");
        });
        btn5.setFocusable(false);
        JButton btn6 = new JButton("6");
        btn6.setBounds(200,325,100,100);
        btn6.addActionListener(e ->
        {
            a=6;
            label.setText("6");
        });
        btn6.setFocusable(false);
        JButton btn7 = new JButton("7");
        btn7.setBounds(0,225,100,100);
        btn7.addActionListener(e ->
        {
            a=7;
            label.setText("7");
        });
        btn7.setFocusable(false);
        JButton btn8 = new JButton("8");
        btn8.setBounds(100,225,100,100);
        btn8.addActionListener(e ->
        {
            a=8;
            label.setText("8");
        });
        btn8.setFocusable(false);
        JButton btn9 = new JButton("9");
        btn9.setBounds(200,225,100,100);
        btn9.addActionListener(e ->
        {
            a=9;
            label.setText("9");
        });
        btn9.setFocusable(false);
        JButton btn0 = new JButton("0");
        btn0.setBounds(0,525,200,100);
        btn0.addActionListener(e ->
        {
            a=0;
            label.setText("0");
        });
        btn0.setFocusable(false);


        //operacje
        JButton btnp = new JButton(",");
        btnp.setBounds(200,525,100,100);
        JButton btnr = new JButton("%");
        btnr.setBounds(200,125,100,100);
        btnr.addActionListener(e -> op='%');
        btnr.addActionListener(e -> b=a);

        JButton btneg = new JButton("=");
        btneg.setBounds(300,525,100,100);
        btneg.addActionListener(e ->
        {

            if(op=='+')
            {
                wynik=a+b;
                label.setText(""+wynik);

            }
            else if(op=='-')
            {
                wynik=b-a;
                label.setText(""+wynik);
            }
            else if(op=='*')
            {
                wynik=a*b;
                label.setText(""+wynik);
            }
            else if(op=='/')
            {
                wynik=b/a;
                label.setText(""+wynik);
            }
            else if(op=='%')
            {
                wynik=b%a;
                label.setText(""+wynik);
            }


        });
        btneg.setFocusable(false);



        JButton btnpl = new JButton("+");
        btnpl.setBounds(300,425,100,100);
        btnpl.addActionListener(e -> op='+');
        btnpl.addActionListener(e -> b=a);
        btnpl.setFocusable(false);

        JButton btnmi = new JButton("-");
        btnmi.setBounds(300,325,100,100);
        btnmi.addActionListener(e -> op='-');
        btnmi.addActionListener(e -> b=a);
        btnmi.setFocusable(false);


        JButton btnx = new JButton("X");
        btnx.setBounds(300,225,100,100);
        btnx.addActionListener(e -> b=a);
        btnx.addActionListener(e -> op='*');
        btnx.setFocusable(false);



        JButton btndzi = new JButton("/");
        btndzi.setBounds(300,125,100,100);
        btndzi.addActionListener(e -> op='/');
        btndzi.addActionListener(e -> b=a);
        btndzi.setFocusable(false);

        JButton btnAC = new JButton("AC");
        btnAC.setBounds(0,125,100,100);
        btnAC.addActionListener(e ->
        {
            a=0;
            b=0;
            label.setText("0");

        });
        btnAC.setFocusable(false);
        JButton btn = new JButton("");
        btn.setBounds(100,125,100,100);
        btn.setFocusable(false);


        this.add(btn0);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
        this.add(btn6);
        this.add(btn7);
        this.add(btn8);
        this.add(btn9);
        this.add(btnp);
        this.add(btneg);
        this.add(btnpl);
        this.add(btnmi);
        this.add(btnx);
        this.add(btndzi);
        this.add(btnAC);
        this.add(btnr);
        this.add(btn);




    }
}
