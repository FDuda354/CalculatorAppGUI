package com.company;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class MyFrame extends JFrame
{
    boolean canClickANumber = true;
    double a=0.0;
    double b=0.0;
     char op='r';
    boolean wprowadzonoZnak =false;// z myślą o przyszłosci!
     boolean jz=false;
     boolean wprowadzonoDrugaLiczbe=false;
     boolean wprowadzonoPierwszaLiczbe=false;
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
                    System.out.println(s);
                    if(s.equals("0"))
                        display("0.");
                    else
                        display(".");
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null,"Cos poszlo nie tak :/ Sorry!","Kalkulator Filipka Beta-Version",JOptionPane.ERROR_MESSAGE);
                    canClickANumber = true;
                    a=0.0;
                    b=0.0;
                    op='r';
                    wprowadzonoZnak =false;// z myślą o przyszłosci!
                    jz=false;
                    wprowadzonoDrugaLiczbe=false;
                    wprowadzonoPierwszaLiczbe=false;
                    s = "0";
                    label.setText(s);

                }



            }

        });

        Button btnr= new Button("%",200,0,100,100);
        btnr.addActionListener(e ->obliczenia('%'));

        Button btneg= new Button("=",300,400,100,100);
        btneg.addActionListener(e ->obliczenia('='));

        Button btnpl= new Button("+",300,300,100,100);
        btnpl.addActionListener(e ->obliczenia('+'));

        Button btnmn= new Button("-",300,200,100,100);
        btnmn.addActionListener(e ->obliczenia('-'));

        Button btnml= new Button("X",300,100,100,100);
        btnml.addActionListener(e ->obliczenia('X'));

        Button btndv= new Button("/",300,0,100,100);
        btndv.addActionListener(e ->obliczenia('/'));

        Button btnAC= new Button("AC",0,0,100,100);
        btnAC.addActionListener(e ->
        {
            canClickANumber = true;
            a=0.0;
            b=0.0;
            op='r';
            wprowadzonoZnak =false;// z myślą o przyszłosci!
            jz=false;
            wprowadzonoDrugaLiczbe=false;
            wprowadzonoPierwszaLiczbe=false;
            s = "0";
            label.setText(s);

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
        if(canClickANumber)
        {
            if(!jz)
            {
                s="";
                jz=true;
            }

            if(s.equals("0"))
                s="";

            s = s+value;

            if(wprowadzonoPierwszaLiczbe)
                b = Double.parseDouble(s);
            else
                a = Double.parseDouble(s);

            label.setText(s);

        }

    }

void obliczenia(char opp)
{
    if(!wprowadzonoPierwszaLiczbe&&!wprowadzonoDrugaLiczbe&&opp!='=')
    {
        op=opp;
        wprowadzonoZnak=true;
        if(!s.equals(""))
        wprowadzonoPierwszaLiczbe=true;
        canClickANumber=true;
        s="";
    }
    if(wprowadzonoPierwszaLiczbe)
    {
        if(!s.equals(""))
        wprowadzonoDrugaLiczbe=true;
        if(!wprowadzonoDrugaLiczbe)
        op=opp;
        wprowadzonoZnak=true;
        canClickANumber=true;
        if(opp=='=')
            canClickANumber =false;

        s="";
    }
    if(wprowadzonoDrugaLiczbe)
    {
        if(op=='+')
            a+=b;
        else if(op=='-')
            a-=b;
        else if(op=='X')
            a*=b;
        else if(op=='/')
            a/=b;
        else if(op=='%')
            a%=b;

        if(opp=='=')
            canClickANumber =false;

        op=opp;
        s=String.valueOf(a);
        label.setText(String.valueOf(a));
        b=0;
        s="";
        wprowadzonoDrugaLiczbe=false;
        wprowadzonoPierwszaLiczbe=true;
        jz=false;

    }

}

}
