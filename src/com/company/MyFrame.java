package com.company;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyFrame extends JFrame
{
    boolean click = true;
    Double dis;
    double a=0.0;
    double b=0.0;
     char op='r';
     boolean jz=false;
     boolean nowy=true;
    String s = "0";
    JLabel label = new JLabel();

    MyFrame()
    {
        ImageIcon logo = new ImageIcon("AAKK.png");
        this.setIconImage(logo.getImage());
        this.setTitle("Kalkulator Filipka");
        this.setSize(420,670);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);//wyłączenie layoutu
        this.setVisible(true);
        this.setResizable(false);// nie mozna zmienic rozmiaru okna




         label.setText("0");
         label.setBounds(0,0,375,120);
         label.setForeground(Color.WHITE);
         label.setFont(new Font("Arial",Font.BOLD,60));
         label.setHorizontalAlignment(JLabel.RIGHT);
         label.setVerticalAlignment(JLabel.BOTTOM);
         label.setFocusable(false);

         this.add(label);


        Button btn1 = new Button("1",0,425,100,100);
        btn1.addActionListener(e ->display("1"));

        Button btn2 = new Button("2",100,425,100,100);
        btn2.addActionListener(e ->display("2"));

        Button btn3 = new Button("3",200,425,100,100);
        btn3.addActionListener(e ->display("3"));

        Button btn4 = new Button("4",0,325,100,100);
        btn4.addActionListener(e ->display("4"));

        Button btn5 = new Button("5",100,325,100,100);
        btn5.addActionListener(e ->display("5"));

        Button btn6= new Button("6",200,325,100,100);
        btn6.addActionListener(e -> display("6"));

        Button btn7= new Button("7",0,225,100,100);
        btn7.addActionListener(e ->display("7"));

        Button btn8= new Button("8",100,225,100,100);
        btn8.addActionListener(e ->display("8"));

        Button btn9= new Button("9",200,225,100,100);
        btn9.addActionListener(e ->display("9"));

        Button btn0= new Button("0",0,525,300,100);
        btn0.addActionListener(e -> display("0"));



        //operacje
        Button btnp= new Button(".",200,225,100,100);
        // ustaw przycisk jako nieaktywny
        btnp.setEnabled(false);
        //btnp.addActionListener(e -> op='.');
       // btnp.addActionListener(e -> b=a);


        Button btnr= new Button("%",200,125,100,100);
        btnr.addActionListener(e ->
        {

            if(op=='r'||op=='%')
            {
                op='%';
               reszta();
            }
            else if(op=='-')
            {
                op='%';
               odejmowanie();
            }
            else if(op=='X')
            {
                op='%';
               mnozenie();
            }
            else if(op=='/')
            {
                op='%';
              dzielenie();
            }
            else if(op=='+')
            {
                op='%';
                dodawanie();
            }




        });

        Button btneg= new Button("=",300,525,100,100);
        btneg.addActionListener(e ->
        {
            switch (op) {
                case '+' -> {
                    dis = (b + a);
                    dis = BigDecimal.valueOf(dis).setScale(5, RoundingMode.HALF_UP).doubleValue();
                    s = "" + dis;
                    label.setText(s);
                    click = false;
                }
                case '-' -> {
                    dis = (b - a);
                    dis = BigDecimal.valueOf(dis).setScale(5, RoundingMode.HALF_UP).doubleValue();
                    s = "" + dis;
                    label.setText(s);
                    click = false;
                }
                case 'X' -> {
                    dis = (b * a);
                    dis = BigDecimal.valueOf(dis).setScale(5, RoundingMode.HALF_UP).doubleValue();
                    s = "" + dis;
                    label.setText(s);
                    click = false;
                }
                case '/' -> {
                    dis = (b / a);
                    dis = BigDecimal.valueOf(dis).setScale(5, RoundingMode.HALF_UP).doubleValue();
                    s = "" + dis;
                    label.setText(s);
                    click = false;

                }
                case '%' -> {
                    dis = (b % a);
                    dis = BigDecimal.valueOf(dis).setScale(5, RoundingMode.HALF_UP).doubleValue();
                    s = "" + dis;
                    label.setText(s);
                    click = false;
                }
            }
        });

        Button btnpl= new Button("+",300,425,100,100);
        btnpl.addActionListener(e ->
        {

            if(op=='r'||op=='+')
            {
                op='+';
               dodawanie();
            }
            else if(op=='-')
            {
                op='+';
               odejmowanie();
            }
            else if(op=='X')
            {
                op='+';
              mnozenie();
            }
            else if(op=='/')
            {
                op='+';
               dzielenie();
            }
            else if(op=='%')
            {
                op='+';
               reszta();
            }



        });

        Button btnmn= new Button("-",300,325,100,100);
        btnmn.addActionListener(e ->
        {
            if(op=='r'||op=='-')
            {
                op='-';
                odejmowanie();
            }
            else if(op=='+')
            {
                op='-';
               dodawanie();
            }
            else if(op=='X')
            {
                op='-';
                mnozenie();
            }
            else if(op=='/')
            {
                op='-';
               dzielenie();
            }
            else if(op=='%')
            {
                op='-';
               reszta();
            }


        });

        Button btnml= new Button("X",300,225,100,100);
        btnml.addActionListener(e ->
        {
            if(op=='r'||op=='X')
            {
                op='X';

                mnozenie();
            }
            else if(op=='+')
            {
                op='X';
               dodawanie();
            }
            else if(op=='-')
            {
                op='X';
             odejmowanie();
            }
            else if(op=='/')
            {
                op='X';
                dzielenie();
            }
            else if(op=='%')
            {
                op='X';

               reszta();

            }


        });

        Button btndv= new Button("/",300,125,100,100);
        btndv.addActionListener(e ->
        {
            if(op=='r'||op=='/')
            {
                op='/';

               dzielenie();
            }
            else if(op=='+')
            {
                op='/';
               dodawanie();
            }
            else if(op=='-')
            {
                op='/';
               odejmowanie();
            }
            else if(op=='X')
            {
                op='/';

               mnozenie();
            }
            else if(op=='%')
            {
                op='/';

                reszta();

            }

        });

        Button btnAC= new Button("AC",0,125,100,100);
        btnAC.addActionListener(e ->
        {
            a=0;
            b=0;
            s="0";
            label.setText(s);
            nowy=true;

        });

        Button btn= new Button("",100,125,100,100);
        btn.setEnabled(false);

        this.add(btn);
        this.add(btnAC);
        this.add(btndv);
        this.add(btnml);
        this.add(btnmn);
        this.add(btnpl);
        this.add(btneg);
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
        this.add(btnr);
        this.add(btn0);
    }

    void display(String value)
    {
        if(click)
        {
            if(!jz)
            {
                s="";
                jz=true;
            }

            if(s.equals("0"))
                s="";

            s = s+value;
            a = Double.parseDouble(s);

            label.setText(s);
        }

    }

    void reszta()
    {

        b=b%a;
        if(nowy)
            b=a;
        a=0;
        s=""+b;

        label.setText(s);

        jz=false;
        nowy=false;
        click=true;
    }
    void dodawanie()
    {

        b+=a;
        a=0;
        s=""+b;

        label.setText(s);

        jz=false;
        nowy=false;
        click=true;
    }
    void odejmowanie()
    {

        if(nowy)
            b=a*2;


        b-=a;
        a=0;
        s=""+b;

        label.setText(s);

        jz=false;
        nowy=false;
        click=true;
    }
    void dzielenie()
    {

        b/=a;
        a=0;
        s=""+b;

        label.setText(s);

        jz=false;
        nowy=false;
        click=true;
    }
    void mnozenie()
    {

        b*=a;
        a=0;
        s=""+b;

        label.setText(s);

        jz=false;
        nowy=false;
        click=true;
    }



}
