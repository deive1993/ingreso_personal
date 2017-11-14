/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controlador.*;
import java.awt.Event.*;
import java.awt.GridLayout;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

/**
 *
 * @author USER
 */
public class Personal extends JFrame {

    private JButton ingresar = new JButton("INGRESAR ");
    private JButton modificar = new JButton("MODIFICAR");
    private JButton cancelar = new JButton("CANCELAR");
    private JButton limpiar = new JButton("LIMPIAR");
    private JLabel lblnombre = new JLabel("NOMBRES : ");
    private JLabel lblapellido = new JLabel("APELLIDOS: ");
    private JLabel lbldireccion = new JLabel("DIRECCION");
    private JLabel lblcelular = new JLabel("CELULAR");
    private JLabel lbldni = new JLabel("DNI");
    private JLabel lblemail = new JLabel("EMAIL");
    private JTextField txtnombre = new JTextField("");
    private JTextField txtapellido = new JTextField("");
    private JTextField txtdireccion = new JTextField("");
    private JTextField txtcelular = new JTextField("");
    private JTextField txtdni = new JTextField("");
    private JTextField txtemail = new JTextField("");
    
    //arraylist 
    private ArrayList<String> personaIngresado = new ArrayList<String>();
    private JList<String> unaLista = new JList<String>();

    private JList<String>listaPersonal = new JList<String>();
    
    private GridLayout contenedor = new GridLayout(5,4);
    
    private ControladorCancelar controladorCancelar = new ControladorCancelar();
    private ControladorRegistrar controladorIngresar = new ControladorRegistrar(txtapellido,txtcelular,txtcelular,txtdireccion,txtdni,txtemail,txtnombre,personaIngresado,listaPersonal);
    private ControladorLimpiar controladorLimpiar = new ControladorLimpiar(txtapellido,txtcelular,txtcelular,txtdireccion,txtdni,txtemail,txtnombre);
    private ControladorModificar controladorModificar = new ControladorModificar();
    private ControladorwindowsPersonal controladorwindowsPersonal = new ControladorwindowsPersonal();
    
    public Personal(){
        
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setTitle("PERSONAL");
        this.setLocation(300, 300);
        this.setSize(900, 300);
        this.setVisible(true);
        this.contenedor.setHgap(20);
        this.contenedor.setVgap(20);
       
        this.cancelar.setAlignmentX(TOP_ALIGNMENT);
        this.ingresar.addMouseListener(controladorIngresar);
        this.limpiar.addMouseListener(controladorLimpiar);
        this.addWindowListener((WindowListener) controladorwindowsPersonal);
    }

    private void agregarComponentes() {

        this.add(lblnombre);
        this.add(txtnombre);
        this.add(lblapellido);
        this.add(txtapellido);
        this.add(lbldni);
        this.add(txtdni);
        this.add(lbldireccion);
        this.add(txtdireccion);
        this.add(lblcelular);
        this.add(txtcelular);
        this.add(lblemail);
        this.add(txtemail);
        this.add(ingresar);
        this.add(modificar);
        this.add(cancelar);
        this.add(limpiar);
        this.add(listaPersonal);
        
    }
    
       void bloquear(){
        txtnombre.setEnabled(false);
        txtapellido.setEnabled(false);
        txtdni.setEnabled(false);
        txtdireccion.setEnabled(false);
        txtcelular.setEnabled(false);
        txtemail.setEnabled(false);
        ingresar.setEnabled(true);
        modificar.setEnabled(false);
        cancelar.setEnabled(false);
        limpiar.setEnabled(false);
    }
    
    
    
    
         void desbloquear(){
        txtnombre.setEnabled(true);
        txtapellido.setEnabled(true);
        txtdni.setEnabled(true);
        txtdireccion.setEnabled(true);
        ingresar.setEnabled(false);
        modificar.setEnabled(true);
        cancelar.setEnabled(true);
    }
}
