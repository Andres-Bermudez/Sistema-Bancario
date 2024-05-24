
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Depositar extends JFrame implements ActionListener {
    private JLabel dineroDeposito;
    private JTextField cantidad;
    private JButton depositar, cancelar;
    
    String dineroIngresado = "";
    
    public static int dineroADepositar = 0;
    public static int saldoFinal = 0;
    public static int saldo = 0;
    
    public Depositar() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Depositar ||");
        getContentPane().setBackground(new Color(50, 140, 90));
        
        dineroDeposito = new JLabel("Ingresa el dinero que vas a depositar:");
        dineroDeposito.setBounds(20, 60, 260, 30);
        dineroDeposito.setFont(new Font("Times New Roman", 2, 15));
        dineroDeposito.setForeground(new Color(255, 255, 255));
        add(dineroDeposito);
        
        cantidad = new JTextField();
        cantidad.setBounds(50, 100, 200, 30);
        add(cantidad);
        
        depositar = new JButton("Depositar");
        depositar.setBounds(100, 150, 100, 30);
        depositar.setFont(new Font("Times New Roman", 1, 13));
        depositar.setForeground(new Color(0, 0, 0));
        depositar.addActionListener(this);
        add(depositar);
        
        cancelar = new JButton("Cancelar");
        cancelar.setBounds(105, 210, 90, 20);
        cancelar.setFont(new Font("Times New Roman", 1, 13));
        cancelar.setForeground(new Color(0, 0, 0));
        cancelar.addActionListener(this);
        add(cancelar);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == depositar) {
            dineroIngresado = cantidad.getText().trim();
            
            if (dineroIngresado.equals("")) { 
                JOptionPane.showMessageDialog(null, "Debes ingresar una suma de dinero");
            
            } else if (dineroIngresado != "") {
                dineroADepositar = Integer.parseInt(dineroIngresado);
                
                if (dineroADepositar != 0) {
                    Datos objeto = new Datos();
                    saldo = objeto.dineroUsuario;
                    
                    // Esta variable es la que almacena el dinero del usuario
                    saldoFinal = dineroADepositar + saldo;
                    
                    JOptionPane.showMessageDialog(null, "¡Deposito finalizado con exito!");
                    
                    Operaciones ventanaOperaciones = new Operaciones();
                    ventanaOperaciones.setBounds(0, 0, 350, 500);
                    ventanaOperaciones.setResizable(false);
                    ventanaOperaciones.setLocationRelativeTo(null);
                    ventanaOperaciones.setVisible(true);
            
                    this.setVisible(false);
                
                } else if (dineroADepositar == 0) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar una suma de dinero superior a $0");
                }
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
    
    public static void main (String[] args) {
        Depositar ventanaDepositar = new Depositar();
        ventanaDepositar.setBounds(0, 0, 300, 250);
        ventanaDepositar.setResizable(false);
        ventanaDepositar.setLocationRelativeTo(null);
        ventanaDepositar.setVisible(true);
    }
}
