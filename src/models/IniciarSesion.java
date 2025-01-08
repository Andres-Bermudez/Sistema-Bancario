package models;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IniciarSesion extends JFrame implements ActionListener {
    private final JLabel titulo, tituloUsuario, tituloContraseña;
    private final JTextField nombreUsuario, contraseñaUsuario;
    private final JButton ingresar;
    
    protected IniciarSesion() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Iniciar Sesion ||");
        
        titulo = new JLabel("Iniciar Sesion");
        titulo.setBounds(75, 120, 160, 30);
        titulo.setFont(new Font("Times New Roman", 3, 23));
        add(titulo);
        
        tituloUsuario = new JLabel("Nombre de usuario:");
        tituloUsuario.setBounds(75, 180, 150, 30);
        tituloUsuario.setFont(new Font("Times New Roman", 1, 12));
        add(tituloUsuario);
        
        nombreUsuario = new JTextField();
        nombreUsuario.setBounds(75, 210, 200, 30);
        add(nombreUsuario);
        
        tituloContraseña = new JLabel("Ingresa tu contraseña:");
        tituloContraseña.setBounds(75, 260, 150, 30);
        tituloContraseña.setFont(new Font("Times New Roman", 1, 12));
        add(tituloContraseña);
        
        contraseñaUsuario = new JTextField();
        contraseñaUsuario.setBounds(75, 290, 200, 30);
        add(contraseñaUsuario);
        
        ingresar = new JButton("Ingresar");
        ingresar.setBounds(125, 370, 100, 30);
        ingresar.setFont(new Font("Times New Roman", 1, 15));
        ingresar.addActionListener(this);
        add(ingresar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombreIniciarSesion = nombreUsuario.getText();
        String contraseñaIniciarSesion = contraseñaUsuario.getText();
        
        if (e.getSource() == ingresar) {
            
            if (nombreIniciarSesion.isEmpty() || contraseñaIniciarSesion.isEmpty()) {
               JOptionPane.showMessageDialog(null, "Recuerda llenar todos los campos!");
            
            } else if (nombreIniciarSesion.trim().equals(DatosUsuario.getNombreUsuario()) &&
                    contraseñaIniciarSesion.trim().equals(DatosUsuario.getContraseñaUsuario())) {
                
                Operaciones.interfazOperaciones();
                this.setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(null, "          Nombre de usuario o contraseña"
                                                + "\nincorrectos, verificalos e intentalo nuevamente!");
            }
        }
    }
    
    protected static void interfazIniciarSesion() {
        IniciarSesion ventanaIniciarSesion = new IniciarSesion();
        ventanaIniciarSesion.setBounds(0, 0, 350, 500);
        ventanaIniciarSesion.setResizable(false);
        ventanaIniciarSesion.setLocationRelativeTo(null);
        ventanaIniciarSesion.setVisible(true);
    }
}
