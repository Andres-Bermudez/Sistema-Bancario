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
        
        transaccionExitosa = new JLabel("¡Transaccion Exitosa!");
        transaccionExitosa.setBounds(45, 40, 210, 30);
        transaccionExitosa.setFont(new Font("Times New Roman", 3, 20));
        add(transaccionExitosa);
        
        nombreDato = new JLabel("Nombre: " + DatosUsuario.getNombreUsuario());
        nombreDato.setBounds(45, 110, 210, 30);
        nombreDato.setFont(new Font("Times New Roman", 1, 15));
        add(nombreDato);
        
        tipoTransaccion = new JLabel("Tipo de transaccion: Retiro");
        tipoTransaccion.setBounds(45, 140, 210, 30);
        tipoTransaccion.setFont(new Font("Times New Roman", 1, 15));
        add(tipoTransaccion);
        
        valor = new JLabel("Valor Retiro: $" + Retirar.dineroARetirar);
        valor.setBounds(45, 170, 210, 30);
        valor.setFont(new Font("Times New Roman", 1, 15));
        add(valor);
        
        saldoDisponible = new JLabel("Saldo disponible: $" + DatosUsuario.getDineroUsuario());
        saldoDisponible.setBounds(35, 200, 230, 30);
        saldoDisponible.setFont(new Font("Times New Roman", 1, 15));
        add(saldoDisponible);
        
        mensajeFinal = new JLabel("Gracias por usar nuestros servicios");
        mensajeFinal.setBounds(20, 250, 260, 30);
        mensajeFinal.setFont(new Font("Times New Roman", 1, 15));
        add(mensajeFinal);
        
        finalizar = new JButton("Finalizar");
        finalizar.setBounds(105, 320, 90, 30);
        finalizar.setFont(new Font("Times New Roman", 1, 13));
        finalizar.addActionListener(this);
        add(finalizar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == finalizar) {
            Operaciones.interfazOperaciones();
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
