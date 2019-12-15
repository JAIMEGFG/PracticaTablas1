package pestanias;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PestaniaResumen extends JPanel implements ActionListener {

    JLabel clave,nombre,apellidos,edad,calle,numero,codigoPostal;
    JTextField  nombreText, apellidoText, edadText,claveText, calleText,numeroText,codigoPostalText;
    JTable tabla;
    DefaultTableModel modelo;
    JButton darAlta,darBaja;
    TitledBorder datos;
    JPanel panelCentro,panelInferior,panelTabla;

    public PestaniaResumen() {

        initGUI();
    }

    public void initGUI(){
        instancias();
        configurarPanel();
        acciones();
    }

    private void instancias() {

        nombre = new JLabel("Nombre: ");
        clave = new JLabel("Clave ");
        apellidos = new JLabel("Apellidos: ");
        edad = new JLabel("Edad: ");
        calle = new JLabel("Calle: ");
        numero = new JLabel("Número: ");
        codigoPostal = new JLabel("Codigo Postal: ");
        nombreText = new JTextField();
        claveText = new JTextField();
        apellidoText = new JTextField();
        edadText = new JTextField();
        calleText = new JTextField();
        numeroText = new JTextField();
        codigoPostalText = new JTextField();
        darAlta = new JButton("Dar de Alta");
        darBaja = new JButton("Dar de Baja");
        panelCentro = new JPanel();
        panelInferior= new JPanel();
        panelTabla= new JPanel();
        datos = new TitledBorder("Datos");

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
        configurarConstraint(0,0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.3,0.3,1,1,configurarPanelTabla());
        configurarConstraint(0,1,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.3,0.3,1,1,configurarCentro());
        configurarConstraint(0,2,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.3,0.3,1,1,configurarInferior());

        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(tabla), BorderLayout.NORTH);
        this.add(configurarCentro(), BorderLayout.CENTER);
        this.add(configurarInferior(), BorderLayout.SOUTH);


    }
    private JPanel configurarPanelTabla() {
        String [] columnas =  {"Nombre", "Apellido", "Telefono"};

        Object [][] datosT = {   {"Nombre 1", "Apellido 1", 111},
                {"Nombre 2", "Apellido 2", 212},
                {"Nombre 3", "Apellido 3", 333}};

        modelo = new DefaultTableModel(datosT, columnas);
        // Se crea la tabla pasandole el modelo
        tabla = new JTable(modelo);
        return panelTabla;
    }


    private JPanel configurarCentro() {
        panelCentro.setLayout(new GridLayout(7,2,40,5));
        panelCentro.setBorder(datos);
        panelCentro.add(clave);
        panelCentro.add(claveText);
        panelCentro.add(nombre);
        panelCentro.add(nombreText);
        panelCentro.add(apellidos);
        panelCentro.add(apellidoText);
        panelCentro.add(edad);
        panelCentro.add(edadText);
        panelCentro.add(calle);
        panelCentro.add(calleText);
        panelCentro.add(numero);
        panelCentro.add(numeroText);
        panelCentro.add(codigoPostal);
        panelCentro.add(codigoPostalText);

        return panelCentro;
    }
    private JPanel configurarInferior() {
        panelInferior.add(darAlta);
        panelInferior.add(darBaja);
        return panelInferior;
    }

    private void acciones() {

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
