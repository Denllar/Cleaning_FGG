package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelApp extends JPanel {
    double txt1;
    double res = 0;
    double res1 = 0;
    String op = "";

    public void setTxt1(double quantity) {
        this.txt1 = quantity;
        System.out.println(txt1);
    }
    public JPanelApp() {
        try {
            setLayout(null);
            // Specifies the position of the element
            final TextField txt1 = new TextField();
            txt1.setBounds(10, 10, 235, 25);

            JButton b0 = new JButton("0");
            b0.setBounds(10, 270, 75, 50);
            b0.setBackground(Color.orange);

            JButton b1 = new JButton("1");
            b1.setBounds(10, 190, 50, 50);
            b1.setBackground(Color.orange);

            JButton b2 = new JButton("2");
            b2.setBounds(60, 190, 50, 50);
            b2.setBackground(Color.orange);

            JButton b3 = new JButton("3");
            b3.setBounds(110, 190, 50, 50);
            b3.setBackground(Color.orange);

            JButton b4 = new JButton("4");
            b4.setBounds(10, 110, 50, 50);
            b4.setBackground(Color.orange);

            JButton b5 = new JButton("5");
            b5.setBounds(60, 110, 50, 50);
            b5.setBackground(Color.orange);

            JButton b6 = new JButton("6");
            b6.setBounds(110, 110, 50, 50);
            b6.setBackground(Color.orange);

            JButton b7 = new JButton("7");
            b7.setBounds(10, 40, 50, 50);
            b7.setBackground(Color.orange);

            JButton b8 = new JButton("8");
            b8.setBounds(60, 40, 50, 50);
            b8.setBackground(Color.orange);

            JButton b9 = new JButton("9");
            b9.setBounds(110, 40, 50, 50);
            b9.setBackground(Color.orange);

            JButton bRes = new JButton("=");
            bRes.setBounds(85, 270, 75, 50);
            Font bigFont = new Font("serif", Font.BOLD, 22);
            bRes.setFont(bigFont);
            bRes.setBackground(Color.orange);

            JButton bPlus = new JButton("+");
            bPlus.setBounds(170, 40, 75, 50);
            Font bigFontPlus = new Font("serif", Font.BOLD, 22);
            bPlus.setFont(bigFontPlus);
            bPlus.setBackground(Color.orange);

            JButton bMinus = new JButton("-");
            bMinus.setBounds(170, 110, 75, 50);
            Font bigFontMinus = new Font("serif", Font.BOLD, 22);
            bMinus.setFont(bigFontMinus);
            bMinus.setBackground(Color.orange);

            JButton bMulti = new JButton("*");
            bMulti.setBounds(170, 190, 75, 50);
            Font bigFontMulti = new Font("serif", Font.BOLD, 22);
            bMulti.setFont(bigFontMulti);
            bMulti.setBackground(Color.orange);

            JButton bDivision = new JButton("/");
            bDivision.setBounds(170, 270, 75, 50);
            Font bigFontDivision = new Font("serif", Font.BOLD, 22);
            bDivision.setFont(bigFontDivision);
            bDivision.setBackground(Color.orange);

            JButton squareX = new JButton("X^2");
            squareX.setBounds(250, 40, 75, 50);
            Font bigFontSquareX = new Font("serif", Font.BOLD, 22);
            squareX.setFont(bigFontSquareX);
            squareX.setBackground(Color.orange);

            JButton squareRootX = new JButton("√");
            squareRootX.setBounds(250, 100, 75, 50);
            Font bigFontSquareRootX = new Font("serif", Font.BOLD, 22);
            squareRootX.setFont(bigFontSquareRootX);
            squareRootX.setBackground(Color.orange);

            JButton plusMinusX = new JButton("+-");
            plusMinusX.setBounds(250, 150, 75, 50);
            Font bigFontPlusMinusX = new Font("serif", Font.BOLD, 22);
            plusMinusX.setFont(bigFontPlusMinusX);
            plusMinusX.setBackground(Color.orange);

            JButton oneX = new JButton("1/x");
            oneX.setBounds(250, 200, 75, 50);
            Font bigFontOneX = new Font("serif", Font.BOLD, 22);
            oneX.setFont(bigFontOneX);
            oneX.setBackground(Color.orange);

            JButton logX = new JButton("log");
            logX.setBounds(250, 250, 75, 50);
            Font bigFontLogX = new Font("serif", Font.BOLD, 22);
            logX.setFont(bigFontLogX);
            logX.setBackground(Color.orange);

            JButton delete = new JButton("delete");
            delete.setBounds(250, 300, 75, 50);
            Font bigFontDelete = new Font("serif", Font.BOLD, 22);
            delete.setFont(bigFontDelete);
            delete.setBackground(Color.orange);

            JButton reverseColor = new JButton("rev col");
            reverseColor.setBounds(250, 350, 75, 50);
            Font bigFontReverseColor = new Font("serif", Font.BOLD, 22);
            reverseColor.setFont(bigFontReverseColor);
            reverseColor.setBackground(Color.orange);

            add(txt1);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bRes);
            add(bPlus);
            add(bMinus);
            add(bMulti);
            add(bDivision);
            add(squareX);
            add(squareRootX);
            add(plusMinusX);
            add(oneX);
            add(logX);
            add(delete);
            add(reverseColor);

            reverseColor.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    b0.setBackground(Color.blue);
                    b1.setBackground(Color.blue);
                    b2.setBackground(Color.blue);
                    b3.setBackground(Color.blue);
                    b4.setBackground(Color.blue);
                    b5.setBackground(Color.blue);
                    b6.setBackground(Color.blue);
                    b7.setBackground(Color.blue);
                    b8.setBackground(Color.blue);
                    b9.setBackground(Color.blue);
                    bRes.setBackground(Color.blue);
                    bPlus.setBackground(Color.blue);
                    bMinus.setBackground(Color.blue);
                    bMulti.setBackground(Color.blue);
                    bDivision.setBackground(Color.blue);
                    squareX.setBackground(Color.blue);
                    squareRootX.setBackground(Color.blue);
                    plusMinusX.setBackground(Color.blue);
                    oneX.setBackground(Color.blue);
                    logX.setBackground(Color.blue);
                    delete.setBackground(Color.blue);
                    reverseColor.setBackground(Color.blue);
                }
            });

            b1.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 1);
                    if (res==0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b2.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 2);
                    if (res==0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b3.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 3);
                    if (res==0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b4.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 4);
                    if (res==0)
                    {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b5.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 5);
                    if (res==0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b6.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 6);
                    if (res==0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b7.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 7);
                    if (res==0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b8.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 8);
                    if (res==0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b9.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 9);
                    if (res==0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b0.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 0);
                    if (res==0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            bPlus.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "+";
                }
            });

            bMinus.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "-";
                }
            });

            bMulti.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "*";
                }
            });

            bDivision.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "/";
                }
            });

            squareX.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "X^2";
                    MetodCalc mc = new MetodCalc();
                    String strRes = String.valueOf(mc.calc(res, op, 1));
                    txt1.setText(strRes);
                }
            });

            squareRootX.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "√";
                    MetodCalc mc = new MetodCalc();
                    String strRes = String.valueOf(mc.calc(res, op, 1));
                    txt1.setText(strRes);
                }
            });

            plusMinusX.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "+-";
                    MetodCalc mc = new MetodCalc();
                    String strRes = String.valueOf(mc.calc(res, op, 1));
                    txt1.setText(strRes);
                }
            });

            oneX.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "1/x";
                    MetodCalc mc = new MetodCalc();
                    String strRes = String.valueOf(mc.calc(res, op, 1));
                    txt1.setText(strRes);
                }
            });

            logX.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "log";
                    MetodCalc mc = new MetodCalc();
                    String strRes = String.valueOf(mc.calc(res, op, 1));
                    txt1.setText(strRes);
                }
            });

            delete.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "delete";
                    MetodCalc mc = new MetodCalc();
                    String strRes = String.valueOf(mc.calc(res, op, 1));
                    txt1.setText(strRes);
                }
            });


            bRes.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    double num = Double.valueOf(res);
                    double num1 = Double.valueOf(res1);
                    String strOp = op;

                    MetodCalc mc = new MetodCalc();
                    String strRes = String.valueOf(mc.calc(num, strOp, num1 ));
                    txt1.setText(strRes);
                }
            });
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Can not divide by zero ");
        }
    }
}