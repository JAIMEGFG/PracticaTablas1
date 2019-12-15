package pestanias;

import utils.Persona;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PestaniaBajas extends JPanel implements ActionListener {
    JLabel labelClave,nombre,apellidos,edad,calle,numero,codigoPostal;
    JComboBox clave;
    DefaultComboBoxModel modeloCombo;
    JTextField  nombreText, apellidoText, edadText;
    JTextArea calleText,numeroText,codigoPostalText;
    JButton darBaja;
    JPanel panelclave,panelInferior,panelCentro,panelSuperior;
    TitledBorder datosPersonales,direccion,seleccionClave;

    public PestaniaBajas() {

        initGUI();
    }

    public void initGUI(){
        instancias();
        configurarPanel();
        configurarModeloCombo();
        acciones();
    }

    private void acciones() {

    }

    private void configurarModeloCombo() {
        modeloCombo.addElement(new Persona("Nombre 1","a","calle",
                "clave",18,12,28033));
        modeloCombo.addElement(new Persona("Nombre 2","b","123",
                "clave",15,319,2800));
    }


    private void instancias() {
        datosPersonales = new TitledBorder("Datos Personales");
        modeloCombo = new DefaultComboBoxModel();
        clave = new JComboBox(modeloCombo);
        labelClave = new JLabel("Clave");
        seleccionClave = new TitledBorder("Seleccion Clave");
        nombre = new JLabel("Nombre: ");
        apellidos = new JLabel("Apellidos: ");
        edad = new JLabel("Edad: ");
        direccion = new TitledBorder("Direccion");
        calle = new JLabel("Calle: ");
        numero = new JLabel("Número: ");
        codigoPostal = new JLabel("Codigo Postal: ");
        nombreText = new JTextField();
        apellidoText = new JTextField();
        edadText = new JTextField();
        calleText = new JTextArea();
        numeroText = new JTextArea();
        codigoPostalText = new JTextArea();
        darBaja = new JButton("Dar de Baja");
        panelInferior = new JPanel();
        panelSuperior = new JPanel();
        panelclave = new JPanel();
        panelCentro = new JPanel();
    }

    public void configurarConstraint(int posX, int posY,int fill, int anchor
            ,double pesX, double pesY, int tamX, int tamY, JComponent component){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = posX;
        constraints.gridy = posY;
        constraints.fill = fill ;
        constraints.anchor= anchor;
        constraints.weightx = pesX;
        constraints.weighty = pesY;
        constraints.gridwidth= tamX;
        constraints.gridheight= tamY;
        add(component,constraints);
    }

    private void configurarPanel() {

        this.setLayout(new GridBagLayout());
        configurarConstraint(0,0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.3,0.3,1,1,configurarPanelClave());
        configurarConstraint(0,1,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.3,0.3,1,1,configurarPanelArriba());
        configurarConstraint(0,2,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.3,0.3,1,1,configurarPanelCentro());
        configurarConstraint(0,3,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0,0,1,1,configurarPanelAbajo());

    }

    private JPanel configurarPanelClave() {
        panelclave.setBorder(BorderFactory.createTitledBorder("Selección clave"));
        panelclave.setLayout(new GridLayout(1,2));
        panelclave.add(new JLabel("Clave: "));
        panelclave.add(clave);
        return panelclave;
    }

    private JPanel configurarPanelArriba(){
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Datos Personales"));
        panelSuperior.setLayout(new GridLayout(3,2,5,5));
        panelSuperior.add(nombre);
        panelSuperior.add(nombreText);
        panelSuperior.add(apellidos);
        panelSuperior.add(apellidoText);
        panelSuperior.add(edad);
        panelSuperior.add(edadText);
        return panelSuperior;
    }

    private JPanel configurarPanelCentro(){
        panelCentro.setBorder(BorderFactory.createTitledBorder("Dirección"));
        panelCentro.setLayout(new GridLayout(3,2,5,5));
        panelCentro.add(calle);
        panelCentro.add(calleText);
        panelCentro.add(numero);
        panelCentro.add(numeroText);
        panelCentro.add(codigoPostal);
        panelCentro.add(codigoPostalText);
        return panelCentro;
    }

    private JPanel configurarPanelAbajo(){
        panelInferior.add(darBaja);
        return panelInferior;
    }



    @Override
    public void actionPerformed(ActionEvent e) {



    }

    public void añadirPersona(String clave) {
        System.out.println(clave);
        //modelocombobox.addElement(clave);
    }
}