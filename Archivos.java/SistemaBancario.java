
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Interfaz de inicio
public class SistemaBancario extends JFrame implements ActionListener {
    // Declaracion de los componentes de la interfaz de inicio
    private JLabel mensajeBienvenida, banco, mensajeInicio, mensajeInicioDos, mensajeInicioTres;
    private JButton registrarse, salir;
    
    // Contructor con cada componente
    public SistemaBancario() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Banco de Colombia ||");
        getContentPane().setBackground(new Color(20, 90, 60));
        
        mensajeBienvenida = new JLabel("Bienvenido");
        mensajeBienvenida.setBounds(105, 60, 140, 30);
        mensajeBienvenida.setFont(new Font("Times New Roman", 1, 25));
        mensajeBienvenida.setForeground(new Color(255, 255, 255));
        add(mensajeBienvenida);
        
        banco = new JLabel("Banco de Colombia");
        banco.setBounds(55, 90, 240, 30);
        banco.setFont(new Font("Times New Roman", 1, 25));
        banco.setForeground(new Color(255, 255, 255));
        add(banco);
        
        mensajeInicio = new JLabel("Gestiona tu dinero");
        mensajeInicio.setBounds(85, 160, 180, 30);
        mensajeInicio.setFont(new Font("Times New Roman", 1, 18));
        mensajeInicio.setForeground(new Color(255, 180, 95));
        add(mensajeInicio);
        
        mensajeInicioDos = new JLabel("Paga tus facturas");
        mensajeInicioDos.setBounds(95, 190, 160, 30);
        mensajeInicioDos.setFont(new Font("Times New Roman", 1, 18));
        mensajeInicioDos.setForeground(new Color(155, 90, 245));
        add(mensajeInicioDos);
        
        mensajeInicioTres = new JLabel("Inversiones & Mucho mas");
        mensajeInicioTres.setBounds(55, 220, 240, 30);
        mensajeInicioTres.setFont(new Font("Times New Roman", 1, 18));
        mensajeInicioTres.setForeground(new Color(25, 180, 25));
        add(mensajeInicioTres);
        
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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salir) {
            System.exit(0);
            
        } else if (e.getSource() == registrarse) {
            Registrarse ventanaRegistrarse = new Registrarse();
            ventanaRegistrarse.setBounds(0, 0, 350, 500);
            ventanaRegistrarse.setResizable(false);
            ventanaRegistrarse.setLocationRelativeTo(null);
            ventanaRegistrarse.setVisible(true);
            
            this.setVisible(false);
        }
    }
    
    // Creacion de la interfaz de inicio
    public static void main(String[] args) {
        SistemaBancario ventanaInicio = new SistemaBancario();
        ventanaInicio.setBounds(0, 0, 350, 500);
        ventanaInicio.setResizable(false);
        ventanaInicio.setLocationRelativeTo(null);
        ventanaInicio.setVisible(true);
    }
}
