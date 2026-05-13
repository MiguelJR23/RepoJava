package com.mycompany.IMC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IMC extends JFrame {

    JLabel lpeso, laltura, resultado;
    JTextField tpeso, taltura;
    JButton calcular;

    public IMC() {

        setTitle("IMC");
        setSize(400, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        Font fonte = new Font("Comic Sans MS", Font.PLAIN, 16);

        lpeso = new JLabel("Peso:");
        lpeso.setBounds(30, 40, 100, 30);
        lpeso.setFont(fonte);

        tpeso = new JTextField();
        tpeso.setBounds(130, 40, 180, 30);
        tpeso.setFont(fonte);

        laltura = new JLabel("Altura:");
        laltura.setBounds(30, 90, 100, 30);
        laltura.setFont(fonte);

        taltura = new JTextField();
        taltura.setBounds(130, 90, 180, 30);
        taltura.setFont(fonte);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 150, 120, 35);
        calcular.setFont(fonte);

        resultado = new JLabel("");
        resultado.setBounds(30, 210, 350, 30);
        resultado.setFont(fonte);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double peso = Double.parseDouble(tpeso.getText());
                double altura = Double.parseDouble(taltura.getText());

                double imc = peso / (altura * altura);

                if (imc < 18.5) {
                    resultado.setText("Abaixo do peso");
                }
                else if (imc <= 24.99) {
                    resultado.setText("Peso ideal");
                }
                else {
                    resultado.setText("Acima do peso");
                }
            }
        });

        add(lpeso);
        add(tpeso);
        add(laltura);
        add(taltura);
        add(calcular);
        add(resultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        new IMC();
    }
}
