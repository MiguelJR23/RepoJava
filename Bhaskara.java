package com.mycompany.Bhaskara;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bhaskara extends JFrame {

    JLabel la, lb, lc, resultado;
    JTextField ta, tb, tc;
    JButton calcular;

    public Bhaskara() {

        setTitle("Bhaskara");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        Font fonte = new Font("Comic Sans MS", Font.PLAIN, 16);

        la = new JLabel("A:");
        la.setBounds(30, 30, 100, 30);
        la.setFont(fonte);

        ta = new JTextField();
        ta.setBounds(80, 30, 200, 30);
        ta.setFont(fonte);

        lb = new JLabel("B:");
        lb.setBounds(30, 80, 100, 30);
        lb.setFont(fonte);

        tb = new JTextField();
        tb.setBounds(80, 80, 200, 30);
        tb.setFont(fonte);

        lc = new JLabel("C:");
        lc.setBounds(30, 130, 100, 30);
        lc.setFont(fonte);

        tc = new JTextField();
        tc.setBounds(80, 130, 200, 30);
        tc.setFont(fonte);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 180, 120, 35);
        calcular.setFont(fonte);

        resultado = new JLabel("");
        resultado.setBounds(30, 230, 350, 30);
        resultado.setFont(fonte);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble(ta.getText());
                double b = Double.parseDouble(tb.getText());
                double c = Double.parseDouble(tc.getText());

                double delta = (b * b) - (4 * a * c);

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                resultado.setText("X1 = " + x1 + " | X2 = " + x2);
            }
        });

        add(la);
        add(ta);
        add(lb);
        add(tb);
        add(lc);
        add(tc);
        add(calcular);
        add(resultado);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Bhaskara();
    }
}
