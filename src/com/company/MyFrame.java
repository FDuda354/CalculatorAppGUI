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
        JButton btn1 = new JButton("1");
        btn1.setBounds(0,325,100,100);
        btn1.addActionListener(e -> a=1);
        JButton btn2 = new JButton("2");
        btn2.setBounds(100,325,100,100);
        btn2.addActionListener(e -> a=2);
        JButton btn3 = new JButton("3");
        btn3.setBounds(200,325,100,100);
        btn3.addActionListener(e -> a=3);
        JButton btn4 = new JButton("4");
        btn4.setBounds(0,225,100,100);
        btn4.addActionListener(e -> a=4);
        JButton btn5 = new JButton("5");
        btn5.setBounds(100,225,100,100);
        btn5.addActionListener(e -> a=5);
        JButton btn6 = new JButton("6");
        btn6.setBounds(200,225,100,100);
        btn6.addActionListener(e -> a=6);
        JButton btn7 = new JButton("7");
        btn7.setBounds(0,125,100,100);
        btn7.addActionListener(e -> a=7);
        JButton btn8 = new JButton("8");
        btn8.setBounds(100,125,100,100);
        btn8.addActionListener(e -> a=8);
        JButton btn9 = new JButton("9");
        btn9.setBounds(200,125,100,100);
        btn9.addActionListener(e -> a=9);
        JButton btn0 = new JButton("0");
        btn0.setBounds(0,425,200,100);
        btn0.addActionListener(e -> a=0);

       // JButton btnp = new JButton(",");
       // btnp.setBounds(0,425,100,100);


        JButton btneg = new JButton("=");
        btneg.setBounds(300,425,100,100);
        btneg.addActionListener(e ->
        {

            if(op=='+')
            {
                wynik=a+b;
                System.out.println(wynik);
            }
            else if(op=='-')
            {
                wynik=b-a;
                System.out.println(wynik);
            }
            else if(op=='*')
            {
                wynik=a*b;
                System.out.println(wynik);
            }
            else if(op=='/')
            {
                wynik=b/a;
                System.out.println(wynik);
            }
            else if(op=='%')
            {
                wynik=b%a;
                System.out.println(wynik);
            }


        });



        JButton btnpl = new JButton("+");
        btnpl.setBounds(300,325,100,100);
        btnpl.addActionListener(e -> op='+');
        btnpl.addActionListener(e -> b=a);

        JButton btnmi = new JButton("-");
        btnmi.setBounds(300,225,100,100);
        btnmi.addActionListener(e -> op='-');
        btnmi.addActionListener(e -> b=a);


        JButton btnx = new JButton("X");
        btnx.setBounds(300,125,100,100);
        btnx.addActionListener(e -> b=a);
        btnx.addActionListener(e -> op='*');



        JButton btndzi = new JButton("/");
        btndzi.setBounds(300,425,100,100);
        btndzi.addActionListener(e -> op='/');
        btndzi.addActionListener(e -> b=a);

        JButton btnAC = new JButton("AC");
        btnAC.setBounds(200,425,100,100);


        this.setTitle("Calculator");
        this.setSize(400,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);

        this.setVisible(true);

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
        //this.add(btnp);
        this.add(btneg);
        this.add(btnpl);
        this.add(btnmi);
        this.add(btnx);
        this.add(btndzi);
        this.add(btnAC);




    }
}
