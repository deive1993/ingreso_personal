/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ControladorLimpiar implements MouseListener{
   
    private JTextField txtnombre;
    private JTextField txtapellido;
    private JTextField txtdireccion;
    private JTextField txtcelular;
    private JTextField txtdni;
    private JTextField txtemail;

    public ControladorLimpiar(JTextField txtapellido, JTextField txtcelular, JTextField txtcelular0, JTextField txtdireccion, JTextField txtdni, JTextField txtemail, JTextField txtnombre) {
        this.txtnombre = txtnombre;
        this.txtapellido = txtapellido;
        this.txtdireccion = txtdireccion;
        this.txtcelular = txtcelular;
        this.txtdni = txtdni;
        this.txtemail = txtemail;    }

    @Override
    public void mouseClicked(MouseEvent e) {
        txtnombre.setText("");
        txtapellido.setText("");
        txtdireccion.setText("");
        txtcelular.setText("");
        txtdni.setText("");
        txtcelular.setText("");
        txtnombre.grabFocus();
        
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
