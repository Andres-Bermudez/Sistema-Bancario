import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ConfirmarTransaccion extends JFrame implements ActionListener {
    private final JLabel confirmaContraseña;
    private final JTextField confirmandoContraseña;
    private final JButton completar;
    
    protected ConfirmarTransaccion() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("|| Confirmar Contraseña ||");
        
        confirmaContraseña = new JLabel("Confirma tu contraseña:");
        confirmaContraseña.setBounds(35, 70, 200, 30);
        confirmaContraseña.setFont(new Font("Times New Roman", 1, 14));
        add(confirmaContraseña);
        
        confirmandoContraseña = new JTextField();
        confirmandoContraseña.setBounds(35, 120, 180, 30);
        add(confirmandoContraseña);
        
        completar = new JButton("Completar");
        completar.setBounds(70, 180, 110, 30);
        completar.setFont(new Font("Times New Roman", 1, 13));
        completar.addActionListener(this);
        add(completar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == completar) {
            String contraseñaIngresada = confirmandoContraseña.getText();
            
            if (contraseñaIngresada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Debes ingresar tu contraseña!");
            
            } else if (!contraseñaIngresada.equals(DatosUsuario.getContraseñaUsuario())) {
                JOptionPane.showMessageDialog(null, "¡Contraseña Incorrecta!"); 
            
            } else {
                DatosUsuario.setDineroUsuario(DatosUsuario.getDineroUsuario() - Retirar.dineroARetirar);
                RetiroRealizado.interfazRetiroRealizado();
                this.setVisible(false);
            }
        }
    }
    
    protected static void interfazConfirmacionDatos() {
        ConfirmarTransaccion ventanaConfirmarContraseña = new ConfirmarTransaccion();
        ventanaConfirmarContraseña.setBounds(0, 0, 250, 300);
        ventanaConfirmarContraseña.setResizable(false);
        ventanaConfirmarContraseña.setLocationRelativeTo(null);
        ventanaConfirmarContraseña.setVisible(true);
    }
}
