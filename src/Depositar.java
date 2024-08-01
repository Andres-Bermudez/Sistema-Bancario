import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Depositar extends JFrame implements ActionListener {

    private final JLabel dineroDeposito;
    private final JTextField cantidad;
    private final JButton depositar, cancelar;

    protected Depositar() {
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == depositar) {
            String dineroIngresado = cantidad.getText().trim();

            if (dineroIngresado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debes ingresar una suma de dinero");

            } else {
                int valorDineroIngresado = Integer.parseInt(dineroIngresado);

                if (valorDineroIngresado > 0) {
                    int saldoFinal = DatosUsuario.getDineroUsuario() + valorDineroIngresado;
                    
                    DatosUsuario.setDineroUsuario(saldoFinal);

                    JOptionPane.showMessageDialog(null, "¡Deposito finalizado con exito!");

                    Operaciones ventanaOperaciones = new Operaciones();
                    ventanaOperaciones.setBounds(0, 0, 350, 500);
                    ventanaOperaciones.setResizable(false);
                    ventanaOperaciones.setLocationRelativeTo(null);
                    ventanaOperaciones.setVisible(true);

                    this.setVisible(false);

                } else if (valorDineroIngresado == 0) {
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

    protected static void interfazDepositarDinero() {
        Depositar ventanaDepositar = new Depositar();
        ventanaDepositar.setBounds(0, 0, 300, 250);
        ventanaDepositar.setResizable(false);
        ventanaDepositar.setLocationRelativeTo(null);
        ventanaDepositar.setVisible(true);
    }
}
