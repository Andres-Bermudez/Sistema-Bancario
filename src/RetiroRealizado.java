import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RetiroRealizado extends JFrame implements ActionListener {
    private final JButton finalizar;
    private final JLabel transaccionExitosa, nombreDato, tipoTransaccion, saldoDisponible, valor, mensajeFinal;
    
    protected RetiroRealizado() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Transaccion Exitosa ||");
        getContentPane().setBackground(new Color(20, 20, 20));
        
        transaccionExitosa = new JLabel("¡Transaccion Exitosa!");
        transaccionExitosa.setBounds(45, 40, 210, 30);
        transaccionExitosa.setFont(new Font("Times New Roman", 3, 20));
        transaccionExitosa.setForeground(new Color(255, 255, 255));
        add(transaccionExitosa);
        
        nombreDato = new JLabel("Nombre: " + DatosUsuario.getNombreUsuario());
        nombreDato.setBounds(45, 110, 210, 30);
        nombreDato.setFont(new Font("Times New Roman", 1, 15));
        nombreDato.setForeground(new Color(255, 255, 255));
        add(nombreDato);
        
        tipoTransaccion = new JLabel("Tipo de transaccion: Retiro");
        tipoTransaccion.setBounds(45, 140, 210, 30);
        tipoTransaccion.setFont(new Font("Times New Roman", 1, 15));
        tipoTransaccion.setForeground(new Color(255, 255, 255));
        add(tipoTransaccion);
        
        valor = new JLabel("Valor Retiro: $" + Retirar.dineroARetirar);
        valor.setBounds(45, 170, 210, 30);
        valor.setFont(new Font("Times New Roman", 1, 15));
        valor.setForeground(new Color(255, 255, 255));
        add(valor);
        
        saldoDisponible = new JLabel("Saldo disponible: $" + DatosUsuario.getDineroUsuario());
        saldoDisponible.setBounds(35, 200, 230, 30);
        saldoDisponible.setFont(new Font("Times New Roman", 1, 15));
        saldoDisponible.setForeground(new Color(255, 255, 255));
        add(saldoDisponible);
        
        mensajeFinal = new JLabel("Gracias por usar nuestros servicios");
        mensajeFinal.setBounds(20, 250, 260, 30);
        mensajeFinal.setFont(new Font("Times New Roman", 1, 15));
        mensajeFinal.setForeground(new Color(255, 255, 255));
        add(mensajeFinal);
        
        finalizar = new JButton("Finalizar");
        finalizar.setBounds(105, 320, 90, 30);
        finalizar.setFont(new Font("Times New Roman", 1, 13));
        finalizar.setForeground(new Color(0, 0, 0));
        finalizar.addActionListener(this);
        add(finalizar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == finalizar) {
            Operaciones ventanaOperaciones = new Operaciones();
            ventanaOperaciones.setBounds(0, 0, 350, 500);
            ventanaOperaciones.setResizable(false);
            ventanaOperaciones.setLocationRelativeTo(null);
            ventanaOperaciones.setVisible(true);
            
            this.setVisible(false);
        }
    }
    
    protected static void interfazRetiroRealizado() {
        RetiroRealizado ventanaRetiroRealizado = new RetiroRealizado();
        ventanaRetiroRealizado.setBounds(0, 0, 300, 400);
        ventanaRetiroRealizado.setResizable(false);
        ventanaRetiroRealizado.setLocationRelativeTo(null);
        ventanaRetiroRealizado.setVisible(true);
    }
}
