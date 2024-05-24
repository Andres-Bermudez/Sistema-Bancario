
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registrarse extends JFrame implements ActionListener {
    private JLabel tituloRegistrarse, tituloNombreUsuario, tituloContraseña, tituloConfirmarContraseña;
    private JTextField crearNombreUsuario, crearContraseña, confirmarContraseña;
    private JButton botonCrearUsuario, volver;
    
    public static String nombreUsuarioCreado = "";
    public static String contraseñaCreada = "";
    public static String confirmarContraseñaCreada = "";
    public static int dineroUsuario = 0;
    
    private int dineroDepositado;
    
    public Registrarse() {
        
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
        
        crearNombreUsuario = new JTextField();
        crearNombreUsuario.setBounds(75, 170, 200, 30);
        add(crearNombreUsuario);
        
        tituloContraseña = new JLabel("Nueva contraseña:");
        tituloContraseña.setBounds(75, 220, 150, 30);
        tituloContraseña.setFont(new Font("Times New Roman", 1, 12));
        tituloContraseña.setForeground(new Color(255, 255, 255));
        add(tituloContraseña);
        
        crearContraseña = new JTextField();
        crearContraseña.setBounds(75, 250, 200, 30);
        add(crearContraseña);
        
        tituloConfirmarContraseña = new JLabel("Confirmar contraseña:");
        tituloConfirmarContraseña.setBounds(75, 300, 150, 30);
        tituloConfirmarContraseña.setFont(new Font("Times New Roman", 1, 12));
        tituloConfirmarContraseña.setForeground(new Color(255, 255, 255));
        add(tituloConfirmarContraseña);
        
        confirmarContraseña = new JTextField();
        confirmarContraseña.setBounds(75, 330, 200, 30);
        add(confirmarContraseña);
        
        botonCrearUsuario = new JButton("Crear Usuario");
        botonCrearUsuario.setBounds(115, 400, 120, 30);
        botonCrearUsuario.setFont(new Font("Times New Roman", 1, 12));
        botonCrearUsuario.setForeground(new Color(0, 0, 0));
        add(botonCrearUsuario);
        botonCrearUsuario.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCrearUsuario) {
            nombreUsuarioCreado = crearNombreUsuario.getText();
            contraseñaCreada = crearContraseña.getText();
            confirmarContraseñaCreada = confirmarContraseña.getText();
            
            // Con esto verificamos que la contraseña sea minimo de 8 caracteres
            // Se complementa con lo que esta en la linea 91
            int contador = 0;
            
            for (int i = 0; i < contraseñaCreada.length(); i++) {
                contador += 1;
            }
            
            if (nombreUsuarioCreado.equals("") || contraseñaCreada.equals("") || confirmarContraseñaCreada.equals("")) {
                JOptionPane.showMessageDialog(null, "Recuerda llenar todos los campos");
                
            } else if (contador < 8) {
                JOptionPane.showMessageDialog(null, "Tu contraseña debe ser minimo de 8 caracteres!");
                
            } else if (contraseñaCreada.equals(confirmarContraseñaCreada)) {
                dineroUsuario = 0;
                
                JOptionPane.showMessageDialog(null, "Cuenta creada con exito!");
             
                IniciarSesion ventanaIniciarSesion = new IniciarSesion();
                ventanaIniciarSesion.setBounds(0, 0, 350, 500);
                ventanaIniciarSesion.setResizable(false);
                ventanaIniciarSesion.setLocationRelativeTo(null);
                ventanaIniciarSesion.setVisible(true);
                
                this.setVisible(false);
                
            } else if (contraseñaCreada != confirmarContraseñaCreada) {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden!");
                
            } 
            
        } else if (e.getSource() == volver) {
            SistemaBancario ventanaInicio = new SistemaBancario();
            ventanaInicio.setBounds(0, 0, 350, 500);
            ventanaInicio.setResizable(false);
            ventanaInicio.setLocationRelativeTo(null);
            ventanaInicio.setVisible(true);
            
            this.setVisible(false);   
        }
    }
    
    public static void main (String[] args) {
        Registrarse ventanaRegistrarse = new Registrarse();
        ventanaRegistrarse.setBounds(0, 0, 350, 500);
        ventanaRegistrarse.setResizable(false);
        ventanaRegistrarse.setLocationRelativeTo(null);
        ventanaRegistrarse.setVisible(true);
    }
}
