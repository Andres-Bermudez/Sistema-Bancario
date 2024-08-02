import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazInicio extends JFrame implements ActionListener {
    // Componentes de la interfaz de inicio
    private final JLabel mensajeBienvenida, banco, mensajeInicio, mensajeInicioDos;
    private final JButton registrarse, salir;
    
    // Contructor
    protected InterfazInicio() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Banco de Colombia ||");
        
        mensajeBienvenida = new JLabel("Bienvenido");
        mensajeBienvenida.setBounds(105, 60, 140, 30);
        mensajeBienvenida.setFont(new Font("Times New Roman", 1, 25));
        add(mensajeBienvenida);
        
        banco = new JLabel("Cajero Automatico");
        banco.setBounds(55, 90, 240, 30);
        banco.setFont(new Font("Times New Roman", 1, 25));
        add(banco);
        
        mensajeInicio = new JLabel("Administra tu dinero");
        mensajeInicio.setBounds(85, 180, 190, 30);
        mensajeInicio.setFont(new Font("Times New Roman", 1, 18));
        add(mensajeInicio);
        
        mensajeInicioDos = new JLabel("Gestiona tus pagos");
        mensajeInicioDos.setBounds(95, 210, 180, 30);
        mensajeInicioDos.setFont(new Font("Times New Roman", 1, 18));
        add(mensajeInicioDos);
        
        registrarse = new JButton("Registrarse");
        registrarse.setBounds(115, 280, 120, 40);
        registrarse.setFont(new Font("Times New Roman", 1, 15));
        registrarse.addActionListener(this);
        add(registrarse);
        
        salir = new JButton("Salir");
        salir.setBounds(135, 400, 80, 25);
        salir.setFont(new Font("Times New Roman", 1, 15));
        salir.addActionListener(this);
        add(salir);
    }
    
    // Funciones de los Botones
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salir) {
            System.exit(0);
            
        } else if (e.getSource() == registrarse) {
            RegistroUsuario.interfazRegistroUsuario();
            this.setVisible(false);
        }
    }
    
    // Creacion de la interfaz de inicio
    protected static void inicio() {
        InterfazInicio ventanaInicio = new InterfazInicio();
        ventanaInicio.setBounds(0, 0, 350, 500);
        ventanaInicio.setResizable(false);
        ventanaInicio.setLocationRelativeTo(null);
        ventanaInicio.setVisible(true);
    }
}
