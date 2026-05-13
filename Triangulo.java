package com.mycompany.Triangulo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Triangulo extends JFrame {

    JLabel l1, l2, l3, resultado;
    JTextField t1, t2, t3;
    JButton verificar;

    public Triangulo() {

        setTitle("Triângulos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        Font fonte = new Font("Comic Sans MS", Font.PLAIN, 16);

        l1 = new JLabel("Lado 1:");
        l1.setBounds(30, 30, 100, 30);
        l1.setFont(fonte);

        t1 = new JTextField();
        t1.setBounds(130, 30, 180, 30);
        t1.setFont(fonte);

        l2 = new JLabel("Lado 2:");
        l2.setBounds(30, 80, 100, 30);
        l2.setFont(fonte);

        t2 = new JTextField();
        t2.setBounds(130, 80, 180, 30);
        t2.setFont(fonte);

        l3 = new JLabel("Lado 3:");
        l3.setBounds(30, 130, 100, 30);
        l3.setFont(fonte);

        t3 = new JTextField();
        t3.setBounds(130, 130, 180, 30);
        t3.setFont(fonte);

        verificar = new JButton("Verificar");
        verificar.setBounds(120, 180, 130, 35);
        verificar.setFont(fonte);

        resultado = new JLabel("");
        resultado.setBounds(30, 230, 300, 30);
        resultado.setFont(fonte);

        verificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = Integer.parseInt(t3.getText());

                if (a == b && b == c) {
                    resultado.setText("Triângulo Equilátero");
                }
                else if (a == b || a == c || b == c) {
                    resultado.setText("Triângulo Isósceles");
                }
                else {
                    resultado.setText("Triângulo Escaleno");
                }
            }
        });

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(verificar);
        add(resultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Triangulo();
    }
}
