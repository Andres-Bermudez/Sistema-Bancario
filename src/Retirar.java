import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Retirar extends JFrame implements ActionListener {
    private final JButton botonUno, botonDos, botonTres, botonCuatro, botonCinco, botonSeis, cancelar;
    private final JLabel labelTitulo, labelTituloDos, saldoUsuario, labelUno, labelDos, labelTres, labelCuatro, labelCinco, labelSeis;

    protected static int dineroARetirar;
    
    protected Retirar() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Retirar ||");

        labelTitulo = new JLabel("Selecciona la cantidad ");
        labelTitulo.setBounds(60, 60, 230, 30);
        labelTitulo.setFont(new Font("Times New Roman", 1, 20));
        add(labelTitulo);

        labelTituloDos = new JLabel("que vas a retirar:");
        labelTituloDos.setBounds(90, 90, 170, 30);
        labelTituloDos.setFont(new Font("Times New Roman", 1, 20));
        add(labelTituloDos);

        saldoUsuario = new JLabel("Tu Saldo: $" + DatosUsuario.getDineroUsuario());
        saldoUsuario.setBounds(90, 150, 170, 30);
        saldoUsuario.setFont(new Font("Times New Roman", 1, 15));
        add(saldoUsuario);

        botonUno = new JButton();
        botonUno.setBounds(25, 200, 30, 30);
        botonUno.setFont(new Font("Times New Roman", 1, 15));
        botonUno.addActionListener(this);
        add(botonUno);

        botonDos = new JButton();
        botonDos.setBounds(25, 270, 30, 30);
        botonDos.setFont(new Font("Times New Roman", 1, 15));
        botonDos.addActionListener(this);
        add(botonDos);

        botonTres = new JButton();
        botonTres.setBounds(25, 340, 30, 30);
        botonTres.setFont(new Font("Times New Roman", 1, 15));
        botonTres.addActionListener(this);
        add(botonTres);

        botonCuatro = new JButton();
        botonCuatro.setBounds(295, 200, 30, 30);
        botonCuatro.setFont(new Font("Times New Roman", 1, 15));
        botonCuatro.addActionListener(this);
        add(botonCuatro);

        botonCinco = new JButton();
        botonCinco.setBounds(295, 270, 30, 30);
        botonCinco.setFont(new Font("Times New Roman", 1, 15));
        botonCinco.addActionListener(this);
        add(botonCinco);

        botonSeis = new JButton();
        botonSeis.setBounds(295, 340, 30, 30);
        botonSeis.setFont(new Font("Times New Roman", 1, 15));
        botonSeis.addActionListener(this);
        add(botonSeis);

        labelUno = new JLabel("$20.000");
        labelUno.setBounds(60, 200, 90, 30);
        labelUno.setFont(new Font("Times New Roman", 1, 14));
        add(labelUno);

        labelDos = new JLabel("$50.000");
        labelDos.setBounds(60, 270, 90, 30);
        labelDos.setFont(new Font("Times New Roman", 1, 14));
        add(labelDos);

        labelTres = new JLabel("$100.000");
        labelTres.setBounds(60, 340, 90, 30);
        labelTres.setFont(new Font("Times New Roman", 1, 14));
        add(labelTres);

        labelCuatro = new JLabel("$500.000");
        labelCuatro.setBounds(225, 200, 70, 30);
        labelCuatro.setFont(new Font("Times New Roman", 1, 14));
        add(labelCuatro);

        labelCinco = new JLabel("$1'000.000");
        labelCinco.setBounds(215, 270, 80, 30);
        labelCinco.setFont(new Font("Times New Roman", 1, 14));
        add(labelCinco);

        labelSeis = new JLabel("$10'000.000");
        labelSeis.setBounds(205, 340, 90, 30);
        labelSeis.setFont(new Font("Times New Roman", 1, 14));
        add(labelSeis);
        
        cancelar = new JButton("Cancelar");
        cancelar.setBounds(125, 400, 100, 30);
        cancelar.setFont(new Font("Times New Roman", 1, 15));
        cancelar.addActionListener(this);
        add(cancelar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonUno) {
            dineroARetirar = 20000;
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $20.000 pesos");
            
        } else if (e.getSource() == botonDos) {
            dineroARetirar = 50000;
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $50.000 pesos");

        } else if (e.getSource() == botonTres) {
            dineroARetirar = 100000;
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $100.000 pesos");

        } else if (e.getSource() == botonCuatro) {
            dineroARetirar = 500000;
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $500.000 pesos");

        } else if (e.getSource() == botonCinco) {
            dineroARetirar = 1000000;
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $1'000.000 pesos");

        } else if (e.getSource() == botonSeis) {
            dineroARetirar = 10000000;
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $10'000.000 pesos");

        } else if (e.getSource() == cancelar) {
            Operaciones.interfazOperaciones();
            this.setVisible(false);
        }
            
        if (dineroARetirar > DatosUsuario.getDineroUsuario()) {
                JOptionPane.showMessageDialog(null, "Lo siento no tienes saldo suficiente");
                
        } else {
            ConfirmarTransaccion.interfazConfirmacionDatos();
            this.setVisible(false);
        }
    }

    protected static void interfazRetirarDinero() {
        Retirar ventanaRetirar = new Retirar();
        ventanaRetirar.setBounds(0, 0, 350, 500);
        ventanaRetirar.setResizable(false);
        ventanaRetirar.setLocationRelativeTo(null);
        ventanaRetirar.setVisible(true);
    }
}
