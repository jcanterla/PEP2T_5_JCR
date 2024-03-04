import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SumasAleatorias {
    private int intentos = 0;
    private int aciertos = 0;
    private int fallados = 0;
    private boolean presionado = false;

    public SumasAleatorias() {
        JFrame marco = new JFrame("Adivina el resultado de la suma");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

        // Panel norte
        JPanel panelNorte = new JPanel(new FlowLayout());
        JLabel etiqueta1 = new JLabel("Número 1: ");
        panelNorte.add(etiqueta1);
        JTextField cuadro1 = new JTextField(10);
        cuadro1.setHorizontalAlignment(SwingConstants.RIGHT);
        panelNorte.add(cuadro1);
        JLabel etiqueta2 = new JLabel("Número 2: ");
        panelNorte.add(etiqueta2);
        JTextField cuadro2 = new JTextField(10);
        cuadro2.setHorizontalAlignment(SwingConstants.RIGHT);
        panelNorte.add(cuadro2);
        JLabel etiqueta3 = new JLabel("Resultado: ");
        panelNorte.add(etiqueta3);
        JTextField cuadro3 = new JTextField(10);
        cuadro3.setHorizontalAlignment(SwingConstants.RIGHT);
        panelNorte.add(cuadro3);
        panelNorte.setBorder(new EmptyBorder(10, 10, 10, 10));
        marco.add(panelNorte, BorderLayout.NORTH);

        // Panel centro
        JPanel panelCentro = new JPanel(new FlowLayout(FlowLayout.CENTER,20, 0));
        JButton boton1 = new JButton("Generar");
        panelCentro.add(boton1);
        JButton boton2 = new JButton("Verificar");
        panelCentro.add(boton2);
        JButton boton3 = new JButton("Salir");
        panelCentro.add(boton3);
        panelCentro.setBorder(new EmptyBorder(10, 0, 10, 0));
        marco.add(panelCentro, BorderLayout.CENTER);

        // Panel sur
        JPanel panelSur = new JPanel(new FlowLayout(FlowLayout.CENTER,10,0));
        JLabel etiqueta4 = new JLabel("Intentos: ");
        panelSur.add(etiqueta4);
        JLabel etiqueta5 = new JLabel(String.valueOf(intentos));
        panelSur.add(etiqueta5);
        JLabel etiqueta6 = new JLabel("Aciertos: ");
        panelSur.add(etiqueta6);
        JLabel etiqueta7 = new JLabel(String.valueOf(aciertos));
        panelSur.add(etiqueta7);
        JLabel etiqueta8 = new JLabel("Fallados: ");
        panelSur.add(etiqueta8);
        JLabel etiqueta9 = new JLabel(String.valueOf(fallados));
        panelSur.add(etiqueta9);
        panelSur.setBorder(new EmptyBorder(10, 0, 10, 0));
        marco.add(panelSur, BorderLayout.SOUTH);

        // Listeners
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random aleatorio = new Random();
                int num1 = aleatorio.nextInt(1000);
                int num2 = aleatorio.nextInt(1000);
                cuadro1.setText(String.valueOf(num1));
                cuadro2.setText(String.valueOf(num2));
                presionado = true;
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!presionado) {
                    JOptionPane.showMessageDialog(null, "¡Error! Debes generar una suma primero", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                    do {
                        String resultado = JOptionPane.showInputDialog("Teclea tu resultado");
                        if (resultado != null && !resultado.isEmpty()){
                            etiqueta5.setText(String.valueOf(intentos));
                            try {
                                int num1 = Integer.parseInt(cuadro1.getText());
                                int num2 = Integer.parseInt(cuadro2.getText());
                                int suma = num1 + num2;
                                int resultadoUsuario = Integer.parseInt(resultado);
                                cuadro3.setText(String.valueOf(suma));
                                if (suma == resultadoUsuario) {
                                    intentos++;
                                    aciertos++;
                                    etiqueta7.setText(String.valueOf(aciertos));
                                } else {
                                    intentos++;
                                    fallados++;
                                    etiqueta9.setText(String.valueOf(fallados));
                                }
                                break;
                            }catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "¡Error! Debes introducir un número entero", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }else {
                            break;
                        }
                    }while (true);

                }
                }


        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        marco.pack();
        marco.setLocationRelativeTo(null);
        marco.setResizable(false);
    }

}
