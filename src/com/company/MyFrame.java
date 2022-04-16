package com.company;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Thread.sleep;

public class MyFrame extends JFrame
{
    boolean click = true;
    Double dis;
    double a=0.0;
    double b=0.0;
     char op='r';
     boolean jz=false,uzycieprzcinka=false;
     boolean nowy=true;
    String s = "0";
    JLabel label = new JLabel();
    JPanel label2 = new JPanel();
    MyFrame()
    {
        ImageIcon logo = new ImageIcon("AAKK.png");
        this.setIconImage(logo.getImage());
        this.setTitle("Kalkulator Filipka");
        this.setSize(400,650);
        this.setLocation(1000,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setResizable(false);


        label2.setBounds(0,120,420,550);
        label2.setBackground(Color.WHITE);
        label2.setLayout(null);



        this.add(label2);


        // zrob tak zeby nie mozna było zmieniac szerokości okna ale można zmieniać wysokość


       // this.setResizable(false);// nie mozna zmienic rozmiaru okna




         label.setText("0");
         label.setBounds(0,0,375,120);
         label.setForeground(Color.WHITE);
         label.setFont(new Font("Arial",Font.BOLD,60));
         label.setHorizontalAlignment(JLabel.RIGHT);
         label.setVerticalAlignment(JLabel.BOTTOM);
         label.setFocusable(false);

         this.add(label);


        Button btn1 = new Button("1",0,300,100,100);
        btn1.addActionListener(e ->display("1"));

        Button btn2 = new Button("2",100,300,100,100);
        btn2.addActionListener(e ->display("2"));

        Button btn3 = new Button("3",200,300,100,100);
        btn3.addActionListener(e ->display("3"));

        Button btn4 = new Button("4",0,200,100,100);
        btn4.addActionListener(e ->display("4"));

        Button btn5 = new Button("5",100,200,100,100);
        btn5.addActionListener(e ->display("5"));

        Button btn6= new Button("6",200,200,100,100);
        btn6.addActionListener(e -> display("6"));

        Button btn7= new Button("7",0,100,100,100);
        btn7.addActionListener(e ->display("7"));

        Button btn8= new Button("8",100,100,100,100);
        btn8.addActionListener(e ->display("8"));

        Button btn9= new Button("9",200,100,100,100);
        btn9.addActionListener(e ->display("9"));

        Button btn0= new Button("0",0,400,300,100);
        btn0.addActionListener(e -> display("0"));



        Button btnp= new Button(".",100,0,100,100);
        btnp.addActionListener(e ->
        {
            if(!s.contains("."))
            {
                try
                {
                    if(s.equals(""))
                        s="0.1";
                    else
                        display(".");
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null,"Ta fukncja jeszcze nie działa!","Kalkulator Filipka Beta-Version",JOptionPane.ERROR_MESSAGE);
                    a=0;
                    b=0;
                    s="0";
                    label.setText(s);
                    nowy=true;
                    click=true;

                }



            }

        });



        //operacje


        Button btnr= new Button("%",200,0,100,100);
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

        Button btneg= new Button("=",300,400,100,100);
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

        Button btnpl= new Button("+",300,300,100,100);
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

        Button btnmn= new Button("-",300,200,100,100);
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

        Button btnml= new Button("X",300,100,100,100);
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

        Button btndv= new Button("/",300,0,100,100);
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

        Button btnAC= new Button("AC",0,0,100,100);
        btnAC.addActionListener(e ->
        {
            a=0;
            b=0;
            s="0";
            label.setText(s);
            nowy=true;
            click=true;

        });


        //dodanie przyciskow do okna
        {
           // this.add(btn);
            label2.add(btnAC);
            label2.add(btnp);
            label2.add(btnr);

            label2.add(btndv);
            label2.add(btn7);
            label2.add(btn8);
            label2.add(btn9);
            label2.add(btnml);

            label2.add(btn4);
            label2.add(btn5);
            label2.add(btn6);
            label2.add(btnmn);

            label2.add(btn1);
            label2.add(btn2);
            label2.add(btn3);


            label2.add(btnpl);

            label2.add(btn0);


            label2.add(btneg);

            this.setVisible(true);
        }
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

            System.out.println(s);

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
        if(nowy)
            b=a*a;
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
        if(nowy)
            b=1;

        b*=a;
        a=0;
        s=""+b;

        label.setText(s);

        jz=false;
        nowy=false;
        click=true;
    }



}
