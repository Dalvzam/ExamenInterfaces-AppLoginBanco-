
/*
 * 
 * author: Dalzam
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    public Ventana() {
        super("Aplicación del Banco");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(393, 852);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }

    public void run() {
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new GridBagLayout());

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

        JPanel panelInterfaz1 = new JPanel();
        panelInterfaz1.setLayout(new GridLayout(4, 1));
        panelInterfaz1.add(panelTitulo);
        panelInterfaz1.add(panelTextos);
        panelInterfaz1.add(panelBotones);
        add(panelInterfaz1);

        add(panelInterfaz1, BorderLayout.CENTER);
        botonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                // Comprobar usuario y contraseña que serán USER: 12345678 PASSWORD: abc4567?
                if (textFieldUsuario.getText().equals("12345678")
                        && passwordFieldContraseña.getText().equals("abc4567?")) {
                    // System.out.println("potato");
                    // Primer panel ocultado
                    panelInterfaz1.setVisible(false);

                    // -------------------------------------------------------------MOSTRAR EL SEGUNDO PANEL-------------------------------------------------

                    // Panel del titulo
                    JPanel panelTitulo2 = new JPanel();
                    panelTitulo2.setLayout(new GridBagLayout());
                    JLabel labelTitulo2 = new JLabel("Bienvenido, " + textFieldUsuario.getText());
                    labelTitulo2.setForeground(Color.WHITE);
                    panelTitulo2.add(labelTitulo2, new GridBagConstraints());
                    panelTitulo2.setBackground(Color.RED);

                    // Panel gestion de banca
                    JPanel panelGestionBanca = new JPanel();
                    panelGestionBanca.setLayout(new GridLayout(3, 2));

                    ImageIcon imagenInicial = new ImageIcon("src//Images//1.png");
                    Image imagenGrande = imagenInicial.getImage();
                    imagenGrande = imagenGrande.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
                    imagenInicial = new ImageIcon(imagenGrande);

                    JButton botonInicio = new JButton("Inicio", imagenInicial);
                    panelGestionBanca.add(botonInicio);
                    botonInicio.setBackground(Color.WHITE);
                    JButton botonAcciones = new JButton("Acciones", imagenInicial);
                    panelGestionBanca.add(botonAcciones);
                    botonAcciones.setBackground(Color.WHITE);
                    JButton botonTarjeta = new JButton("Tarjeta", imagenInicial);
                    panelGestionBanca.add(botonTarjeta);
                    botonTarjeta.setBackground(Color.WHITE);
                    JButton botonTransferencia = new JButton("Transferencia", imagenInicial);
                    panelGestionBanca.add(botonTransferencia);
                    botonTransferencia.setBackground(Color.WHITE);
                    JButton botonInversiones = new JButton("Inversiones", imagenInicial);
                    panelGestionBanca.add(botonInversiones);
                    botonInversiones.setBackground(Color.WHITE);
                    JButton botonAjustes = new JButton("Ajustes", imagenInicial);
                    panelGestionBanca.add(botonAjustes);
                    botonAjustes.setBackground(Color.WHITE);

                    // Implementacion de la interfaz
                    JPanel panelInterfaz2 = new JPanel();
                    panelInterfaz2.setLayout(new GridLayout(3, 1));
                    panelInterfaz2.add(panelTitulo2);
                    panelInterfaz2.add(panelGestionBanca);

                    add(panelInterfaz2);

                    botonTarjeta.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                            // Desaparezco la segunda interfaz
                            panelInterfaz2.setVisible(false);

                            // -------------------------------------------------------------MOSTRAR EL TERCER PANEL-------------------------------------------------

                            // Panel del titulo
                            JPanel panelTitulo3 = new JPanel();
                            panelTitulo3.setLayout(new GridBagLayout());

                            ImageIcon imageIcon = new ImageIcon("src//Images//FlechaAtras.png");
                            Image imageAtras = imageIcon.getImage();
                            imageAtras = imageAtras.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                            JButton botonFlechaAtras = new JButton(new ImageIcon(imageAtras));
                            botonFlechaAtras.setBackground(Color.RED);
                            botonFlechaAtras.setAlignmentX(Component.LEFT_ALIGNMENT);
                            panelTitulo3.add(botonFlechaAtras);

                            JLabel labelTitulo3 = new JLabel("Bienvenido, " + textFieldUsuario.getText());
                            labelTitulo3.setForeground(Color.WHITE);
                            panelTitulo3.add(labelTitulo3, new GridBagConstraints());
                            panelTitulo3.setBackground(Color.RED);
                            // El texto se deja de color negro por motivos de legibilidad ya que el texto anterior es blanco
                            JLabel labelTituloDinero = new JLabel(" $ 3.490.79");
                            panelTitulo3.add(labelTituloDinero);

                            // Panel de la imagen de la tarjeta
                            JPanel panelTarjeta = new JPanel();
                            ImageIcon imagenInicial = new ImageIcon("src//Images//2.jpg");
                            Image imagenGrande = imagenInicial.getImage();
                            imagenGrande = imagenGrande.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
                            imagenInicial = new ImageIcon(imagenGrande);

                            JLabel labelImagenTarjeta = new JLabel(imagenInicial);
                            panelTarjeta.add(labelImagenTarjeta);

                            // Panel del titulo de las transacciones
                            JPanel panelTituloTransferencias = new JPanel();
                            panelTituloTransferencias.setLayout(new GridLayout());
                            JLabel labelTransaccionesBancarias = new JLabel("Últimas Transacciones", JLabel.LEFT);
                            panelTituloTransferencias.add(labelTransaccionesBancarias);

                            // Panel general de las transacciones
                            JPanel panelTransaccionesBancarias = new JPanel();
                            panelTransaccionesBancarias.setLayout(new GridLayout(3, 1));

                            // Paneles de las transacciones
                            JPanel panelTransaccionesBancarias1 = new JPanel();
                            panelTransaccionesBancarias1.setBackground(Color.WHITE);
                            JPanel panelTransaccionesBancarias2 = new JPanel();
                            panelTransaccionesBancarias2.setBackground(Color.WHITE);
                            JPanel panelTransaccionesBancarias3 = new JPanel();
                            panelTransaccionesBancarias3.setBackground(Color.WHITE);

                            ImageIcon imagenInicial2 = new ImageIcon("src//Images//3.png");
                            Image imagenGrande2 = imagenInicial2.getImage();
                            imagenGrande2 = imagenGrande2.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                            imagenInicial2 = new ImageIcon(imagenGrande2);
                            JLabel labelImagenFlechaArriba = new JLabel(imagenInicial2);
                            JLabel labelImagenFlechaArriba2 = new JLabel(imagenInicial2);
                            JLabel labelImagenFlechaArriba3 = new JLabel(imagenInicial2);
                            //
                            panelTransaccionesBancarias1.add(labelImagenFlechaArriba);
                            JLabel labelNombre1 = new JLabel("John Doe");
                            panelTransaccionesBancarias1.add(labelNombre1);
                            panelTransaccionesBancarias1.add(new JLabel(
                                    "                                                                       "));
                            panelTransaccionesBancarias1.add(new JLabel("$ 123,00"));
                            panelTransaccionesBancarias.add(panelTransaccionesBancarias1);
                            //
                            panelTransaccionesBancarias2.add(labelImagenFlechaArriba2);
                            JLabel labelNombre2 = new JLabel("John Doe");
                            panelTransaccionesBancarias2.add(labelNombre2);
                            panelTransaccionesBancarias2.add(new JLabel(
                                    "                                                                       "));
                            panelTransaccionesBancarias2.add(new JLabel("$ 123,00"));
                            panelTransaccionesBancarias.add(panelTransaccionesBancarias2);
                            //
                            panelTransaccionesBancarias3.add(labelImagenFlechaArriba3);
                            JLabel labelNombre3 = new JLabel("John Doe");
                            panelTransaccionesBancarias3.add(labelNombre3);
                            panelTransaccionesBancarias3.add(new JLabel(
                                    "                                                                       "));
                            panelTransaccionesBancarias3.add(new JLabel("$ 123,00"));
                            panelTransaccionesBancarias.add(panelTransaccionesBancarias3);

                            JPanel panelTransacciones = new JPanel();
                            panelTransacciones.setLayout(new GridLayout(2, 1));
                            panelTransacciones.add(panelTituloTransferencias);
                            panelTransacciones.add(panelTransaccionesBancarias);

                            // Implementacion de la interfaz
                            JPanel panelInterfaz3 = new JPanel();
                            panelInterfaz3.setLayout(new GridLayout(4, 1));
                            panelInterfaz3.add(panelTitulo3);
                            panelInterfaz3.add(panelTarjeta);
                            panelInterfaz3.add(panelTransacciones);

                            add(panelInterfaz3);

                            botonFlechaAtras.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent arg0) {
                                    // Desaparezco la interfaz 3
                                    panelInterfaz3.setVisible(false);

                                    // Aparezco la interfaz 2
                                    panelInterfaz2.setVisible(true);
                                }
                            });
                        }
                    });

                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Datos introducidos no son correctos");
                    textFieldUsuario.setText(null);
                    passwordFieldContraseña.setText(null);
                }

            }
        });
        // Mostrar la ventana
        setVisible(true);
    }

}
