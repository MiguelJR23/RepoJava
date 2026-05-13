package com.mycompany.Pitagoras;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pitagoras extends JFrame {

    JLabel l1, l2, resultado;
    JTextField t1, t2;
    JButton calcular;

    public Pitagoras() {

        setTitle("Pitágoras");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        Font fonte = new Font("Comic Sans MS", Font.PLAIN, 16);

        l1 = new JLabel("Cateto A:");
        l1.setBounds(20, 30, 100, 30);
        l1.setFont(fonte);

        t1 = new JTextField();
        t1.setBounds(130, 30, 150, 30);
        t1.setFont(fonte);

        l2 = new JLabel("Cateto B:");
        l2.setBounds(20, 80, 100, 30);
        l2.setFont(fonte);

        t2 = new JTextField();
        t2.setBounds(130, 80, 150, 30);
        t2.setFont(fonte);

        calcular = new JButton("Calcular");
        calcular.setBounds(100, 130, 120, 35);
        calcular.setFont(fonte);

        resultado = new JLabel("");
        resultado.setBounds(20, 180, 300, 30);
        resultado.setFont(fonte);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());

                double h = Math.sqrt((a * a) + (b * b));

                resultado.setText("Hipotenusa: " + h);
            }
        });

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(calcular);
        add(resultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Pitagoras();
    }
}
