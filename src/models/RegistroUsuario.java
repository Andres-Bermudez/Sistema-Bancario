package models;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistroUsuario extends JFrame implements ActionListener {
    private final JLabel tituloRegistrarse, tituloNombreUsuario, tituloContraseña, tituloConfirmarContraseña;
    private final JTextField creacionNombreUsuario, creacionContraseñaUsuario, confirmacionContraseñaUsuario;
    private final JButton botonCrearUsuario, volver;
    
    protected RegistroUsuario() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Registrarse ||");
        
        volver = new JButton("Volver");
        volver.setBounds(250, 20, 80, 20);
        volver.setFont(new Font("Times New Roman", 1, 12));
        volver.addActionListener(this);
        add(volver);
        
        tituloRegistrarse = new JLabel("Crear Nuevo Usuario:");
        tituloRegistrarse.setBounds(75, 80, 220, 30);
        tituloRegistrarse.setFont(new Font("Times New Roman", 1, 20));
        add(tituloRegistrarse); 
        
        tituloNombreUsuario = new JLabel("Nuevo nombre de usuario:");
        tituloNombreUsuario.setBounds(75, 140, 160, 30);
        tituloNombreUsuario.setFont(new Font("Times New Roman", 1, 12));
        add(tituloNombreUsuario);
        
        creacionNombreUsuario = new JTextField();
        creacionNombreUsuario.setBounds(75, 170, 200, 30);
        add(creacionNombreUsuario);
        
        tituloContraseña = new JLabel("Nueva contraseña:");
        tituloContraseña.setBounds(75, 220, 150, 30);
        tituloContraseña.setFont(new Font("Times New Roman", 1, 12));
        add(tituloContraseña);
        
        creacionContraseñaUsuario = new JTextField();
        creacionContraseñaUsuario.setBounds(75, 250, 200, 30);
        add(creacionContraseñaUsuario);
        
        tituloConfirmarContraseña = new JLabel("Confirmar contraseña:");
        tituloConfirmarContraseña.setBounds(75, 300, 150, 30);
        tituloConfirmarContraseña.setFont(new Font("Times New Roman", 1, 12));
        add(tituloConfirmarContraseña);
        
        confirmacionContraseñaUsuario = new JTextField();
        confirmacionContraseñaUsuario.setBounds(75, 330, 200, 30);
        add(confirmacionContraseñaUsuario);
        
        botonCrearUsuario = new JButton("Crear Usuario");
        botonCrearUsuario.setBounds(115, 400, 120, 30);
        botonCrearUsuario.setFont(new Font("Times New Roman", 1, 12));
        add(botonCrearUsuario);
        botonCrearUsuario.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCrearUsuario) {
            if (creacionNombreUsuario.getText().isEmpty() || creacionContraseñaUsuario.getText().isEmpty() || confirmacionContraseñaUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Recuerda llenar todos los campos");
                
            } else if (creacionContraseñaUsuario.getText().trim().length() < 8) {
                JOptionPane.showMessageDialog(null, "Tu contraseña debe ser minimo de 8 caracteres!");
                
            } else if (!creacionContraseñaUsuario.getText().trim().equals(confirmacionContraseñaUsuario.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden!");
                
            } else if (creacionContraseñaUsuario.getText().trim().equals(confirmacionContraseñaUsuario.getText().trim())) {
                DatosUsuario.setNombreUsuario(creacionNombreUsuario.getText().trim());
                DatosUsuario.setContraseñaUsuario(creacionContraseñaUsuario.getText().trim());
                
                JOptionPane.showMessageDialog(null, "¡Cuenta creada con exito!");
                IniciarSesion.interfazIniciarSesion();
                this.setVisible(false);
            }
            
        } else if (e.getSource() == volver) {
            InterfazInicio.inicio();
            this.setVisible(false);   
        }
    }
    
    protected static void interfazRegistroUsuario() {
        RegistroUsuario ventanaRegistrarse = new RegistroUsuario();
        ventanaRegistrarse.setBounds(0, 0, 350, 500);
        ventanaRegistrarse.setResizable(false);
        ventanaRegistrarse.setLocationRelativeTo(null);
        ventanaRegistrarse.setVisible(true);
    }
}
