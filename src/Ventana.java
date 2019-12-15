import pestanias.*;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    Container container;
    PestaniaAltas pestaniaAltas;
    PestaniaBajas pestaniaBajas;
    PestaniaModificaciones pestaniaModificaciones;
    PestaniaResumen pestaniaResumen;
    JTabbedPane panelPestanias;


    public void initGUI(){
        instancias();
        configurarContainer();
        acciones();
        //this.setSize(new Dimension(300,300));

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        pack();
    }

    private void acciones() {

    }

    private void instancias() {
        panelPestanias = new JTabbedPane(SwingConstants.TOP);
        container = this.getContentPane();
        pestaniaAltas = new PestaniaAltas();
        pestaniaBajas = new PestaniaBajas();
        pestaniaModificaciones = new PestaniaModificaciones();
        pestaniaResumen = new PestaniaResumen();
    }
    private void configurarContainer() {
        container.add(panelPestanias);
        panelPestanias.addTab("Altas", pestaniaAltas);
        panelPestanias.addTab("Bajas", pestaniaBajas);
        panelPestanias.addTab("Modificaciones", pestaniaModificaciones);
        panelPestanias.addTab("Resumen", pestaniaResumen);

    }
}
