
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IniciarSesion extends JFrame implements ActionListener {
    private JLabel titulo, tituloUsuario, tituloContraseña;
    private JTextField nombreUsuario, contraseña;
    private JButton ingresar;

    String nombreIniciarSesion = "";
    String contraseñaIniciarSesion = "";
    
    String consultaNombre = "";
    String consultaContraseña = "";
    
    public IniciarSesion() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Iniciar Sesion ||");
        getContentPane().setBackground(new Color(200, 90, 30));
        
        titulo = new JLabel("Iniciar Sesion");
        titulo.setBounds(75, 120, 160, 30);
        titulo.setFont(new Font("Times New Roman", 3, 23));
        titulo.setForeground(new Color(255, 255, 255));
        add(titulo);
        
        tituloUsuario = new JLabel("Nombre de usuario:");
        tituloUsuario.setBounds(75, 180, 150, 30);
        tituloUsuario.setFont(new Font("Times New Roman", 1, 12));
        tituloUsuario.setForeground(new Color(255, 255, 255));
        add(tituloUsuario);
        
        nombreUsuario = new JTextField();
        nombreUsuario.setBounds(75, 210, 200, 30);
        add(nombreUsuario);
        
        tituloContraseña = new JLabel("Ingresa tu contraseña:");
        tituloContraseña.setBounds(75, 260, 150, 30);
        tituloContraseña.setFont(new Font("Times New Roman", 1, 12));
        tituloContraseña.setForeground(new Color(255, 255, 255));
        add(tituloContraseña);
        
        contraseña = new JTextField();
        contraseña.setBounds(75, 290, 200, 30);
        add(contraseña);
        
        ingresar = new JButton("Ingresar");
        ingresar.setBounds(125, 370, 100, 30);
        ingresar.setFont(new Font("Times New Roman", 1, 15));
        ingresar.setForeground(new Color(0, 0, 0));
        ingresar.addActionListener(this);
        add(ingresar);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ingresar) {
            nombreIniciarSesion = nombreUsuario.getText();
            contraseñaIniciarSesion = contraseña.getText();
            
            Datos objeto = new Datos();
            consultaNombre = objeto.nombreUsuario;
            
            Datos objetoDos = new Datos();
            consultaContraseña = objetoDos.contraseñaUsuario;
            
            if (nombreIniciarSesion.equals(consultaNombre) && contraseñaIniciarSesion.equals(consultaContraseña)) {
                Operaciones ventanaOperaciones = new Operaciones();
                ventanaOperaciones.setBounds(0, 0, 350, 500);
                ventanaOperaciones.setResizable(false);
                ventanaOperaciones.setLocationRelativeTo(null);
                ventanaOperaciones.setVisible(true);
                
                this.setVisible(false);
                
            } else if (nombreIniciarSesion.equals("") || contraseñaIniciarSesion.equals("")) {
               JOptionPane.showMessageDialog(null, "Recuerda llenar todos los campos!");
                
            } else {
                JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña"
                                           + "\n incorrectos verifica e intentalo nuevamente!");
            }
        }
    }
    
    public static void main(String[] args) {
        IniciarSesion ventanaIniciarSesion = new IniciarSesion();
        ventanaIniciarSesion.setBounds(0, 0, 350, 500);
        ventanaIniciarSesion.setResizable(false);
        ventanaIniciarSesion.setLocationRelativeTo(null);
        ventanaIniciarSesion.setVisible(true);
    }
}
