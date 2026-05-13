package com.mycompany.ConversorTemperatura;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorTemperatura extends JFrame {

    JLabel ltemp, resultado1, resultado2;
    JTextField ttemp;
    JButton converter;

    public ConversorTemperatura() {

        setTitle("Conversor de Temperatura");
        setSize(420, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        Font fonte = new Font("Comic Sans MS", Font.PLAIN, 16);

        ltemp = new JLabel("Celsius:");
        ltemp.setBounds(30, 40, 100, 30);
        ltemp.setFont(fonte);

        ttemp = new JTextField();
        ttemp.setBounds(130, 40, 180, 30);
        ttemp.setFont(fonte);

        converter = new JButton("Converter");
        converter.setBounds(120, 100, 140, 35);
        converter.setFont(fonte);

        resultado1 = new JLabel("");
        resultado1.setBounds(30, 170, 350, 30);
        resultado1.setFont(fonte);

        resultado2 = new JLabel("");
        resultado2.setBounds(30, 210, 350, 30);
        resultado2.setFont(fonte);

        converter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double c = Double.parseDouble(ttemp.getText());

                double f = (c * 9 / 5) + 32;
                double k = c + 273.15;

                resultado1.setText("Fahrenheit: " + f + " °F");
                resultado2.setText("Kelvin: " + k + " K");
            }
        });

        add(ltemp);
        add(ttemp);
        add(converter);
        add(resultado1);
        add(resultado2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ConversorTemperatura();
    }
}
