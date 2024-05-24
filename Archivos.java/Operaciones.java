
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Operaciones extends JFrame implements ActionListener {
    private JLabel saludoBienvenida;
    private JButton retirar, depositar, consultarSaldo, salir;
    
    int dinero = 0;
    String nombre = "";
    
    public Operaciones() {
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Operaciones ||");
        getContentPane().setBackground(new Color(60, 20, 40));
        
        Datos objeto = new Datos();
        nombre = objeto.nombreUsuario;
        
        saludoBienvenida = new JLabel("Bienvenido " + nombre);
        saludoBienvenida.setBounds(25, 80, 300, 30);
        saludoBienvenida.setFont(new Font("Times New Roman", 1, 30));
        saludoBienvenida.setForeground(new Color(255, 255, 255));
        add(saludoBienvenida);
        
        retirar = new JButton("Retirar");
        retirar.setBounds(115, 170, 120, 30);
        retirar.setFont(new Font("Times New Roman", 1, 15));
        retirar.setForeground(new Color(0, 0, 0));
        retirar.addActionListener(this);
        add(retirar);
        
        depositar = new JButton("Depositar");
        depositar.setBounds(115, 220, 120, 30);
        depositar.setFont(new Font("Times New Roman", 1, 15));
        depositar.setForeground(new Color(0, 0, 0));
        depositar.addActionListener(this);
        add(depositar);
        
        consultarSaldo = new JButton("Colsultar Saldo");
        consultarSaldo.setBounds(100, 270, 150, 30);
        consultarSaldo.setFont(new Font("Times New Roman", 1, 15));
        consultarSaldo.setForeground(new Color(0, 0, 0));
        consultarSaldo.addActionListener(this);
        add(consultarSaldo);
        
        salir = new JButton("Salir");
        salir.setBounds(135, 370, 80, 30);
        salir.setFont(new Font("Times New Roman", 1, 15));
        salir.setForeground(new Color(0, 0, 0));
        salir.addActionListener(this);
        add(salir); 
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == retirar) {
            
            Datos objeto = new Datos();
            dinero = objeto.dineroUsuario;
            
            if (dinero == 0) {
                JOptionPane.showMessageDialog(null, "Parece que no tienes dinero disponible :(");
                
            } else { 
                Retirar ventanaRetirar = new Retirar();
                ventanaRetirar.setBounds(0, 0, 350, 500);
                ventanaRetirar.setResizable(false);
                ventanaRetirar.setLocationRelativeTo(null);
                ventanaRetirar.setVisible(true);
            
                this.setVisible(false);
            }

        } else if (e.getSource() == depositar) {
            Depositar ventanaDepositar = new Depositar();
            ventanaDepositar.setBounds(0, 0, 300, 250);
            ventanaDepositar.setResizable(false);
            ventanaDepositar.setLocationRelativeTo(null);
            ventanaDepositar.setVisible(true);
            
            this.setVisible(false);
            
        } else if (e.getSource() == consultarSaldo) {
            
            Datos objetoDos = new Datos();
            int dineroDisponible = objetoDos.dineroUsuario;
            
            JOptionPane.showMessageDialog(null, "Saldo Disponible: $" + dineroDisponible);
            
        } else if (e.getSource() == salir) {
            System.exit(0); 
        }
    }
    
    public static void main (String[] args) {
        Operaciones ventanaOperaciones = new Operaciones();
        ventanaOperaciones.setBounds(0, 0, 350, 500);
        ventanaOperaciones.setResizable(false);
        ventanaOperaciones.setLocationRelativeTo(null);
        ventanaOperaciones.setVisible(true);
    }
}
