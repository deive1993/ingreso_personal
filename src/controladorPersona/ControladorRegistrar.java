/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conectar;
import java.awt.event.ActionEvent.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ControladorRegistrar implements MouseListener{
    
    private JTextField txtnombre;
    private JTextField txtapellido;
    private JTextField txtdireccion;
    private JTextField txtcelular;
    private JTextField txtdni;
    private JTextField txtemail;
    private ArrayList<String>personaIngresado;
    private JList<String>listaPersonal;

    public ControladorRegistrar(JTextField txtapellido, JTextField txtcelular, JTextField txtcelular0, JTextField txtdireccion, JTextField txtdni, JTextField txtemail, JTextField txtnombre, ArrayList<String> personalIngresado, JList<String> listaPersonal) {
        this.txtnombre = txtnombre;
        this.txtapellido = txtapellido;
        this.txtdireccion = txtdireccion;
        this.txtcelular = txtcelular;
        this.txtdni = txtdni;
        this.txtemail = txtemail;
        this.personaIngresado = personalIngresado;
        this.listaPersonal = listaPersonal;
        
    }
    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {                                      
        txtnombre.transferFocus();
    }      
    
    @Override
    public void mouseClicked(MouseEvent e) {
        personaIngresado.add(txtapellido.getText());
        personaIngresado.add(txtnombre.getText());
        personaIngresado.add(txtdireccion.getText());
        personaIngresado.add(txtcelular.getText());
        personaIngresado.add(txtdni.getText());
        personaIngresado.add(txtemail.getText());
        
        String[]data = (String[])personaIngresado.toArray(new String[personaIngresado.size()]);
        listaPersonal.setListData(data);
        
         Conectar conn = new Conectar();
    }

            
    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
