/*
 * 
 * author: Dalzam
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana2 extends JFrame{
    public Ventana2() {
        super("Aplicación del Banco");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(393, 852);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }

    public void run() {
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout( new GridBagLayout() );

        JLabel labelTitulo = new JLabel("BANK");
        labelTitulo.setForeground(Color.WHITE);
        panelTitulo.add(labelTitulo, new GridBagConstraints());
        panelTitulo.setBackground(Color.RED);

        JPanel panelTextos = new JPanel();
        panelTextos.setLayout(new GridLayout(4, 1, 10, 10));
        JLabel userLabel = new JLabel("User");
        panelTextos.add(userLabel);
        JTextField textFieldUsuario = new JTextField();
        panelTextos.add(textFieldUsuario);
        JLabel passwordLabel = new JLabel("Password");
        panelTextos.add(passwordLabel);
        JPasswordField passwordFieldContraseña = new JPasswordField(1);
        passwordFieldContraseña.setHorizontalAlignment(JTextField.CENTER);
        panelTextos.add(passwordFieldContraseña);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        JButton botonLogin = new JButton("Login");
        panelBotones.add(botonLogin);
        JButton botonRecuperarPassword = new JButton("Recuperar Password");
        panelBotones.add(botonRecuperarPassword);


        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(4, 1));
        panelCenter.add(panelTitulo);
        panelCenter.add(panelTextos);
        panelCenter.add(panelBotones);








        setVisible(true);
    }
}
