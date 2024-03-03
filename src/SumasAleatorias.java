import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SumasAleatorias {
    public static void main(String[] args) {
        JFrame marco = new JFrame("Adivina el resultado de la suma");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        // Panel norte
        JPanel panelNorte = new JPanel(new FlowLayout());
        JLabel etiqueta1 = new JLabel("Número 1: ");
        panelNorte.add(etiqueta1);
        JTextField cuadro1 = new JTextField(10);
        panelNorte.add(cuadro1);
        JLabel etiqueta2 = new JLabel("Número 2: ");
        panelNorte.add(etiqueta2);
        JTextField cuadro2 = new JTextField(10);
        panelNorte.add(cuadro2);
        JLabel etiqueta3 = new JLabel("Resultado: ");
        panelNorte.add(etiqueta3);
        JTextField cuadro3 = new JTextField(10);
        panelNorte.add(cuadro3);
        panelNorte.setBorder(new EmptyBorder(10, 10, 10, 10));
        marco.add(panelNorte, BorderLayout.NORTH);

        // Panel centro
        JPanel panelCentro = new JPanel(new FlowLayout());
        JButton boton1 = new JButton("Generar");
        panelCentro.add(boton1);
        JButton boton2 = new JButton("Verificar");
        panelCentro.add(boton2);
        JButton boton3 = new JButton("Salir");
        panelCentro.add(boton3);
        panelCentro.setBorder(new EmptyBorder(10, 10, 10, 10));
        marco.add(panelCentro, BorderLayout.CENTER);

        // Panel sur
        JPanel panelSur = new JPanel(new FlowLayout());
        JLabel etiqueta4 = new JLabel("Intentos: ");
        panelSur.add(etiqueta4);
        JLabel etiqueta5 = new JLabel("0");
        panelSur.add(etiqueta5);
        JLabel etiqueta6 = new JLabel("Aciertos: ");
        panelSur.add(etiqueta6);
        JLabel etiqueta7 = new JLabel("0");
        panelSur.add(etiqueta7);
        JLabel etiqueta8 = new JLabel("Fallados: ");
        panelSur.add(etiqueta8);
        JLabel etiqueta9 = new JLabel("0");
        panelSur.add(etiqueta9);
        panelSur.setBorder(new EmptyBorder(10, 10, 10, 10));
        marco.add(panelSur, BorderLayout.SOUTH);

        marco.pack();


    }

}