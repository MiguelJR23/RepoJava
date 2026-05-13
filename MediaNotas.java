package com.mycompany.MediaNotas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MediaNotas extends JFrame {

    JLabel l1, l2, l3, l4, resultado;
    JTextField t1, t2, t3, t4;
    JButton calcular;

    public MediaNotas() {

        setTitle("Média de Notas");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        Font fonte = new Font("Comic Sans MS", Font.PLAIN, 16);

        l1 = new JLabel("Nota 1:");
        l1.setBounds(30, 20, 100, 30);
        l1.setFont(fonte);

        t1 = new JTextField();
        t1.setBounds(120, 20, 150, 30);
        t1.setFont(fonte);

        l2 = new JLabel("Nota 2:");
        l2.setBounds(30, 60, 100, 30);
        l2.setFont(fonte);

        t2 = new JTextField();
        t2.setBounds(120, 60, 150, 30);
        t2.setFont(fonte);

        l3 = new JLabel("Nota 3:");
        l3.setBounds(30, 100, 100, 30);
        l3.setFont(fonte);

        t3 = new JTextField();
        t3.setBounds(120, 100, 150, 30);
        t3.setFont(fonte);

        l4 = new JLabel("Nota 4:");
        l4.setBounds(30, 140, 100, 30);
        l4.setFont(fonte);

        t4 = new JTextField();
        t4.setBounds(120, 140, 150, 30);
        t4.setFont(fonte);

        calcular = new JButton("Calcular");
        calcular.setBounds(100, 190, 120, 35);
        calcular.setFont(fonte);

        resultado = new JLabel("");
        resultado.setBounds(30, 230, 300, 30);
        resultado.setFont(fonte);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());
                double n3 = Double.parseDouble(t3.getText());
                double n4 = Double.parseDouble(t4.getText());

                double media = (n1 + n2 + n3 + n4) / 4;

                resultado.setText("Média: " + media);
            }
        });

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(calcular);
        add(resultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MediaNotas();
    }
}
