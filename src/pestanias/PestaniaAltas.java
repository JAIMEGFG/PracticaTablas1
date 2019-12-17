package pestanias;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.GRAY;

public class PestaniaAltas extends JPanel implements ActionListener {
    JLabel clave,nombre,apellidos,edad,calle,numero,codigoPostal;
    JTextField claveText, nombreText, apellidoText, edadText;
    JTextArea calleText,numeroText,codigoPostalText;
    JButton darAlta;
    JPanel panelSuperior,panelInferior,panelCentro;
    TitledBorder datosPersonales,direccion;

    public PestaniaAltas() {

        initGUI();
    }

    public void initGUI(){
        instancias();
        configurarContainer();
        acciones();
    }


    private void instancias() {
        datosPersonales = new TitledBorder("Datos Personales");
        clave = new JLabel("Clave: ");
        nombre = new JLabel("Nombre: ");
        apellidos = new JLabel("Apellidos: ");
        edad = new JLabel("Edad: ");
        direccion = new TitledBorder("Direccion");
        calle = new JLabel("Calle: ");
        numero = new JLabel("Número: ");
        codigoPostal = new JLabel("Codigo Postal: ");
        claveText = new JTextField();
        nombreText = new JTextField();
        apellidoText = new JTextField();
        edadText = new JTextField();
        calleText = new JTextArea();
        numeroText = new JTextArea();
        codigoPostalText = new JTextArea();
        darAlta = new JButton("Dar de Alta");
        panelInferior = new JPanel();
        panelSuperior = new JPanel();
        panelCentro = new JPanel();
    }

    private void configurarContainer() {
        this.setLayout(new BorderLayout());
        this.add(configurarSuperior(), BorderLayout.NORTH);
        this.add(configurarCentro(),BorderLayout.CENTER);
        this.add(configurarInferior(),BorderLayout.SOUTH);
    }

    private JPanel configurarSuperior() {
        panelSuperior.setLayout(new GridLayout(4,2,40,5));
        panelSuperior.setBorder(datosPersonales);
        panelSuperior.add(clave);
        panelSuperior.add(claveText);
        panelSuperior.add(nombre);
        panelSuperior.add(nombreText);
        panelSuperior.add(apellidos);
        panelSuperior.add(apellidoText);
        panelSuperior.add(edad);
        panelSuperior.add(edadText);

        return panelSuperior;
    }
    private JPanel configurarCentro() {
        panelCentro.setLayout(new GridLayout(3,2,40,10));
        panelCentro.setBorder(direccion);
        panelCentro.add(calle);
        panelCentro.add(calleText);
        panelCentro.add(numero);
        panelCentro.add(numeroText);
        panelCentro.add(codigoPostal);
        panelCentro.add(codigoPostalText);
        panelCentro.add(configurarInferior(),BorderLayout.SOUTH);

        return panelCentro;
    }
    private JPanel configurarInferior() {
        panelInferior.add(darAlta);
        return panelInferior;
    }


    private void acciones() {
        darAlta.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == darAlta) {
            if (claveText.getText().isEmpty() ||
                    nombreText.getText().isEmpty() ||
                    apellidoText.getText().isEmpty() ||
                    edadText.getText().isEmpty() ||
                    calleText.getText().isEmpty() ||
                    numeroText.getText().isEmpty() ||
                    codigoPostalText.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Mensaje WARNING",
                        "El campo está vacío", JOptionPane.INFORMATION_MESSAGE, null);
            } else {
                String nombre = nombreText.getText();
                String apellido = apellidoText.getText();
                String clave = claveText.getText();
                String calle = calleText.getText();
                int numero = Integer.valueOf(numeroText.getText());
                int edad = Integer.valueOf(edadText.getText());
                int cp = Integer.valueOf(codigoPostalText.getText());
            }
        }
    }
}
