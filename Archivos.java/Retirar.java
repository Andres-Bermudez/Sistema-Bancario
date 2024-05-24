
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Retirar extends JFrame implements ActionListener {

    private JButton botonUno, botonDos, botonTres, botonCuatro, botonCinco, botonSeis, cancelar;
    private JLabel labelTitulo, labelTituloDos, saldoUsuario, labelUno, labelDos, labelTres, labelCuatro, labelCinco, labelSeis;

    int dinero = 0;
    public static int dineroARetirar = 0;
    public static int variableDepositar = 0;
    public static int dineroRetiro = 0;

    public Retirar() {
        Datos objeto = new Datos();
        dinero = objeto.dineroUsuario;
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Retirar ||");
        getContentPane().setBackground(new Color(40, 40, 40));

        labelTitulo = new JLabel("Selecciona la cantidad ");
        labelTitulo.setBounds(60, 60, 230, 30);
        labelTitulo.setFont(new Font("Times New Roman", 1, 20));
        labelTitulo.setForeground(new Color(255, 255, 255));
        add(labelTitulo);

        labelTituloDos = new JLabel("que vas a retirar:");
        labelTituloDos.setBounds(90, 90, 170, 30);
        labelTituloDos.setFont(new Font("Times New Roman", 1, 20));
        labelTituloDos.setForeground(new Color(255, 255, 255));
        add(labelTituloDos);

        saldoUsuario = new JLabel("Tu Saldo: $" + dinero);
        saldoUsuario.setBounds(90, 150, 170, 30);
        saldoUsuario.setFont(new Font("Times New Roman", 1, 15));
        saldoUsuario.setForeground(new Color(255, 255, 255));
        add(saldoUsuario);

        botonUno = new JButton();
        botonUno.setBounds(25, 200, 30, 30);
        botonUno.setFont(new Font("Times New Roman", 1, 15));
        botonUno.setForeground(new Color(255, 255, 255));
        botonUno.addActionListener(this);
        add(botonUno);

        botonDos = new JButton();
        botonDos.setBounds(25, 270, 30, 30);
        botonDos.setFont(new Font("Times New Roman", 1, 15));
        botonDos.setForeground(new Color(255, 255, 255));
        botonDos.addActionListener(this);
        add(botonDos);

        botonTres = new JButton();
        botonTres.setBounds(25, 340, 30, 30);
        botonTres.setFont(new Font("Times New Roman", 1, 15));
        botonTres.setForeground(new Color(255, 255, 255));
        botonTres.addActionListener(this);
        add(botonTres);

        botonCuatro = new JButton();
        botonCuatro.setBounds(295, 200, 30, 30);
        botonCuatro.setFont(new Font("Times New Roman", 1, 15));
        botonCuatro.setForeground(new Color(255, 255, 255));
        botonCuatro.addActionListener(this);
        add(botonCuatro);

        botonCinco = new JButton();
        botonCinco.setBounds(295, 270, 30, 30);
        botonCinco.setFont(new Font("Times New Roman", 1, 15));
        botonCinco.setForeground(new Color(255, 255, 255));
        botonCinco.addActionListener(this);
        add(botonCinco);

        botonSeis = new JButton();
        botonSeis.setBounds(295, 340, 30, 30);
        botonSeis.setFont(new Font("Times New Roman", 1, 15));
        botonSeis.setForeground(new Color(255, 255, 255));
        botonSeis.addActionListener(this);
        add(botonSeis);

        labelUno = new JLabel("$20.000");
        labelUno.setBounds(60, 200, 90, 30);
        labelUno.setFont(new Font("Times New Roman", 1, 14));
        labelUno.setForeground(new Color(0, 255, 0));
        add(labelUno);

        labelDos = new JLabel("$50.000");
        labelDos.setBounds(60, 270, 90, 30);
        labelDos.setFont(new Font("Times New Roman", 1, 14));
        labelDos.setForeground(new Color(0, 255, 0));
        add(labelDos);

        labelTres = new JLabel("$100.000");
        labelTres.setBounds(60, 340, 90, 30);
        labelTres.setFont(new Font("Times New Roman", 1, 14));
        labelTres.setForeground(new Color(0, 255, 0));
        add(labelTres);

        labelCuatro = new JLabel("$500.000");
        labelCuatro.setBounds(225, 200, 70, 30);
        labelCuatro.setFont(new Font("Times New Roman", 1, 14));
        labelCuatro.setForeground(new Color(0, 255, 0));
        add(labelCuatro);

        labelCinco = new JLabel("$1'000.000");
        labelCinco.setBounds(215, 270, 80, 30);
        labelCinco.setFont(new Font("Times New Roman", 1, 14));
        labelCinco.setForeground(new Color(0, 255, 0));
        add(labelCinco);

        labelSeis = new JLabel("$10'000.000");
        labelSeis.setBounds(205, 340, 90, 30);
        labelSeis.setFont(new Font("Times New Roman", 1, 14));
        labelSeis.setForeground(new Color(0, 255, 0));
        add(labelSeis);
        
        cancelar = new JButton("Cancelar");
        cancelar.setBounds(125, 400, 100, 30);
        cancelar.setFont(new Font("Times New Roman", 1, 15));
        cancelar.setForeground(new Color(0, 0, 0));
        cancelar.addActionListener(this);
        add(cancelar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonUno) {
            dineroARetirar = 20000;
            
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $20.000 pesos");
            
            if (dineroARetirar <= dinero) {
                ConfirmarTransaccion ventanaConfirmarContraseña = new ConfirmarTransaccion();
                ventanaConfirmarContraseña.setBounds(0, 0, 250, 300);
                ventanaConfirmarContraseña.setResizable(false);
                ventanaConfirmarContraseña.setLocationRelativeTo(null);
                ventanaConfirmarContraseña.setVisible(true);
                
                this.setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(null, "Lo siento no tienes saldo suficiente");
            }
            
        } else if (e.getSource() == botonDos) {
            dineroARetirar = 50000;
            
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $50.000 pesos");
            
            if (dineroARetirar > dinero) {
                JOptionPane.showMessageDialog(null, "Lo siento no tienes saldo suficiente");
                
            } else {
                ConfirmarTransaccion ventanaConfirmarContraseña = new ConfirmarTransaccion();
                ventanaConfirmarContraseña.setBounds(0, 0, 250, 300);
                ventanaConfirmarContraseña.setResizable(false);
                ventanaConfirmarContraseña.setLocationRelativeTo(null);
                ventanaConfirmarContraseña.setVisible(true);
                
                this.setVisible(false);
            }

        } else if (e.getSource() == botonTres) {
            dineroARetirar = 100000;
            
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $100.000 pesos");
            
            if (dineroARetirar > dinero) {
                JOptionPane.showMessageDialog(null, "Lo siento no tienes saldo suficiente");
                
            } else {
                ConfirmarTransaccion ventanaConfirmarContraseña = new ConfirmarTransaccion();
                ventanaConfirmarContraseña.setBounds(0, 0, 250, 300);
                ventanaConfirmarContraseña.setResizable(false);
                ventanaConfirmarContraseña.setLocationRelativeTo(null);
                ventanaConfirmarContraseña.setVisible(true);
                
                this.setVisible(false);
            }

        } else if (e.getSource() == botonCuatro) {
            dineroARetirar = 500000;
            
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $500.000 pesos");
            
            if (dineroARetirar > dinero) {
                JOptionPane.showMessageDialog(null, "Lo siento no tienes saldo suficiente");
                
            } else {
                ConfirmarTransaccion ventanaConfirmarContraseña = new ConfirmarTransaccion();
                ventanaConfirmarContraseña.setBounds(0, 0, 250, 300);
                ventanaConfirmarContraseña.setResizable(false);
                ventanaConfirmarContraseña.setLocationRelativeTo(null);
                ventanaConfirmarContraseña.setVisible(true);
                
                this.setVisible(false);
            }

        } else if (e.getSource() == botonCinco) {
            dineroARetirar = 1000000;
            
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $1'000.000 pesos");
            
            if (dineroARetirar > dinero) {
                JOptionPane.showMessageDialog(null, "Lo siento no tienes saldo suficiente");
                
            } else {
                ConfirmarTransaccion ventanaConfirmarContraseña = new ConfirmarTransaccion();
                ventanaConfirmarContraseña.setBounds(0, 0, 250, 300);
                ventanaConfirmarContraseña.setResizable(false);
                ventanaConfirmarContraseña.setLocationRelativeTo(null);
                ventanaConfirmarContraseña.setVisible(true);
                
                this.setVisible(false);
            }

        } else if (e.getSource() == botonSeis) {
            dineroARetirar = 10000000;
            
            JOptionPane.showMessageDialog(null, "Vas a realizar un retiro de $10'000.000 pesos");
            
            if (dineroARetirar > dinero) {
                JOptionPane.showMessageDialog(null, "Lo siento no tienes saldo suficiente");
                
            } else {
                ConfirmarTransaccion ventanaConfirmarContraseña = new ConfirmarTransaccion();
                ventanaConfirmarContraseña.setBounds(0, 0, 250, 300);
                ventanaConfirmarContraseña.setResizable(false);
                ventanaConfirmarContraseña.setLocationRelativeTo(null);
                ventanaConfirmarContraseña.setVisible(true);
                
                this.setVisible(false);
            }

        } else if (e.getSource() == cancelar) {
            Operaciones ventanaOperaciones = new Operaciones();
            ventanaOperaciones.setBounds(0, 0, 350, 500);
            ventanaOperaciones.setResizable(false);
            ventanaOperaciones.setLocationRelativeTo(null);
            ventanaOperaciones.setVisible(true);
            
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Retirar ventanaRetirar = new Retirar();
        ventanaRetirar.setBounds(0, 0, 350, 500);
        ventanaRetirar.setResizable(false);
        ventanaRetirar.setLocationRelativeTo(null);
        ventanaRetirar.setVisible(true);
    }
}
