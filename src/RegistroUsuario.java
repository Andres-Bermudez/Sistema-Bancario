import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistroUsuario extends JFrame implements ActionListener {
    private final JLabel tituloRegistrarse, tituloNombreUsuario, tituloContraseña, tituloConfirmarContraseña;
    private final JTextField creacionNombreUsuario, creacionContraseñaUsuario, confirmacionContraseña;
    private final JButton botonCrearUsuario, volver;
    
    protected RegistroUsuario() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Registrarse ||");
        getContentPane().setBackground(new Color(87, 35, 100));
        
        volver = new JButton("Volver");
        volver.setBounds(250, 20, 80, 20);
        volver.setFont(new Font("Times New Roman", 1, 12));
        volver.setForeground(new Color(0, 0, 0));
        volver.addActionListener(this);
        add(volver);
        
        tituloRegistrarse = new JLabel("Crear Nuevo Usuario:");
        tituloRegistrarse.setBounds(75, 80, 220, 30);
        tituloRegistrarse.setFont(new Font("Times New Roman", 1, 20));
        tituloRegistrarse.setForeground(new Color(255, 255, 255));
        add(tituloRegistrarse); 
        
        tituloNombreUsuario = new JLabel("Nuevo nombre de usuario:");
        tituloNombreUsuario.setBounds(75, 140, 160, 30);
        tituloNombreUsuario.setFont(new Font("Times New Roman", 1, 12));
        tituloNombreUsuario.setForeground(new Color(255, 255, 255));
        add(tituloNombreUsuario);
        
        creacionNombreUsuario = new JTextField();
        creacionNombreUsuario.setBounds(75, 170, 200, 30);
        add(creacionNombreUsuario);
        
        tituloContraseña = new JLabel("Nueva contraseña:");
        tituloContraseña.setBounds(75, 220, 150, 30);
        tituloContraseña.setFont(new Font("Times New Roman", 1, 12));
        tituloContraseña.setForeground(new Color(255, 255, 255));
        add(tituloContraseña);
        
        creacionContraseñaUsuario = new JTextField();
        creacionContraseñaUsuario.setBounds(75, 250, 200, 30);
        add(creacionContraseñaUsuario);
        
        tituloConfirmarContraseña = new JLabel("Confirmar contraseña:");
        tituloConfirmarContraseña.setBounds(75, 300, 150, 30);
        tituloConfirmarContraseña.setFont(new Font("Times New Roman", 1, 12));
        tituloConfirmarContraseña.setForeground(new Color(255, 255, 255));
        add(tituloConfirmarContraseña);
        
        confirmacionContraseña = new JTextField();
        confirmacionContraseña.setBounds(75, 330, 200, 30);
        add(confirmacionContraseña);
        
        botonCrearUsuario = new JButton("Crear Usuario");
        botonCrearUsuario.setBounds(115, 400, 120, 30);
        botonCrearUsuario.setFont(new Font("Times New Roman", 1, 12));
        botonCrearUsuario.setForeground(new Color(0, 0, 0));
        add(botonCrearUsuario);
        botonCrearUsuario.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String confirmarContraseñaCreada = confirmacionContraseña.getText();
        
        if (e.getSource() == botonCrearUsuario) {
            
            if (creacionNombreUsuario.getText().isEmpty() || creacionContraseñaUsuario.getText().isEmpty() || confirmarContraseñaCreada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Recuerda llenar todos los campos");
                
            } else if (creacionContraseñaUsuario.getText().trim().length() < 8) {
                JOptionPane.showMessageDialog(null, "Tu contraseña debe ser minimo de 8 caracteres!");
                
            } else if (creacionContraseñaUsuario.getText().trim().equals(confirmarContraseñaCreada.trim())) {
                DatosUsuario.setNombreUsuario(creacionNombreUsuario.getText());
                DatosUsuario.setContraseñaUsuario(creacionContraseñaUsuario.getText());
                
                JOptionPane.showMessageDialog(null, "Cuenta creada con exito!");
             
                IniciarSesion ventanaIniciarSesion = new IniciarSesion();
                ventanaIniciarSesion.setBounds(0, 0, 350, 500);
                ventanaIniciarSesion.setResizable(false);
                ventanaIniciarSesion.setLocationRelativeTo(null);
                ventanaIniciarSesion.setVisible(true);
                
                this.setVisible(false);
                
            } else if (!creacionContraseñaUsuario.getText().trim().equals(confirmarContraseñaCreada.trim())) {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden!");
            } 
            
        } else if (e.getSource() == volver) {
            InterfazInicio ventanaInicio = new InterfazInicio();
            ventanaInicio.setBounds(0, 0, 350, 500);
            ventanaInicio.setResizable(false);
            ventanaInicio.setLocationRelativeTo(null);
            ventanaInicio.setVisible(true);
            
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
